package com.nacho;

public class Main {

    public static void main(String[] args) {
        var arthurDent = new Cliente("Arthur Dent", "42.424242-7", 100);
        var bodega = new Bodega();
        var tienda = new Tienda(bodega, 0);
        var zapatilla = new Producto("Zapatilla", "Deportiva", 1, 50.0, 20);
        bodega.stockInicial(zapatilla);
        tienda.venta(zapatilla, 1, arthurDent);
        tienda.venta(zapatilla, 2, arthurDent);
        bodega.printStockProducto(zapatilla);
        System.out.println(arthurDent.getSaldo());


    }
}
