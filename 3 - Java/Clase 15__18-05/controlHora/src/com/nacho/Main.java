package com.nacho;

import java.util.Scanner;
/*

Realizar un programa que lea por teclado tres números
enteros H, M, S (hora, minuto, segundo) y comprueba si la hora que se indican es una hora válida.
Supondremos que leemos una hora en modo 24 horas, es decir
, el valor válido para las horas será mayor o igual que cero y menor que 24.
El valor válido para los minutos y segundos estará comprendido ente 0 y 59 ambos incluidos



 */


public class Main {

    public static void controlador() {
        var scan = new Scanner(System.in);

        System.out.println("Ingrese Hora: ");
        var h = scan.nextInt();
        System.out.println("Ingrese Minutos: ");
        var m = scan.nextInt();
        System.out.println("Ingrese segundos: ");
        var s = scan.nextInt();

        if ((h >= 0 && h <= 24) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
            System.out.println("Son las " + h + " horas con " + m + " minutos y " + s + " segundos. ");
        } else {
            System.out.println("Ud no sabe leer la hora!");
        }


    }

    public static void controladorDos() {
        var scan = new Scanner(System.in);

        System.out.println("Ingrese Hora: ");
        var h = scan.nextInt();
        if (h < 0 || h >= 24) {
            System.out.println(h + "No es hora válida");
            System.out.println("Ingrese hora: ");
            System.out.println("Shhh, pista==>Es entre 0 y 23");
            h = scan.nextInt();
        }

        System.out.println("Ingrese Minutos: ");
        var m = scan.nextInt();
        if (m < 0 || m >= 60) {
            System.out.println(h + "No son minutos válidos");
            System.out.println("Ingrese Minutos: ");
            System.out.println("Shhh, pista==>Es entre 0 y 59");
            m = scan.nextInt();
        }

        System.out.println("Ingrese segundos: ");
        var s = scan.nextInt();
        if (s < 0 || s >= 60) {
            System.out.println(h + "No son segundos válidos");
            System.out.println("Ingrese Segundos: ");
            System.out.println("Shhh, pista==>Es lo mismo que con minutos");
            System.out.println("Shhh, pista==>No te acordás?");
            System.out.println("Buee....., the doy una pista");
            System.out.println("Shhh, pista==>Es entre 0 y 59");
            System.out.println("Ingrese Segundos: ");
            s = scan.nextInt();
        }

        System.out.println("Son las " + h + " horas con " + m + " minutos y " + s + " segundos. ");



    }

    public static void main(String[] args) {
        System.out.println("Version 1.0");
        System.out.println("-------------");
        controlador();
        System.out.println();
        System.out.println("Version 2.0");
        System.out.println("-------------");
        controladorDos();
    }
}
