package com.nacho;

public class Personaje {
    String nombre;
    int edad;
    double altura;



    public  Personaje(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;


    }

    public void hablar(String frase){
        String  prefijo = this.nombre +" : " ;
        System.out.println(prefijo +frase);
    }
}
