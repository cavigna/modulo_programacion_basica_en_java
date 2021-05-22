package com.nacho;

import java.util.Arrays;
import java.util.Scanner;
/*
Ejercicio:
    Crear Arreglos, ingresar valores al arreglo y mostrarlos por pantalla.
    Parte 2: Usuario defina el largo
 */
public class Main {

    public static void main(String[] args) {

    int [] num = new int[3]; // Crear Arrelo

	newItemArray(num);
	imprimirArray(num);
	/* Parte 2
     Que el usuario determine el largo */
    /*  Parte 3
            Caluclar la suma
     */

    /* Parte 4
    * Leer dos arreglos y calcular la suma de sus elementos (1er elemento A + 1er elemento B...) y mostrar los resultados. */

    Scanner scanner = new Scanner(System.in);
    System.out.println("Tamaño Array?");
    int tamaño = scanner.nextInt();
    int [] num2 = new int[tamaño];
    newItemArray(num2);
    imprimirArray(num2);

    // parte 3
    sumaArray(num);
    sumaArray(num2);
        System.out.println(Arrays.toString(num));
    //Part 4//
    sumaDosArray0(num, num2);




    }
    public static void newItemArray(int[]  array){ // Ingresar Valores
        var scanArray = new Scanner(System.in);
        for(var i=0; i<array.length; i++){
            System.out.println("Ingrese un valor");
            array[i] = scanArray.nextInt();
        }
    }
    public static void imprimirArray(int[] array){ // Mostrar en Pantalla
        for(var i: array){
            System.out.println(i);
        }

    }
    public static void sumaArray(int[] array){ // Parte 3
        var suma = 0;
        for(var i=0; i<array.length; i++){
            suma += array[i];
        }
        System.out.println("Suma de Array: " + suma );
    }

    public static void sumaDosArray0 ( int [] a, int []b){
        int suma = a[0] + b[0];
        System.out.println("La suma de los primeros elementos es: " + suma);
    }

}

