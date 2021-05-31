package com.nacho;

public class Tv extends Electrodomestico{
    private int pulgadas;

    public Tv(String marca, String modelo, int ancho, int largo, int profundidad, double consumo, int pulgadas) {
        super(marca, modelo, ancho, largo, profundidad, consumo);
        this.pulgadas = pulgadas;
    }

    public void cambioCanal(int canal){
        System.out.println("Se cambió al canal: " + canal);
    }


}

/* Crear una superclase Persona con sus respectivos atributos y metodos propios de la clase,
luego a partir de esa clase como mínimo tres subclases (hacerle métodos abstractos).

 */
