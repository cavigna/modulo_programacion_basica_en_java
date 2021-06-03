package com.nacho;


public class Comprobante {
    private int numeroComprobante =1 ;
    private Producto producto;
    private int cantidad;


    public Comprobante(Producto producto, int numeroComprobante, int cantidad) {
        this.numeroComprobante = numeroComprobante;
        this.producto = producto;
        this.cantidad= cantidad;

    }

    public void generarComprobante(){
        System.out.println("El comprobante  n " +""+ getNumeroComprobante()
                + "de su compra " + producto.getDescripcion() + "ha sido generado" );
        System.out.println("Gracias por su compra");

    }

    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(int numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
