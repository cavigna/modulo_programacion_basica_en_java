package com.nacho;

public class Microondas extends Electrodomestico {

    public Microondas(String marca, String modelo, int ancho, int largo, int profundidad, double consumo) {
        super(marca, modelo, ancho, largo, profundidad, consumo);
    }

    public void calentar(){
        System.out.println("Calentando....");
    }
}
