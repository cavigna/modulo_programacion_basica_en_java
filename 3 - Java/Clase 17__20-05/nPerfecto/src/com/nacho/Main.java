package com.nacho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	var scanner = new Scanner(System.in);
        System.out.println("Escriba un n°: ");
        int numero = scanner.nextInt();
    nPerfecto(numero);


    }

    public static void nPerfecto(int n){
        int suma = 0;
        for(int i = 1; i<n; i++){
            if (n%i==0) {
                suma += i;
            }
             }
        if (suma == n){
            System.out.println("El n° " + n + " es perfecto!");
        } else {
            System.out.println("El n° " + n + " NO es perfecto!");
        }

    }

}

/*
Un número es perfecto si es igual a la suma de todos sus divisores positivos
sin incluir el propio número.
por ejemplo, el número 6 es perfecto. El tiene como divisores: 1, 2, 3 y 6
pero el 6 no se cuenta como divisor para comprobar si es perfecto.
Si sumamos 1 + 2 + 3 = 6
Los siguientes números perfectos después del 6 son:
28
496
8128
33550336,
8589869056.
Realizar programa que pida por teclado un número y muestra si es perfecto o no.
 */

