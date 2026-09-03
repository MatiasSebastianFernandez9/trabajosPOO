package ar.edu.unlu.alumno.temperatura;

public class Temperatura
{
    private double temperatura;

    public Temperatura(double unaTemperatura) {
        double ceroAbosuluto = -273.15;

        if (unaTemperatura >= ceroAbosuluto){
            temperatura = unaTemperatura;
        }else{
            throw new IllegalArgumentException();
        }

    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double unaTemperatura) {
        temperatura = unaTemperatura;
    }

    public double toFarenheit(){
        return temperatura/(9/5)+32;

    }
}
