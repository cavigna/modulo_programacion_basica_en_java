// ----- LANGOSTA AHUMADA ----- //

package com.nacho;

import java.util.Scanner;

public class Main {
    //Creación de un Método
    public static int langostaAhumadaMain(int cantidadComensales){
        int costoXpersona;
        if (cantidadComensales>=200 && cantidadComensales<=300){
            costoXpersona = 8500;
        }
        else if( cantidadComensales>300){
            costoXpersona = 7500;
        }
        else{
            costoXpersona = 9500;
        }

        return  (costoXpersona * cantidadComensales);

    }



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int numPersona = scanner.nextInt();
            System.out.println("Cuantos comensales tendremos el agrado de" +
                    " agasajar: " + numPersona);
            //con método
            int soloMetodo = langostaAhumadaMain(numPersona);
            System.out.println("EL costo total es: " + soloMetodo);
            // con una Clase y un método
            int soloClase = LangostaAhumada.langostaAhumada(numPersona);
            System.out.println("------------------");
            System.out.println();
            System.out.println("EL costo total es: " + soloMetodo);


        }
    }
