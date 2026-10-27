package ar.edu.unlu.poo.logistica;

public class Envio {
    protected double pesoEnvio;
    protected double distanciaEnvio;
    protected double tarifaEnvio;

    public Envio(double peso, double distancia) {
        this.pesoEnvio = peso;
        this.distanciaEnvio = distancia;
    }

    public double getPesoEnvio() { return pesoEnvio; }

    public double getDistanciaEnvio() { return distanciaEnvio; }

    public double calculoCosto() { return distanciaEnvio * tarifaEnvio; }
}
