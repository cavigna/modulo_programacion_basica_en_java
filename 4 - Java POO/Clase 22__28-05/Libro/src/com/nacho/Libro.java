package com.nacho;

public class Libro {
    String nombre;
    String autor;
    int numEjemplares;
    int numPrestados;

    public Libro(){ }

    public Libro(String nombre, String autor,  int numEjemplares, int numPrestados){
        this.nombre = nombre;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados>this.numEjemplares? numEjemplares: numPrestados ;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEjemplares() {

        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }
    public boolean sePuedeprestar(){
        return this.numPrestados<this.numEjemplares;
    }

    public int ejemplaresRemanentes(){
        return getNumEjemplares() - getNumPrestados();
    }
    public void prestar(){
        if(sePuedeprestar()){
            System.out.println("Tenemos ejemplares de " + getNombre());
            System.out.println("    Stock Remanente: " + ejemplaresRemanentes());
            System.out.println();
            this.numPrestados += 1;
        }
        else{
            System.out.println("No tenemos más ejemplares de " + getNombre() );
            System.out.println();
        }

    }
    public void devolver(){
        this.numPrestados-=1;
        System.out.println("Se devolvió un ejemplar de " + getNombre());
        System.out.println();
    }

    @Override
    public String toString() {
        return " El libro " + getNombre() + " del autor " + getAutor() +
                " posee un total de " + getNumEjemplares() + " ejemplares con un stock disponible a préstamo de "
                + ejemplaresRemanentes();
    }
}

