package com.nacho;

public class Vendedor extends Persona {
    private int entradasRegular;
    private int entradasVip;
    private int totalEntradas;
    

    public Vendedor(String nombre, String rut, int birthDate) {
        super(nombre, rut, birthDate);
        this.entradasRegular = 0;
        this.entradasVip = 0;
        this.totalEntradas = this.entradasRegular + this.entradasVip;
    }

    public void ventaEntrada(Evento evento, Cliente cliente, int cantidad, boolean vip) {
        boolean checkEdad = cliente.getEdadHoy() >= evento.getEdadMin();
        System.out.println(checkEdad);
        if (checkEdad) {
            if (!vip) {
                evento.ventaEntradasRegulares(cantidad, cliente, getNombre());
                
                this.entradasRegular+=cantidad;
                System.out.println("Entrada Vendida");
            } else {
                evento.ventaEntradasVIP(cantidad, cliente, getNombre());
                this.entradasVip+=cantidad;

            }

        } else {
            System.out.println("Ud no tiene la edad mínima para el evento");
        }
    }

    public String toString() {
        String respuesta = getNombre() + getRut();
        return respuesta;
    }

    public int getTotalEntradas() {
        return entradasRegular + entradasVip;
    }
}
