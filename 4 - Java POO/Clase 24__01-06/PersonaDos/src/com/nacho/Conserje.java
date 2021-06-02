package com.nacho;



public class Conserje  extends Persona{

    public Conserje(String nombre, int edad, String puesto){
        super( nombre,  edad, puesto);

    }

    @Override
    public void actividadPrincipal() {
        System.out.println("Mis funciones son: ");
        hablar("Abrir Puerta.");
        hablar("Recibir paquetes");
        System.out.println();
        System.out.println();

    }

    @Override
    public void actividiadSecudnaria() {
        hablar("Vigilar");
        hablar("Controlar ingreso y egreso de Personas");
    }


}
