package com.nacho;

public class EntradaVip extends Entrada{
    boolean retiroRegalo = false;

    public EntradaVip(boolean retiroRegalo) {
        this.retiroRegalo = retiroRegalo;
    }

    public EntradaVip(double precio, int numeroAsiento, Cliente cliente, Vendedor vendedor) {
        super(precio, numeroAsiento, cliente, vendedor);
        this.retiroRegalo = retiroRegalo;
    }

    public boolean isRetiroRegalo() {
        return retiroRegalo;
    }

    public void setRetiroRegalo(boolean retiroRegalo) {
        this.retiroRegalo = retiroRegalo;
    }
}
