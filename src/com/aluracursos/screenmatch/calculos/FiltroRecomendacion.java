package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable){
        if (clasificable.getClasificacion() >= 4) {
            System.out.println("Muy bien evaluado en el momento.");
        } else if (clasificable.getClasificacion() >= 2){
            System.out.println("Popular en el momento.");
        } else {
            System.out.println("Colocalo en tu lista para verlo después.");
        }
    }
}
