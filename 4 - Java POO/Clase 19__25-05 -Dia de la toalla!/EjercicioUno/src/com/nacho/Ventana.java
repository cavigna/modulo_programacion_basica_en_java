package com.nacho;

public class Ventana {
    int altura;
    int ancho;
    int material;
    boolean cerradaOAbierta = true;

    public Ventana(){

    }
    public Ventana(int altura, int ancho, boolean cerradaOAbierta){
        this.altura = altura;
        this.ancho = ancho;
        this.cerradaOAbierta = cerradaOAbierta;
    }

    public int tamaño(){
        return altura*ancho;
    }
    public void setCerradaOAbierta(){
        cerradaOAbierta = !cerradaOAbierta;
        String chequeo =  !cerradaOAbierta ? "La ventana esta abierta": "La ventana esta Cerrada";
        System.out.println(chequeo);

    }



}
