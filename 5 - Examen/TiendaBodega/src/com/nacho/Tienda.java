package com.nacho;

import java.util.ArrayList;

public class Tienda {
    private final String nombre;
    private Bodega bodega;
    private double caja;
    private ArrayList<Comprobante> comprobantes;
    private int nComprobante;


    public Tienda(String nombre, Bodega bodega) {
        this.nombre = nombre;
        this.bodega = bodega;
        this.caja = 0;
        this.comprobantes = new ArrayList<>();
        this.nComprobante = 1;
    }

    public void imprimirCaja() {
        System.out.println("En caja hay: $" + this.caja);
    }


    public void venta(Cliente cliente, Producto producto, int cantidad) {
        double montoVenta = producto.getPrecio() * cantidad;
        if (bodega.hayStock(producto, cantidad)) {
            if (cliente.getSaldo() >= montoVenta) {
                System.out.println(" --- Venta ---");
                System.out.println();
                System.out.println("Cliente: " + cliente.getNombre());
                System.out.println("Producto: " + producto.getDescripcion());
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio: $" + producto.getPrecio());
                System.out.println("Monto de Total a pagar: $" + montoVenta);
                System.out.println();
                this.caja += montoVenta;
                cliente.setSaldo(cliente.getSaldo() - montoVenta);


            } else {
                System.out.println();
                System.out.println(cliente.getNombre() + " no tiene saldo suficiente");

            }
        } else {
            System.out.println();
            System.out.println("No hay Suficiente Stock Disponible de: ");
            System.out.println(producto.getDescripcion());
            System.out.println();

        }
    }

    public Comprobante generarComprobante(Producto producto, int cantidad) {
        var comprobanteGenerado = new Comprobante(producto, nComprobante, cantidad);
        comprobantes.add(comprobanteGenerado);
        this.nComprobante++;
        comprobanteGenerado.generarComprobante();
        return comprobanteGenerado;

    }

    public void listadoComprobantes() {
        System.out.println(" --- Listado de Comprobantes Emitidos ---");
        for (Comprobante c : comprobantes) {
            System.out.println("Comprobante 00" + c.getNumeroComprobante() + " del producto "
                    + c.getProducto().getDescripcion());
        }
        System.out.println(" --- Fin Listado ---");
    }

    public void entregaProducto(Comprobante comprobante) {
        if (comprobantes.contains(comprobante)) {
            System.out.println(" ");
            System.out.println(" *** ENTREGA PRODUCTO ***");
            System.out.println();
            System.out.println("Comprobante n°: 00" + comprobante.getNumeroComprobante());
            System.out.println("Entrega de producto " + comprobante.getProducto().getDescripcion());
            System.out.println("");
            bodega.retirarProducto(comprobante.getProducto(), comprobante.getCantidad());


        } else {

            System.out.println("Por favor dirijase a Atención al Cliente.");

        }


    }

}



