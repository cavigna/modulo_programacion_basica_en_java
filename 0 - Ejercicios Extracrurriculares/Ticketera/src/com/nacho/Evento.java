package com.nacho;

import java.util.ArrayList;

public class Evento {
    private String nombre;
    private int edadMinima;
    private double precio;
    private double precioVip;
    private boolean enCurso;
    //private int cantEntradas;
    private ArrayList<Entrada> entradasVendidas;
    private ArrayList<Entrada> entradasUsadas;

    public Evento(String nombre, int edadMinima, double precio, double precioVip) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.entradasVendidas = new ArrayList<>();
        this.entradasUsadas = new ArrayList<>();
        this.precio = precio;
        this.precioVip = precioVip;
        this.enCurso = false;


    }

    public void agregarEntradaVendida(Entrada entrada) {
        entradasVendidas.add(entrada);
    }



    public void inicioEvento(){
        this.enCurso = !this.enCurso;
    }

    public void ingresoEvento(Entrada entrada){
        if(this.enCurso) {
            if(!entradasUsadas.contains(entrada)){
                System.out.printf("Bienvenido %s al evento %s, ud. puede pasar",
                        entrada.getCliente().getNombre(), this.nombre);
                entradasUsadas.add(entrada);
            }else{
                System.out.println("La entrada fue usada!");
            }
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
}


//    public void generarEntradas(int cantidadEntradas, Entrada entrada, EntradaVip entradaVip){
//        int numeroAsiento = 1;
//        int porcentajeNormal = (int) (cantidadEntradas * .8);
//        int porcentajeVip = (int)(cantidadEntradas *.20);
//        for(var i = 0; i<= porcentajeNormal; i++){
//            entradas[i] = new Entrada();
//        }
//    }