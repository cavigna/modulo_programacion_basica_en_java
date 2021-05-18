package com.nacho;
/*
Hacer la potencia de un numero n.
Sin recurrir a librerias externas.

 */
public class Main {

    public static void potencia2(int n1, int n2) {
        var potenciaResultado = 1;
        for (var i = 1; i <= n2; i++) {
            potenciaResultado *= n1;
        }
        System.out.println(potenciaResultado);

    }


    public static void main(String[] args) {

        for (var i=1; i<=10; i++){

            System.out.println("3 ^ " + i + " = ");
            potencia2(3, i);
        }



    }
}
