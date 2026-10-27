package ar.edu.unlu.poo.labo1.artefactos;

import java.util.Objects;

public class Artefacto {
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String unNombre, int unPoder, String unTipo){
        nombre = unNombre;
        poder = unPoder;
        tipo = unTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null && getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public  int hashCode(){
        return Objects.hash(nombre);
    }
}
