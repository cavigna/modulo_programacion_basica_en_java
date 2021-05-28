package com.nacho;

public class Main {

    public static void main(String[] args) {
        String imprimir = "Fecha Correcta?: ";
        /* Fechas Incorrectas */
        System.out.println(" ---- FECHAS INCORRECTAS ----");
        System.out.println();
        var diaIncorrecto =new Fecha(-15,3,1927);
        System.out.println(imprimir + diaIncorrecto.fechaCorrecta());
        var mesIncorrecto = new Fecha(21, 42, 1332);
        System.out.println(imprimir + mesIncorrecto.fechaCorrecta());

        /* Bisiesto*/
        System.out.println();
        System.out.println(" ---- AÑO BISIESTO ----");
        System.out.println();
        var bisiesto = new Fecha(27,2,2020);
        System.out.println("Fecha Ingresada:" + bisiesto);
        System.out.println();
        System.out.println(imprimir + bisiesto.fechaCorrecta());
        System.out.println();
        System.out.println("Los próximos 5 dias son:");
        bisiesto.printDiaSiguiente(5);

        /* NO Bisiesto*/
        System.out.println();
        System.out.println(" ---- AÑO NO BISIESTO ----");
        System.out.println();
        var noBisiesto = new Fecha(27,2,2018);
        System.out.println("Fecha Ingresada:" +noBisiesto);
        System.out.println();
        System.out.println(imprimir + noBisiesto.fechaCorrecta());
        System.out.println();
        System.out.println("Los próximos 5 dias son:");
        noBisiesto.printDiaSiguiente(5);

        /* Año Nuevo*/
        System.out.println();
        System.out.println(" ---- AÑO Nuevo ----");
        System.out.println();
        var añoNuevo = new Fecha(30,12,2020);
        System.out.println("Fecha Ingresada:" +añoNuevo);
        System.out.println();
        System.out.println(imprimir + añoNuevo.fechaCorrecta());
        System.out.println();
        System.out.println("Los próximos 5 dias son:");
        añoNuevo.printDiaSiguiente(5);

  }







}
