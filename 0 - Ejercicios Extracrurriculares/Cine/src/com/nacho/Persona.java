package com.nacho;

import java.time.Period;

public abstract class Persona {
    private String nombre;
    private String rut;
    private int birthDate;

    public Persona(){}

    public Persona(String nombre, String rut, int birthDate){
        this.nombre = nombre;
        this.rut = rut;
        this.birthDate = birthDate;


    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
}
