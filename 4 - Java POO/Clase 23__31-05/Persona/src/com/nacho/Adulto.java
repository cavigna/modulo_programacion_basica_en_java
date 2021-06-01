package com.nacho;

public class Adulto extends Persona {
    private String trabajo;
    public Adulto(String trabajo, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.trabajo = trabajo;

    }

    @Override
    public void actividadLaboral() {
        System.out.println("Mi trabajo es " + trabajo);

    }

    @Override
    public void actividadRecreativa() {
        System.out.println("No tengo tiempo para hacer deporte");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo unas 6 horas diarias");
    }
    @Override
    public void contarHastaN(int n){

        for(var i=1; i<n; i++){
            System.out.println(i);
        }
    }
}
