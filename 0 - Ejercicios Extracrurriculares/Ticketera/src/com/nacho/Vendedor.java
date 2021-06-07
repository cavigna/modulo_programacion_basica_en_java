package com.nacho;

public class Vendedor extends Persona{
    private int entradasNormales = 0;
    private int entradasVip = 0;


    public Vendedor(String nombre, String rut){
        super(nombre, rut);

    }

    public int getEntradasNormales() {
        return entradasNormales;
    }

    public void setEntradasNormales(int entradasNormales) {
        this.entradasNormales = entradasNormales;
    }

    public int getEntradasVip() {
        return entradasVip;
    }

    public void setEntradasVip(int entradasVip) {
        this.entradasVip = entradasVip;
    }

    public int entradasVendidas(){
        return entradasNormales + entradasVip;
    }

    public void ventaNormal(){
        this.entradasNormales++;
    }
    public void ventaVip(){
        this.entradasVip++;
    }

    public void listadoVentas(){
        System.out.println(this.getNombre() + " ha vendido: ");
        System.out.println("Entradas Normales: " + getEntradasNormales());
        System.out.println("Entradas Vip: " + getEntradasVip());
        System.out.println("El total vendido es de: " + entradasVendidas());
    }
}
