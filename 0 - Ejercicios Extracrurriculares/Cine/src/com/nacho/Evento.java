package com.nacho;

import java.util.ArrayList;

public class Evento {
    private String nombre;
    private int edadMin;
    private final ArrayList<EntradaRegular> entradasTotal = new ArrayList<>();
    private int nEntradasVendidas;
    private int nEntradasUsada;
    private boolean enCurso;

    public Evento(String nombre, int edadMin){
        this.nombre = nombre;
        this.edadMin = edadMin;
    }

    public void entradaVendida(EntradaRegular entrada){
//        for (entr: entradasTotal) {
//            if()
//
//        }

    }

    public ArrayList<EntradaRegular> getEntradasTotal() {
        return entradasTotal;
    }

    public int getEdadMin() {
        return edadMin;
    }

}
