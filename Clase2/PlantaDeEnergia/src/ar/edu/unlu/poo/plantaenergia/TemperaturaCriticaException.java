package ar.edu.unlu.poo.plantaenergia;

//Extends permite heredar una clase¿
public class TemperaturaCriticaException extends RuntimeException {
    public TemperaturaCriticaException(String message) {
        super(message);
    }
}
