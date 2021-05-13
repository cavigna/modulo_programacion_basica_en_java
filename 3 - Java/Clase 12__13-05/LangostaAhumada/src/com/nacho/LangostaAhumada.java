// ----- LANGOSTA AHUMADA ----- //

package com.nacho;

public class LangostaAhumada {

    // ------ Ejercicio n4 ----//
    public static int langostaAhumada(int cantidadComensales){
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
}
