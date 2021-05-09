package com.nacho;

public class Main {
    // --- Ejercicio n1 -----//
    // Mostar por pantalla los números de 1 al 100 y del 100 al 1 //
    public static int conteoRecursivoProgresivo(int start, int stop){
        /**
         * Contador Progresivo en un método. Sirve para cualquier número
         * requiere un número de inicio y uno de final
         *
         */
        if (start >= stop){
            return start;
        }
        System.out.println("Conteo progresivo: " + start);
        return conteoRecursivoProgresivo(start+1, stop);
    }

    // ------ Parte 2  -----------//
    public static int conteoRecursivoRegresivo(int start, int stop) {
        if (start <= stop) {
            return stop;
        }

        System.out.println("Conteo regresivo: " + start);
        return conteoRecursivoRegresivo(start-1, stop);
        }
    // --- Ejercicio 2 --- //
    // Sumar los números pares ingresados por el usuario
    public static int sumaPares(int [] array){
         int pares = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i]%2 == 0){
                pares += array[i];
            }

        }
        return pares;

    }
    // --- Ejercicio 3 --- //
    //- Sumar los números pares e impares ingresados por un usuario
    // y contar la cantidad de números pares e impares
    // (la cantidad de números que se ingresan deben ser determinada por el usuario).

    public static int[] sumaParesImpares(int [] array){
        int [] resultado  = new int[4];
        for (int i = 0; i< array.length; i++){
            if (array[i]%2 == 0){
                resultado[0] += array[i];
                resultado[1]++;
            }
            resultado[2] += array[i];
            resultado[3]++;

        }
        return resultado;

    }

    // --- Ejercicio 4 --- //
    // Determinar el mayor número n y el menor numero m de una secuencia de //

    public static int[] mayorMenorN (int [] array){
        int [] resultado = {array[0],array[0]};


        for(int i = 0; i< array.length-1; i++){
            if (array[i]<= resultado[0]){
                    resultado[0] = array[i]; // Menor Número

            }
            if (array[i]>= resultado[1]){
                    resultado[1] = array[i]; // Mayor Número
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
	// write your code here
        int respuesta1 = conteoRecursivoProgresivo(1,100);
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

        int respuesta1a = conteoRecursivoRegresivo(100,1);
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

            int [] arr = {3, 7, 2, 5, 4};
        int respuesta2 = sumaPares(arr);
        System.out.println("***** Ejercicio 2 *****");
        System.out.println();
        System.out.println("La suma de los números Pares son: " + respuesta2);
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        int [] arr2 = {3, 27, 16, 5, 8, 22};

        int[] respuesta3 = sumaParesImpares(arr2);
        System.out.println("***** Ejercicio 3 *****");
        System.out.println();
        System.out.println("La cantidad de numeros pares es de: " + respuesta3[1]);
        System.out.println("Sumando un total de números pares de: " +  respuesta3[0]);
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("La cantidad de numeros impares es de: " + respuesta3[3]);
        System.out.println("Sumando un total de números pares de: " +  respuesta3[2]);

        int[] respuesta4 = mayorMenorN(arr2);
        System.out.println("***** Ejercicio 4 *****");
        System.out.println();
        System.out.println("El mayor número es: " + respuesta4[0]);
        System.out.println("El mayor número es: " + respuesta4[1]);
        System.out.println("----------------------------------");

    }
}
