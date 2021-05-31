package com.nacho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bodega {
    private Map<Integer, Integer> stockProducto = new HashMap();
    public Bodega(){}
    public Bodega(Map stockProducto){
        this.stockProducto = stockProducto;
    }

    public Map<Integer, Integer> getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(Map<Integer, Integer> stockProducto) {
        this.stockProducto = stockProducto;
    }
    public void stockInicial(Producto producto){
        this.stockProducto.put(producto.getCodigo(), producto.getStockProducto());
        System.out.printf("El stock inicial de %s es de: %s %n ",producto.getNombre(), this.stockProducto.get(producto.getCodigo()));
    }

    public void agregarProducto(Producto producto, int cantidad){
        this.stockProducto.put(producto.getCodigo(), cantidad);
        producto.setStockProducto(producto.getStockProducto()+cantidad);
        System.out.printf(" Se agregaron %s unidades del producto %s %n", cantidad,producto.getNombre());

    }
    public boolean stockDisponibleBodega(int codigo, int cantidadSolicitada){

        return cantidadSolicitada<= stockProducto.get(codigo);
    }

    public void retirarProducto(Producto producto,  int cantidadSolicitada){
        int codigo = producto.getCodigo();
        int existencias = producto.getStockProducto();
                //getStockProducto().get(codigo);
        int nuevoStock = existencias - cantidadSolicitada;
        if(stockDisponibleBodega(codigo, cantidadSolicitada)){
            stockProducto.put(codigo, nuevoStock); // Suplanta el valor del Hash con nuevo Stock
            producto.setStockProducto(nuevoStock);
            System.out.printf("%s entregado/a al Cliente %n", producto.getNombre());

        } else{
            System.out.println("No hay stock suficiente para la cantidad solicitada");
        }
    }

    public void printStockProducto(Producto producto){
        System.out.printf("El stock total de %s es de: %s %n", producto.getNombre(), producto.getStockProducto());
    }




}

//boolean hayStock = cantidadSolicitada<= producto.getStockProducto();
//(int) stockProducto.get(producto.getCodigo());