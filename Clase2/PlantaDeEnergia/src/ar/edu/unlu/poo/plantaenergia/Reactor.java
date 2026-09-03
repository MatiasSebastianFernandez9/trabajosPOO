package ar.edu.unlu.poo.plantaenergia;

public class Reactor {
    private String codigo;
    private Double temperaturaActual;
    private Boolean enAlerta;

    private static Double limiteTemperaturaGlobal;
    private static Integer contadorAlertas = 0;

    public Reactor(String codigo, Double temperaturaActual) {
        this.codigo = codigo;
        this.temperaturaActual = temperaturaActual;
        this.enAlerta = false;
    }

    public static void setLimiteTemperaturaGlobal(Double limiteTemperaturaGlobal) {
        Reactor.limiteTemperaturaGlobal = limiteTemperaturaGlobal;
    }

    public void setTemperaturaActual(Double nuevaTemperatura) {
        if(nuevaTemperatura == null) {
            throw new IllegalArgumentException("NULL");
        }else temperaturaActual = nuevaTemperatura;

        if(this.temperaturaActual > limiteTemperaturaGlobal){
            if(!this.enAlerta) {
                this.enAlerta = true;
                contadorAlertas++;
            }
            throw new TemperaturaCriticaException("Temperatura critica");
        }else{
            this.enAlerta = false;
        }
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Boolean estaAlerta() {
        return this.enAlerta;
    }

    public static Integer getCantidadAlertas() {
        return contadorAlertas;
    }
}
