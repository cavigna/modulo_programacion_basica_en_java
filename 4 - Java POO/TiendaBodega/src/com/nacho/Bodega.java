package com.nacho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bodega {
    private final ArrayList<Producto> stock = new ArrayList<>();
    private final Map<Producto, HashMap> stock2 = new H

    public Bodega(){
    }

    public int stockProducto(Producto producto){
        var total = 0;
        for(Producto p:stock){
            if(p.getCodigo() == producto.getCodigo()){
                total++;
            }
        }
        System.out.println(total);
        return total;
    }

    public boolean hayStock(Producto producto, int cantidad){
        return stockProducto(producto)>= cantidad;
    }

    public void agregarProducto(Producto producto, int cantidad){
        for(var i=1; i<=cantidad; i++){
            this.stock.add(producto);
        }
    }

    public void retirarProducto(Producto producto, int cantidad){
        if(hayStock(producto, cantidad)) {
            for (var i = 1; i <= cantidad; i++) {
                this.stock.remove(producto);
            }
        }


    }

    public void imprimirStock(Producto producto){
        var total = stockProducto(producto);
        System.out.printf("El producto %s tiene un total de: %S ", producto.getDescripcion(), total);

    }


}
