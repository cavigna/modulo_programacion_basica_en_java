package com.nacho;

public class Cliente extends Persona {
    private int edadHoy;
    public Cliente(String nombre, String rut, int birthDate){
        super(nombre, rut, birthDate);
        this.edadHoy = 2021 - birthDate;


    }

    public int getEdadHoy() {
        return edadHoy;
    }
}
