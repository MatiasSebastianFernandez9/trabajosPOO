package ar.edu.unlu.poo.plantaenergia;


import java.util.ArrayList;

public class TableroControl {
    private ArrayList<Reactor> reactores;
    private  String nombrePlanta;

    public TableroControl(String nombrePLanta) {
        reactores = new ArrayList<>();
        this.nombrePlanta = nombrePLanta;
    }

    public ArrayList<Reactor> getReactores() {
        return reactores;
    }

    public void setReactores(ArrayList<Reactor> reactores) {
        this.reactores = reactores;
    }

    public void setReactor(Reactor nuevoReactor) {
        if(nuevoReactor == null) {
            throw new IllegalArgumentException("NULL");
        }else this.reactores.add(nuevoReactor);
    }


}
