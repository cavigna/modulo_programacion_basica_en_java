package com.nacho;

public class EntradaVIP extends EntradaRegular{
    private boolean retiroRegalo =false;
    public EntradaVIP(int numero){
        super(numero);        
    }
    public EntradaVIP(int numero, Cliente cliente, String nombreVendedor){
        super(numero, cliente, nombreVendedor);
    }

    public boolean isRetiroRegalo() {
        return retiroRegalo;
    }

    public void retirarRegalo() {
        if(!retiroRegalo) {
            System.out.println("Ud puede Retirar el Regalo");
            this.retiroRegalo = true;
        }else{
            System.out.println("Ya se retiró el reglalo para esta cuenta!");
        }
    }


}
