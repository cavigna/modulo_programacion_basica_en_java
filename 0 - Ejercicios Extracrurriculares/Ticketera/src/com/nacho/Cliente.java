package com.nacho;

public class Cliente extends Persona{
    private Entrada entrada;

    public Cliente(String nombre, String rut, int edad){
        super(nombre, rut, edad);
        this.entrada = entrada;
    }


    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
}
