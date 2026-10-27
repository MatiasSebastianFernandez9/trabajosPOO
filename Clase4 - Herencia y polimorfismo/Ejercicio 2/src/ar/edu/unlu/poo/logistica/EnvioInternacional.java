package ar.edu.unlu.poo.logistica;

public class EnvioInternacional extends Envio{
    private double tarifaInternacional;

    public EnvioInternacional(double peso, double distancia) {
        super(peso, distancia);
        this.tarifaInternacional = 50;
    }

    @Override
    public double calculoCosto() {
        double costoEnvio = super.calculoCosto();

        if(this.pesoEnvio > 10) costoEnvio = costoEnvio * 1.2;

        costoEnvio = costoEnvio + 1.2;

        return costoEnvio;
    }
}
