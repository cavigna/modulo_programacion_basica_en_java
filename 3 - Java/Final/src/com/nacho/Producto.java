package com.nacho;

public class Producto {
    private String nombre;
    private String descripcion;
    private int codigo;
    private  double precio;
    private int stockProducto = 0;

    public Producto(){}
    public Producto(int codigo){
        this.codigo = codigo;
    }
/*
* TAL VEZ SOLO CON EL CODIGO CREAMOS EL OBJETO Y EL RESTO QUE LO CARGUE EL USUARIO.
* */
    public Producto(String nombre, String descripcion, int codigo, double precio, int stockProducto){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.stockProducto = stockProducto;
                //Math.max(0, stockProducto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public boolean hayStock(int cantidadCompra){
        return cantidadCompra<=  getStockProducto();
    }
//    public void modificarInventario(int cantidad){
//        if(cantidad>0){
//
//        }
//    }

}
