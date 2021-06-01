package com.nacho;

public class Anciano extends Persona{
    public Anciano(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void actividadLaboral() {
        System.out.println("No tengo trabajo, ya me jubilé");
    }

    @Override
    public void actividadRecreativa() {
        System.out.println("Hablo con los vecinos, me voy al parque a dar una vuelta y juego a las cartas");
    }

    @Override
    public void dormir() {
        System.out.println("Duermo como tres horas.");
        System.out.println("Tipo 2 duermo una siesta.");
    }

    @Override
    public void contarHastaN(int n) {
             for(var i=1; i<n; i++){
                 if(i == 11){
                     System.out.println("En que número me quedé??. Me olvidé");
                     break;
                 }
                System.out.println(i);
            }

    }
}
