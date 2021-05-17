package com.nacho;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

// Contar y sumar Pares e impares. Determinar cuales es mayor el numero y la suma //

public class Main {

 // versión 2.0

    public static String imparesPares ( int totalNumeros) {
        var paImpa = new ArrayList<Integer>();
        var cuentaImpares = 0;
        var cuentaPares =0;


        for (int i = 0; i <= totalNumeros - 1; i++) {
            var scanner1 = new Scanner(System.in);
            System.out.println("\nIngrese su: " + (i+1) + "° número: ");
            int numero = scanner1.nextInt();
            paImpa.add(i, numero);
            if (numero%2==0) { cuentaPares+=1;}
            else {cuentaImpares += 1;}
        }
        Predicate<Integer> evenFunc = a -> a%2 == 0;
        Predicate<Integer> oddFunc = evenFunc.negate();


        int sumaPares = paImpa.stream().filter(evenFunc).mapToInt(a -> a).sum();
        int sumaImpares = paImpa.stream().filter(oddFunc).mapToInt(a -> a).sum();

        String sumaString = sumaPares > sumaImpares ? "La suma total de 'Pares' es " + sumaPares :
                "La suma total de 'Impares' es " + sumaImpares;
        String conteo = cuentaPares> cuentaImpares ?  "El mayor conteo fue : " + cuentaPares + " números Pares":
                  "El mayor conteo fue : " + cuentaImpares + " números Impares";


        return sumaString + "\n" +  conteo ;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿ Cuantos números desea ingresar ?: ");
         int  nTotal = scanner.nextInt();

        System.out.println(imparesPares(nTotal));

    }
}



// version 1.0

/*
    public static String paresImpares(int totalNumeros){

        ArrayList<Integer> paImpa = new ArrayList<Integer>();
        int sumaPares = 0,  totalPares = 0;
        int sumaImpares = 0 , totalImpares = 0;
        for(int i =0 ; i<=totalNumeros-1; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Ingrese" + i +"número: ");
            int numero = scanner1.nextInt();
            if(numero%2==0){ sumaPares +=numero; totalPares+=1;}
            else{sumaImpares +=numero; totalImpares+=1;}
        }
        paImpa.set(0, sumaPares); paImpa.set(1, totalPares);
        paImpa.set(2, sumaImpares); paImpa.set(3, totalImpares);


        String suma = paImpa.get(0)> paImpa.get(2) ? "La suma total de 'Pares' es " + paImpa.get(0) :
                "La suma total de 'Impares' es " + paImpa.get(2);
        String conteo = paImpa.get(1)> paImpa.get(3) ? "El mayor conteo fue : " + paImpa.get(1) + "Pares" :
                "El mayor coneto fue : " + paImpa.get(3) + "Impares";
        return conteo+suma;


    }
 */
