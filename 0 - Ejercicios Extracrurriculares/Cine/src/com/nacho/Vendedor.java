package com.nacho;



public class Vendedor extends Persona {
    private int cantEntradasVendidas;


    public Vendedor(String nombre, String rut, int birthDate){
        super(nombre, rut, birthDate);
        this.cantEntradasVendidas= 0;
    }



    public void ventaEntrada(Evento evento, Cliente cliente){
        boolean checkEdad = cliente.getEdadHoy() >= evento.getEdadMin();

        if(checkEdad){

        }else{
            System.out.println("Ud no tiene la edad mínima para el evento"); 
        }



    }

    public String toString(){
        String respuesta = getNombre() + getRut();
        return respuesta;
    }

    public int getCantEntradasVendidas() {
        return cantEntradasVendidas;
    }

    public void setCantEntradasVendidas(int cantEntradasVendidas) {
        this.cantEntradasVendidas = cantEntradasVendidas;
    }
}
