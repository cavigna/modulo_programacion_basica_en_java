package com.nacho;

import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        // Agregamos algunos Productos
        var mutageno = new Producto(1, " Mutágeno Rojo", 50);
        var armaduraOso = new Producto(2, "Armadura Oso", 1500);
        var espadaDePlata = new Producto(3,"Espada de Plata", 250 );


        var bodega = new Bodega(); // Creamos una nueva Bodega
        var tienda = new Tienda("Novigrad", bodega); //Tienda
        // Agregamos unas algunos productos...
        bodega.agregarProducto(espadaDePlata, 5);
        bodega.agregarProducto(mutageno, 10);
        bodega.agregarProducto(armaduraOso, 1);

        //Check del Stock Inicial
        System.out.println(" ");
        System.out.println("--- Stock En Bodega ---");
        bodega.imprimirStock(espadaDePlata);
        bodega.imprimirStock(mutageno);
        bodega.imprimirStock(armaduraOso);
        System.out.println(" --- Fin ---");
        System.out.println(" ");

        // Nuevo Cliente Geralt of Rivia

        var geraltOfRivia = new Cliente("Geralt of Rivia", "42.424242-7", 200);
        System.out.println(geraltOfRivia);

        //El buen geralt se quiere comprar 2 espadas, pero no hay

        tienda.venta(geraltOfRivia,armaduraOso, 2);

        //Compra dos Mutágenos
        tienda.venta(geraltOfRivia,mutageno, 2);

        // Generamos el Comprobante
        Comprobante comprobanteVentaMutageno = tienda.generarComprobante(mutageno,2);

        // Entregamos el Producto
        tienda.entregaProducto(comprobanteVentaMutageno);

        // Hagamos un Check de los saldos de la tienda y de Geralt.
        tienda.imprimirCaja();
        geraltOfRivia.imprimirSaldo();

        //Si probamos comprar la espada, nos dará monto insuficiente
        // Es por eso, que lo mandamos a geralt a matar unos mounstros.

        tienda.venta(geraltOfRivia, espadaDePlata, 1);
        geraltOfRivia.matarMounstros(2500);

        tienda.venta(geraltOfRivia, espadaDePlata, 1);
        Comprobante comprobanteVentaEspada =
                tienda.generarComprobante(espadaDePlata, 1);

        tienda.entregaProducto(comprobanteVentaEspada);


        tienda.listadoComprobantes();
        //Check del Stock Final
        System.out.println(" ");
        System.out.println("--- Stock En Bodega ---");
        bodega.imprimirStock(espadaDePlata);
        bodega.imprimirStock(mutageno);
        bodega.imprimirStock(armaduraOso);
        System.out.println(" --- Fin ---");
        System.out.println(" ");

    }
}
