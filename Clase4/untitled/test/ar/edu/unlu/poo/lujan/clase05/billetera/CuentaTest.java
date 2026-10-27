package ar.edu.unlu.poo.lujan.clase05.billetera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CuentaTest {
    private Cuenta cuenta;

    @BeforeEach
    public void setUP(){
        cuenta = new Cuenta("ARS");
    }

    @Test
    public void testCrearCuenta_saldoInicialCero(){

        Cuenta cuenta2 = new Cuenta("USD");

        assertEquals(0.0, cuenta.getSaldo());
        assertEquals("ARS", cuenta.getDivisa());
        assertEquals(0.0, cuenta2.getSaldo());
        assertEquals("USD", cuenta2.getDivisa());
    }

    @Test
    public void testDepositar_montosValidosEInvalidos(){

        //MONTOS VALIDOS
        cuenta.depositar(50);
        assertEquals(50,cuenta.getSaldo());

        //MONTOS INVALIDOS
        assertThrows(IllegalArgumentException.class, new Executable(){
            @Override
            public void execute(){
                cuenta.depositar(0);
            }
        });
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-5));
    }

    @Test
    public void testExtraer_SaldoSuficienteEInsuficiente(){
        cuenta.depositar(1000);

        cuenta.extraer(400);
        assertEquals(600,cuenta.getSaldo());

        assertThrows(IllegalArgumentException.class, () -> cuenta.extraer(-1000));
        assertThrows(SaldoInsuficienteException.class, () -> cuenta.extraer(1000));
    }


}