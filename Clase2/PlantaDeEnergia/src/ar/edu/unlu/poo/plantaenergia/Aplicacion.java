package ar.edu.unlu.poo.plantaenergia;

import java.util.ArrayList;

public class Aplicacion {
    static void main() {
        TableroControl tablero = new TableroControl("Planta 1");

        Reactor.setLimiteTemperaturaGlobal(8.);

        Reactor reactor1 = new Reactor("AAA", 4.);
        tablero.setReactor(reactor1);
        Reactor reactor2 = new Reactor("AAB", 5.);
        tablero.setReactor(reactor2);
        Reactor reactor3 = new Reactor("ABB", 6.);
        tablero.setReactor(reactor3);
        Reactor reactor4 = new Reactor("AAC", 7.);
        tablero.setReactor(reactor4);


        try{
            reactor4.setTemperaturaActual(8.1);

        }catch (IllegalArgumentException e){
            System.out.println("TEMPERATURA NULL");

        }catch (TemperaturaCriticaException e){
            System.out.println("REACTOR EN ALERTA");

        }catch (Exception e){
            System.out.println("EXCEPCION");
        }



        ArrayList<Reactor> listaDeReactores = tablero.getReactores();
        for (Reactor r1 : listaDeReactores){
            System.out.println("Reactor: " + r1.getCodigo() + " ALERTA: " + r1.estaAlerta());
        }
        System.out.println("\nCantidad Alertas: " + Reactor.getCantidadAlertas());



    }
}
