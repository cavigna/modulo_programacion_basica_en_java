package com.nacho;

import java.util.ArrayList;


public class Bodega {
    private final ArrayList<Producto> stock = new ArrayList<>();


    public Bodega() {
    }

    public void agregarProducto(Producto producto, int cantidad) {
        for (var i = 1; i <= cantidad; i++) {
            this.stock.add(producto);
        }
        producto.setStockProducto(producto.getStockProducto() + cantidad);

    }

    public boolean hayStock(Producto producto, int cantidad) {
        return producto.getStockProducto() >= cantidad;

    }


    public void retirarProducto(Producto producto, int cantidad) {
        if (hayStock(producto, cantidad)) {
            producto.setStockProducto(producto.getStockProducto()
                    - cantidad);
        }
    }


    public void imprimirStock(Producto producto) {
        var total = producto.getStockProducto();

        System.out.printf("El producto %s tiene un stock total de: %s  ", producto.getDescripcion(), total);
        System.out.println(" ");
    }

}
