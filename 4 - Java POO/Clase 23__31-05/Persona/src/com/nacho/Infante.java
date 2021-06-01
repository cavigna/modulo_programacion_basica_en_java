package com.nacho;

public class Infante extends Persona {
    public Infante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void actividadLaboral() {
        System.out.println("No tengo trabajo, soy un pibe!");
    }

    @Override
    public void actividadRecreativa() {
        System.out.println("Juego, corro, veo dibujitos, hago lo que quiero.");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo más o menos unas 12 horas");
    }

    @Override
    public void contarHastaN(int n) {
        if (n> 10){
            System.out.println("Se contar hasta diez solamente.");
        }else{
            for(var i=1; i<10; i++){
                System.out.println(i);
            }
        }
    }
}
