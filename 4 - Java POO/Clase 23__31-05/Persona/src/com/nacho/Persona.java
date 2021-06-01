package com.nacho;

public abstract class  Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private  String prefijo ;

    public Persona(){}

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad<0 ? 0 : this.edad;
        this.prefijo = this.nombre + " dice :";

    }


    public abstract void actividadLaboral();

    public abstract void actividadRecreativa();

    public abstract void dormir();




    public void hablar(String Frase){
        System.out.println(this.nombre+ " dice: " +Frase);
    }

    public  abstract void contarHastaN(int n);

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
