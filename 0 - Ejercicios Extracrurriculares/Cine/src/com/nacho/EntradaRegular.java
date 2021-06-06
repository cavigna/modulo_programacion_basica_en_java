package com.nacho;

import com.Entrada;

public class EntradaRegular  extends Entrada{
    
    private Cliente cliente;
    private String nombreVendedor;

    public EntradaRegular(int numero) {
        super(numero);
    }

    public  EntradaRegular(int numero, Cliente cliente, String nombreVendedor){
        super(numero);
        this.cliente = cliente;
        this.nombreVendedor = nombreVendedor;
    }

    @Override
    public String toString() {
        return "Entrada n " + getNumero()
                + " de " + cliente.getNombre()
                + " vendida por " + nombreVendedor;
    }


    

    // public void setNumero(int numero) {
    //     this.numero = numero;
    // }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreVendedor(){
        return this.nombreVendedor;
    }


}
