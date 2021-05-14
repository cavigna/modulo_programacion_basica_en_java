package com.nacho;

import java.util.Scanner;

/*Determinar la cantidad de números múltiplos de X que fueron ingresados
(la cantidad de números que se ingresan debe ser determinada por el usuario).*/
public class Main {

    public static int contarNPares(int totalNumeros, int multiplo) {

        int cuentaPares = 0;
        for (int i = 1; i <= totalNumeros; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su " + i +"° número: ");
            int numero = scanner.nextInt();
            cuentaPares +=  (numero%multiplo==0) ? 1 : 0;

        }
        return cuentaPares;
    }

    public static void main(String[] args) {
	Scanner scannerPares =new Scanner(System.in);
        System.out.println("Cuantos números desea sumar: ");
        int totalN = scannerPares.nextInt();
        System.out.println("Que múltiplo desea verificar?: ");
        int multiN = scannerPares.nextInt();

    System.out.println("El total de múltiplos de " +
               multiN+ " en su lista" + " son, "
               + contarNPares(totalN, multiN) );

    }
}
