//--------- PROMEDIO -----//


package com.nacho;

import java.util.Scanner;

public class Main {

    public static double promedioNotas(int totalnotas){
        double suma = 0 ;
        for(int i = 0; i<totalnotas; i++){
            System.out.println("Ingrese su nota:");
            Scanner scanner = new Scanner(System.in);
            double nota = scanner.nextDouble();
            suma += nota;

        }
        return suma/totalnotas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Cuantas notas desea promediar?: ");
                int cantNotas = scanner.nextInt();

        double promedio = promedioNotas(cantNotas);

        System.out.println("El promedio de Notas es de : " +  promedio);
    }
}
