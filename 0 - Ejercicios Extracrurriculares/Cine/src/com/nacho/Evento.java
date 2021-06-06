package com.nacho;

import java.util.ArrayList;

import com.*;

public class Evento {
    private String nombre;
    private int edadMin;
    private final ArrayList<Entrada> entradasTotal = new ArrayList<>();
    private int numEntrada;
    private ArrayList<Entrada> entradasVenidas;
    private ArrayList<Entrada> entradasUsadas;
    private ArrayList<Entrada> entradasRegular;
    private ArrayList<Entrada> entradasVip;
    private int nEntradasVendidas;
    private int nEntradasUsada;
    private boolean enCurso;

    public Evento(String nombre, int edadMin) {
        this.nombre = nombre;
        this.edadMin = edadMin;
        this.entradasVenidas = new ArrayList<>();
        this.entradasUsadas = new ArrayList<>();
        this.entradasRegular = new ArrayList<>();
        this.entradasVip = new ArrayList<>();
        this.nEntradasUsada = 0;
        this.enCurso = false;
        this.numEntrada = 0;
    }

    public void ventaEntradasRegulares(int cantidadEntradas, Cliente cliente, String nombreVendedor) {
        for (var i = 0; i <= cantidadEntradas; i++) {
            entradasRegular.add(new EntradaRegular(numEntrada++, cliente, nombreVendedor));
            
        }

    }

    public void ventaEntradasVIP(int cantidadEntradas, Cliente cliente, String nombreVendedor) {
        for (var i = 0; i <= cantidadEntradas; i++) {
            entradasVip.add(new EntradaVIP(numEntrada++, cliente, nombreVendedor));
        }

    }

    public void enCurso() {
        this.enCurso = !this.enCurso;
        String respuesta = this.enCurso ? ("El evento " + this.nombre + "se ha cambiado a : En curso.")
                : "El evento " + this.nombre + "No se encuentra en curso.";
        System.out.println(respuesta);
    }

    public void ingresoEvento(EntradaRegular entrada) {
        if (getEnCurso()){
            if(entradasUsadas.contains(entrada)){
                System.out.println("Bienvenido/a: " + entrada.getCliente().getNombre()
                + "al evento: " + this.nombre );
            }else{
                System.out.println("La entrada ya ha sido utilizada");
            }

        }

    }




    public int getEdadMin() {
        return edadMin;
    }

    public int getNEntradasVendidas() {
        return this.nEntradasVendidas;
    }

    public int getNEntradasUsada() {
        return this.nEntradasUsada;
    }

    public boolean isEnCurso() {
        return this.enCurso;
    }

    public boolean getEnCurso() {
        return this.enCurso;
    }

    public void setEnCurso(boolean enCurso) {
        this.enCurso = enCurso;
    }

}
