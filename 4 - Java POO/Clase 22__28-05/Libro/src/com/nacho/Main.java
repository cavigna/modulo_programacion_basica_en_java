package com.nacho;

public class Main {

    public static void main(String[] args) {

        var aleph = new Libro("El Aleph","Jorge Luis Borges", 5, 1);
        System.out.println("Valor Inicial==>" + aleph);
	    loopRecursivo(7, aleph);
	    aleph.devolver();
	    aleph.getNumPrestados();
        System.out.println();
        System.out.println(aleph);
	    aleph.prestar();
        System.out.println(aleph);
        aleph.prestar();


    }
    public static void loopRecursivo(int cantPrestar, Libro libroAPrestar){
        if(libroAPrestar.ejemplaresRemanentes() == 0) {
            System.out.println("***********");
            System.out.println("No hay más stock");
            System.out.println("***********");
        }else{
            libroAPrestar.prestar();
            loopRecursivo(cantPrestar - 1, libroAPrestar);
        }
    }
}
