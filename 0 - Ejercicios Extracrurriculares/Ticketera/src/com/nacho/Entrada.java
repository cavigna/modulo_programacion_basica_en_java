package com.nacho;

public class Entrada {
    private double precio;
    private int numeroAsiento;
    private Cliente cliente;
    private Vendedor vendedor;


    public  Entrada(){}

    public Entrada(double precio, int numeroAsiento, Cliente cliente, Vendedor vendedor) {
        this.precio = precio;
        this.numeroAsiento = numeroAsiento;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
