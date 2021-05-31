package com.nacho;

public class Cliente {
    private String nombre;
    private String rut;
    private double saldo = 0;

    public Cliente(){

    }
    public Cliente(String nombre, String rut, double saldo){
        this.nombre = nombre;
        this.rut = rut;
        this.saldo = Math.max(0,saldo);
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
