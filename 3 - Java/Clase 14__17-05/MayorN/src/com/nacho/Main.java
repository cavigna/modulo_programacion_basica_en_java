package com.nacho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
Ejercicio 2:

Utilizando los ciclos iterativos, crear un programa que permita determinar
 el mayor de N números ingresados por el usuario.
* */
public class Main {

    public static String mayorN (int totalNumeros){
        var numerosN = new ArrayList<Integer>();
        for (var i = 0; i<=totalNumeros-1; i++){
            var scanner = new Scanner(System.in);
            System.out.println("Ingrese su número: ");
            var numero = scanner.nextInt();
            numerosN.add(i, numero);
        }

        return "El mayor número ingresado fué: " + Collections.max(numerosN);
    }
/* Al ejercicio anterior, le agregué la opción de elegir si quiere el mayor o menor */
    public static String menorOMayor(int totalN, String maxoMin){
        var numerosN = new ArrayList<Integer>();
        for (var i = 0; i<=totalN-1; i++){
            var scanner = new Scanner(System.in);
            System.out.println("Ingrese su " + (i+1) +"° número: ");
            var numero = scanner.nextInt();
            numerosN.add(i, numero);
        }

        return maxoMin.equals("max") ? "El mayor número ingresado fué: " + Collections.max(numerosN):
                "El menor número ingresado fué: " + Collections.min(numerosN);
    }






    public static void main(String[] args) {
	// write your code here
        //System.out.println(mayorN(3));
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos números desea agregar? : ");
        int tn = scanner.nextInt();
        System.out.println("max o min");
        String maxMin = scanner.next();
        System.out.println(menorOMayor(tn,maxMin));

    }
}
