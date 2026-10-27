package ar.edu.unlu.poo.lujan.clase05.billetera;

public class Cuenta {
    //FINAL => SIGNIFICA QUE NO PUEDE MODIFICARSE
    private final String divisa;
    private double saldo;

    public Cuenta(String unaDivisa) {
        if(unaDivisa == null || unaDivisa.trim().isEmpty()){
            throw new IllegalArgumentException("NO SE ADMITE DIVISA VACIA");
        }
        unaDivisa.trim().toUpperCase();
        divisa = unaDivisa;
        saldo = 0.0;
    }

    public String getDivisa() {
        return divisa;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double unMonto) {
        if(unMonto <= 0) throw new IllegalArgumentException("El monto a depositar debe ser positivo");

        return saldo+=unMonto;
    }

    public double extraer(int unMonto) {
        if(unMonto <= 0) throw new IllegalArgumentException("El monto a extraer debe ser positivo");
        if(unMonto > saldo) throw new SaldoInsuficienteException("Saldo insuficiente para completar la operacion");

        return saldo-=unMonto;
    }
}
