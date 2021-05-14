package com.nacho;

// Suma total de números divisibles por un número N.

public class Main {
    public static int multiploFor(int mult, int inicio, int fin){
        int suma = 0;
        for (int i = inicio; i < fin; i++){
            if (i%mult==0){
                suma += i;
                System.out.println(mult +" Es múltiplo de: " + i);
            }
        }
        return suma;
    }

    public static void main(String[] args) {
    int multiploNueve = multiploFor(5, 1,25);
        System.out.println("La suma total es de: " + multiploNueve);

    }
}
