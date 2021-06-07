package com.nacho;

import java.util.ArrayList;

public class Evento {
    private String nombre;
    private int edadMinima;
    private double precio;
    private double precioVip;
    private boolean enCurso;
    private ArrayList<Entrada> entradasVendidas;
    private ArrayList<Entrada> entradasUsadas;

    public Evento(String nombre, int edadMinima, double precio) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.entradasVendidas = new ArrayList<>();
        this.entradasUsadas = new ArrayList<>();
        this.precio = precio;
        this.precioVip = precio*1.5;
        this.enCurso = false;


    }

    public void agregarEntradaVendida(Entrada entrada) {
        entradasVendidas.add(entrada);
    }



    public void inicioEvento(){
        this.enCurso = !this.enCurso;
    }

    public void ingresoEvento(Entrada entrada){
        if(isEnCurso()) {
            if(entradasUsadas.contains(entrada)){
                System.out.println("La entrada fue usada!");

            }else{
                System.out.println();
                System.out.println("*** Ingreso al " + this.nombre + "***");
                System.out.printf("Bienvenido %s al evento %s, ud. puede pasar%n",
                        entrada.getCliente().getNombre(), this.nombre);
                System.out.println();
                entradasUsadas.add(entrada);
            }
        }else {
            System.out.println(this.nombre + " no ha comenzado!");
        }

    }



    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioVip() {
        return precioVip;
    }

    public ArrayList<Entrada> getEntradasVendidas() {
        return entradasVendidas;
    }

    public void listadoEntradas(){
        for(Entrada entrada:entradasVendidas){
            System.out.println();
            System.out.println("Entrada número: " + entrada.getNumeroAsiento());
            System.out.println("Cliente: " + entrada.getCliente().getNombre());
            System.out.println("Vendedor: " + entrada.getVendedor().getNombre());
            System.out.println("");
        }
    }

    public boolean isEnCurso() {
        return enCurso;
    }
}


