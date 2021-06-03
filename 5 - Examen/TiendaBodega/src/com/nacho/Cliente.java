package com.nacho;

public class Cliente {
    private String nombre;
    private String rut;
    private double saldo;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void matarMounstros(double recompensa){
        System.out.println("Ya mate el Mounstro!");
        setSaldo(getSaldo()+recompensa);
        System.out.println("Nuevo Saldo: $" + getSaldo());
    }

    public void imprimirSaldo(){
        System.out.println("El saldo de " + this.nombre +
                " es de $" + getSaldo());
    }

    public String toString(){
        return this.nombre + " tiene un saldo de $" +
                this.saldo;
    }


}
