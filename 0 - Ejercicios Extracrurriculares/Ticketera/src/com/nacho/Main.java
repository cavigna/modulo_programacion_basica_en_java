package com.nacho;

public class Main {

    public static void main(String[] args) {
        /* Nuevo Evento, vendedor, cliente */
        Evento concierto = new Evento("Concierto Pulenta", 18, 120);
        Vendedor juanVenta = new Vendedor("Juan Venta", "23.553.463-2");
        Cliente miguelCliente = new Cliente("Miguel Cliente", "15-557.398-1", 24);
        Cliente robertoCliente = new Cliente("Roberto Cliente", "20-123.398-1", 12);
        Cliente jamesVip = new Cliente("James VIP", "8.947.442-2", 42);
        Cliente norbertoCliente = new Cliente("Norberto", "7.698.442-2", 53);
        /*
         * Pruebas de Venta de Entrada:
         * Válida, Problema de Edad y Asiento Vendido.*/
        aviso("Venta Entrada Normal Válida");
        Venta.ventaEntrada(concierto, miguelCliente, juanVenta, false, 7);
        System.out.println();
        aviso("Venta Entrada Normal Inválida: No cumple Edad Mínima");
        Venta.ventaEntrada(concierto, robertoCliente, juanVenta, false, 8);
        aviso("Venta de Entrada con número de asiento ya Usado");
        Venta.ventaEntrada(concierto, miguelCliente, juanVenta, false, 7);
        aviso("Venta de Entrada Vip");
        Venta.ventaEntrada(concierto, jamesVip, juanVenta, true, 42);
        Venta.ventaEntrada(concierto, norbertoCliente, juanVenta, false, 23);

        /*
        Intento de Ingreso cuando el evento no Comenzó
         */
        aviso("Intento de Ingreso cuando el evento no Comenzó");

        concierto.ingresoEvento(miguelCliente.getEntrada());
        aviso("Inicio de Evento");

        concierto.inicioEvento(); // Iniciamos el Evento
        /* Ingreso al Evento en Curso */
        aviso("Ingreso al Evento");

        concierto.ingresoEvento(miguelCliente.getEntrada());
        aviso("Intento de ingresar con Entrada Usada");
        concierto.ingresoEvento(miguelCliente.getEntrada());
        /* Otros Ingresos de Clientes */

        concierto.ingresoEvento(jamesVip.getEntrada());
        concierto.ingresoEvento(norbertoCliente.getEntrada());

        aviso("Listado de Ventas Del Vendedor");
        juanVenta.listadoVentas();

        aviso("Entradas Vendidas!");
        concierto.listadoEntradas();
    }

    // Método creado para la impresión de mensajes;
    public static void aviso(String mensaje) {
        System.out.println();
        System.out.println("*** " + mensaje + " ***");
        System.out.println();
    }
}
