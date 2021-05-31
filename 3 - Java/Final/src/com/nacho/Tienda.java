package com.nacho;

public class Tienda {
    private double caja = 0;
    private Bodega bodega;
    private int numeroComprobante =1;
    public Tienda(){

    }
    public Tienda(Bodega bodega, double caja){
        this.bodega = bodega;
        this.caja = caja;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public boolean stockDisponibleTienda(int codigoProducto, int cantSolicitada){
        return this.bodega.stockDisponibleBodega(codigoProducto, cantSolicitada);
    }

    public void venta(Producto producto, int cantSolicitada, Cliente cliente){
        int codigoProducto = producto.getCodigo();
        boolean hayStockBodega = this.bodega.stockDisponibleBodega(codigoProducto, cantSolicitada);
        if(hayStockBodega && cliente.getSaldo()>cantSolicitada*producto.getPrecio()){
            bodega.retirarProducto(producto, cantSolicitada);
            //producto.setStockProducto(producto.getStockProducto() -cantSolicitada);
            cliente.setSaldo(cliente.getSaldo()-producto.getPrecio());
            setCaja(producto.getPrecio());
            System.out.printf("%s compró %s a un precio de $%s %n", cliente.getNombre(), producto.getNombre(), producto.getPrecio());
            comprobanteCompra();


        }else{
            System.out.println("Ud. no dispone de credito suficente");

        }


    }
    public void comprobanteCompra(){
        String ceros = numeroComprobante<10 ? "000": (numeroComprobante<100 ? "00":"0");
        System.out.println("Su numero de comprobante es: " + ceros + numeroComprobante);
        numeroComprobante++;

    }

}


