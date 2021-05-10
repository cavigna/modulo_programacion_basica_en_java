package com.nacho;

public class NaveOlvido {
    public static double costoTotal(int cantPasajeros, String tipoBus, double cantKm){
        double costo = 0;
        if (cantPasajeros>20){
            switch (tipoBus) {
                case "A" -> costo = cantPasajeros * 200;
                case "B" -> costo = cantPasajeros * 250;
                case "C" -> costo = cantPasajeros * 300;
            }

            switch (tipoBus) {
                case "A" -> costo = 20 * 200;
                case "B" -> costo = 20 * 250;
                case "C" -> costo = 20 * 300;
            }
        }
        costo = costo * cantKm * cantPasajeros;
        return costo;
    }
}
