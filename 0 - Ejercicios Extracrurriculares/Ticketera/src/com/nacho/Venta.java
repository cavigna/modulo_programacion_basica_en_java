package com.nacho;

public class Venta {

    /*
    * Para vender una entrada debo checkear:
    * 1. QUe cumpla la edad mínima
    * 2. Que el n de asiento no esté vendido
    * 3. que tipo de Entrada va a comprar*/

    //1.
    private static boolean checkEdad(Evento evento, Cliente cliente){
        return cliente.getEdad()>=evento.getEdadMinima();

    }

    //2.
    private static boolean checkNumAsiento(int num, Evento evento) {
        var tf = false;
        for (Entrada e : evento.getEntradasVendidas()) {
            if (num == e.getNumeroAsiento()) {
                tf = true;
                System.out.println("Este Asiento no está Disponible.");
                break;
            }
        }
        return tf;
    }
    // Check todos los puntos anteriores.
    private static boolean checkVenta(Evento evento, Cliente cliente, int numeroAsiento){
        boolean respuesta = false;
        if(checkEdad(evento, cliente)){ // Edad
            respuesta= true;
            if(checkNumAsiento(numeroAsiento, evento)){ // Num Asiento
                respuesta = true;
            }
        }else {
            System.out.println("Problema Edad");

        }return respuesta;
    }
    public static void ventaEntrada(Evento evento, Cliente cliente, Vendedor vendedor, boolean vip,
                                    int numeroAsiento) {
        var ventaOk = checkVenta(evento, cliente, numeroAsiento);
        if (ventaOk) {
            if (!vip) {
                evento.agregarEntradaVendida(new Entrada(evento.getPrecio(),
                        numeroAsiento, cliente, vendedor));
                vendedor.ventaNormal();
            } else {
                evento.agregarEntradaVendida(new EntradaVip(evento.getPrecio(),
                        numeroAsiento, cliente, vendedor));
                vendedor.ventaVip();
            }
            } else {
            System.out.println("Hubo un problema!");


        }

    }


}
