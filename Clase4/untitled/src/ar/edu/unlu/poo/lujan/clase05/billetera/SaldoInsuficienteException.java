package ar.edu.unlu.poo.lujan.clase05.billetera;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
