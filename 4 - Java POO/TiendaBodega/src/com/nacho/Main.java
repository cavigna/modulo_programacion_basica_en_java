package com.nacho;

public class Main {

    public static void main(String[] args) {
        var robot = new Producto(1, "R2D2", 50);
        var zapatilla = new Producto(2, "Zapatilla Rebook", 50);
        var bodega = new Bodega();
        bodega.agregarProducto(zapatilla, 5);
        bodega.imprimirStock(zapatilla);
        var tienda = new Tienda("La Poderosa", bodega);
        var geraltOfRivia = new Cliente("Geralt of Rivia", "42.424242-7", 200);
        tienda.venta(geraltOfRivia,zapatilla, 1);
        int comprobanteVenta = tienda.generarComprobante(zapatilla,1, 2);
        tienda.entregaProducto(comprobanteVenta);
        //tienda.listadoComprobantes();
        bodega.imprimirStock(zapatilla);



    }
}
