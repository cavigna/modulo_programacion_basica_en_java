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
        var tf = true;
        for (Entrada e : evento.getEntradasVendidas()) {
            if (num == e.getNumeroAsiento()) {

                System.out.println("Este Asiento no está Disponible.");
                tf = false;
                break;

            }
        }
        return tf;
    }
    // Check todos los puntos anteriores.
    private static boolean checkVenta(Evento evento, Cliente cliente, int numeroAsiento){
        boolean respuesta = false;
        if(checkEdad(evento, cliente)){ // Edad

            if(checkNumAsiento(numeroAsiento, evento)){ // Num Asiento
                respuesta = true;
            }
        }else {
            System.out.println(cliente.getNombre() + " Ud tiene: " + cliente.getEdad());
            System.out.println("Ud. no cumple la edad mínima de: " + evento.getEdadMinima() );

        }return respuesta;
    }
    public static void ventaEntrada(Evento evento, Cliente cliente, Vendedor vendedor, boolean vip,
                                    int numeroAsiento) {
        var ventaOk = checkVenta(evento, cliente, numeroAsiento);
        if (ventaOk) {
            if (!vip) {
                var entradaNormal =new Entrada(evento.getPrecio(),
                        numeroAsiento, cliente, vendedor);
                evento.agregarEntradaVendida(entradaNormal);
                vendedor.ventaNormal();
                cliente.setEntrada(entradaNormal);
                System.out.println("Entrada Vendida! ");
                System.out.println("Número de Asiento: " + entradaNormal.getNumeroAsiento() +
                        " de " + entradaNormal.getCliente().getNombre());
            } else {
                var entradaVip = new EntradaVip(evento.getPrecio(),
                        numeroAsiento, cliente, vendedor);
                evento.agregarEntradaVendida(entradaVip);
                vendedor.ventaVip();
                cliente.setEntrada(entradaVip);
                System.out.println("Número de Asiento: " + entradaVip.getNumeroAsiento() +
                        " de " + entradaVip.getCliente().getNombre());
            }
            }

    }


}
