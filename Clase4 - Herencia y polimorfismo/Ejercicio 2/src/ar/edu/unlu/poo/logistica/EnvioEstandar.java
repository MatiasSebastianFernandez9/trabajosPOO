package ar.edu.unlu.poo.logistica;

public class EnvioEstandar extends Envio{
    private double tarifaEstandar;

    public EnvioEstandar(double peso, double distancia) {
        super(peso, distancia);
        this.tarifaEstandar = 50;
    }

    @Override
    public double calculoCosto() {
        double costoEnvio = super.calculoCosto();

        if(this.pesoEnvio > 10) costoEnvio = costoEnvio * 1.2;

        return costoEnvio;
    }
}
