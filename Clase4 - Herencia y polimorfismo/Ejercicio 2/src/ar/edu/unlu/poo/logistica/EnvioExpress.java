package ar.edu.unlu.poo.logistica;

public class EnvioExpress extends Envio{
    private double costoFijoEnvio;
    private double tarifaExpress;

    public EnvioExpress(double peso, double distancia) {
        super(peso, distancia);
        this.costoFijoEnvio = 500;
        this.tarifaExpress = (90/distancia) + costoFijoEnvio;
    }

    @Override
    public double calculoCosto() {
        double costoEnvio = super.calculoCosto();

        return costoEnvio;
    }
}
