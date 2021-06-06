package com.nacho;

public class Main {

    public static void main(String[] args) {
	Evento limpBizkitEvent = new Evento("Limp Bizkit", 18);
    Vendedor jVendedor = new Vendedor("Juan Vendedor", "11-11.1", 25);
    Cliente mCliente = new Cliente("Miguel Cliente", "23-23.2", 32);
    Cliente nCliente = new Cliente("Nicanor Cliente", "93-2.3", 15);

    jVendedor.ventaEntrada( limpBizkitEvent, mCliente, 1, false);
    jVendedor.ventaEntrada( limpBizkitEvent, nCliente, 1, false);
    jVendedor.getTotalEntradas();
    
    }
}
