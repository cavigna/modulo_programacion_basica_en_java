package com.nacho;

public class EntradaRegular {
    private int numero;
    private Cliente cliente;
    private Vendedor vendedor;

    public EntradaRegular() {
    }

    public  EntradaRegular(int numero, Cliente cliente, Vendedor vendedor){
        this.numero = numero;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Entrada n " + this.numero
                + " de " + cliente.getNombre()
                + " vendida por " + vendedor.getNombre();
    }
}
