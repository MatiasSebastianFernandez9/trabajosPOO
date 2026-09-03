package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    private HashSet<Artefacto> artefactos;

    public CatalogoArtefactos(){
        artefactos = new HashSet<>();
    }

    public void agregarArtefacto(Artefacto unArtefacto){
        artefactos.add(unArtefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return this.artefactos;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo){
        List<Artefacto> artefactosPorTipo = new ArrayList<>();
        for (Artefacto ar : artefactos){
            if (Objects.equals(ar.getTipo(), tipo)){
                artefactosPorTipo.add(ar);
            }
        }

        return artefactosPorTipo;
    }

    public Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> artefactosPorTipo = new HashMap<>();
        HashSet<String> tipos = contarTipos();
        for (String tipo : tipos){
            artefactosPorTipo.put(tipo, buscarArtefactosPorTipo(tipo).size());
        }
        return artefactosPorTipo;
    }

    private HashSet<String> contarTipos(){
        HashSet<String> tipos = new HashSet<>();
        for (Artefacto ar: artefactos){
            tipos.add(ar.getTipo());
        }
        return tipos;
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
    }
}
