package com.nacho;



public abstract class Persona {
    private String nombre;
    private int edad;
    private String puesto;

    public Persona(String nombre, int edad, String puesto){
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;

    }

    public void hablar(String frase){
        System.out.println(getNombre() + ": " + frase);
    }

    public void caminar(){
        System.out.println("""
                            Estoy caminando....
                               O
                            / /\\_,               
                             / \\                      
                            /_  /_
                """);
    }

    public abstract  void actividadPrincipal();
    public abstract void actividiadSecudnaria();


    /* Getters and Setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Soy " + getNombre() + " mi edad es "
                + getEdad() + " y mi trabajo es de "
                + getPuesto();
    }
}
