package com.nacho;

import java.util.ArrayList;

public class Tienda {
    private final String nombre;
    private Bodega bodega;
    private double caja;
    private ArrayList<Comprobante> comprobantes ;
    private int nComprobante;


    public Tienda(String nombre, Bodega bodega){
        this.nombre = nombre;
        this.bodega = bodega;
        this.caja = 0;
        this.comprobantes = new ArrayList<>();
        this.nComprobante =1;
    }

    public void venta(Cliente cliente, Producto producto, int cantidad){
        double montoVenta =producto.getPrecio()*cantidad;
        if(bodega.hayStock(producto,cantidad)){
            if(cliente.getSaldo()>=montoVenta){
                System.out.println("Venta realizada");
                this.caja += producto.getPrecio();
                cliente.setSaldo(cliente.getSaldo()-montoVenta);


            }else{
                System.out.println("No tiene Saldo");

            }
        }else{
            System.out.println("No hay Stock Disponible");

        }
    }
    public int generarComprobante(Producto producto, int nComprobante, int cantidad){
        var comprobanteGenerado = new Comprobante(producto, nComprobante, cantidad);
        comprobantes.add(comprobanteGenerado);
        this.nComprobante++;

        return comprobanteGenerado.getNumeroComprobante()-1;

    }

    public void listadoComprobantes(){
        for(Comprobante c: comprobantes){
            System.out.println("Comprobante n"+ c.getNumeroComprobante() + " del producto " + c.getProducto().getDescripcion());
        }
    }
    public void entregaProducto(int numeroCom){
        for(Comprobante comprobante:comprobantes){
            if(comprobante.getNumeroComprobante()==numeroCom){
                System.out.println("Entrega de producto" + comprobante.getProducto().getDescripcion());
                bodega.retirarProducto(comprobante.getProducto(), comprobante.getCantidad());

            }else{
                System.out.println("Por favor dirijase a Atención al Cliente.");
            }

        }

    }



}
