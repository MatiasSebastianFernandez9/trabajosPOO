package ar.edu.unlu.poo.lujan.clase05.billetera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BilleteraTest {

    @Test
    public void testAbrirCuenta_saldoInicialCero(){
        Billetera billetera = new Billetera();
        billetera.abrirCuenta("ARG");
        assertEquals(0.0, billetera.getSaldo("ARG"));
    }

    @Test
    public void testDepositarYExtraer_montoValidoActualizaSaldo(){
        Billetera billetera = new Billetera();
        billetera.abrirCuenta("ARG");
        billetera.depositar("ARS", 50);
        billetera.extraer("ARS", 50);

        assertEquals(50, billetera.getSaldo("ARS"));
        assertEquals(0, billetera.getSaldo("ARS"));
    }
}
