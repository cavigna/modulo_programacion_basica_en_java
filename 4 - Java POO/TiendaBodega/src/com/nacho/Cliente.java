package com.nacho;

public class Cliente {
    String nombre;
    String rut;
    double saldo;

    public Cliente(String nombre, String rut, int saldo) {
        this.nombre = nombre;
        this.rut = rut;
        this.saldo = Math.max(0,saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
