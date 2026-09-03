package ar.edu.unlu.alumno.temperatura;

public class Main {
    public static void main() {

        try{
            Temperatura unaTemperatura = new Temperatura(-1115);
            System.out.println(unaTemperatura.getTemperatura());
        }catch(Exception e){
            System.out.println("Invalido");
        }

        Temperatura unaTemperaturaEnFarenheit = new Temperatura(20);

        System.out.println(unaTemperaturaEnFarenheit.getTemperatura());
        System.out.println(unaTemperaturaEnFarenheit.toFarenheit());

    }

}