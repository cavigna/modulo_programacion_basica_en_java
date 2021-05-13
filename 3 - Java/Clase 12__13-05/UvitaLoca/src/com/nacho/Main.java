//------------- Ejercicio UVITA LOCAL ----- //


package com.nacho;

import java.util.Scanner;

public class Main {
    // ------Uvita Loca ----//

    public static double uvitaLoca(String tipo, int tamaño, double precioXkilo, double cantidadKilos) {
        int prima;
        if (tipo.equals("A")) {
            if (tamaño == 1) {
                prima = 20;
            }
            prima = 30;
        } else {
            if (tamaño == 1) {
                prima = -30;
            }
            prima = -50;
        }
        return cantidadKilos * (precioXkilo + prima);
    }



        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese tipo Uva (A o B): ");
                String tipoUva = scanner.nextLine();

            System.out.println("Ingrese tamaño Uva (1 o 2): ");
                int tamañoUva = scanner.nextInt();


            System.out.println("Ingrese Precio por Kilo:");
                double precioKilo = scanner.nextInt();

            System.out.println("Ingrese Cantidad de Kilos: ");
                double cantidadKilos = scanner.nextInt();

             double gananciaUva = uvitaLoca(tipoUva, tamañoUva, precioKilo, cantidadKilos);

            System.out.println("SU ganancia es de : " + gananciaUva);
        }

}
