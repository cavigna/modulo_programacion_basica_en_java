package com.nacho;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static int viajeEgreso(int cantidadALumnos){
        int costoIndividual;
        if (cantidadALumnos>=100){
            costoIndividual =6500;
        }
        else if (cantidadALumnos>=50){
            costoIndividual =7000;
        }
        else if (cantidadALumnos>=30){
            costoIndividual =9500;
        }
        else{
            costoIndividual = 40000;
        }


        return costoIndividual * cantidadALumnos;
    }

    public  static int viajeSwitch(int opcion, int cantAlumnos){
        int costo = switch (opcion) {
            case 1 -> 6500; //>100
            case 2 -> 7000; // 50 y 99
            case 3 -> 9500; // 30 a 49
            default -> 40000; //menor 30
        };
        return costo * cantAlumnos;
    }

    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos alumnos viajan:" );
        int cantAlum = scanner.nextInt();
        int costoTotal = viajeEgreso(cantAlum);
        System.out.println("El costo total del viaje: " +costoTotal);
        System.out.println("El costo por alumno es :" + (costoTotal/cantAlum));

        System.out.println();
        System.out.println("---------------");
        System.out.println();

     Scanner scanner1 = new Scanner(System.in);
        System.out.println("Las opciones son: ");
        System.out.println("Opcion 1: Más de 100 alumnos.");
        System.out.println("Opcion 2: entre 50 alumnos y 99.");
        System.out.println("Opcion 3: entre 30 alumnos y 49.");
        System.out.println("Opcion 2: Menos de 30 alumnos.");

        System.out.println("Marque su opción: "  );
        int opcion = scanner.nextInt();
        System.out.println("Cantidad de alumnos? :");
        int cantAlumn = scanner1.nextInt();

        System.out.println("La elección fué opción :" + opcion);
        System.out.println("La cantidad de alumnos es: " + cantAlumn);

        int costoTotalSwitch = viajeSwitch(opcion, cantAlumn);

        System.out.println("El costo total es de: " +  costoTotalSwitch);
        System.out.println("El costo por alumno es: " + costoTotal/cantAlumn );

    }
}
