package com.nacho;

public class NaufragoSatisfecho {
    public static int costoHamburguesa(String tipoHamburguesa, int cantHamburguesa,
                                       boolean tarjeta){
        int costo = 0;
        switch (tipoHamburguesa){
            case "sencillo" -> costo = cantHamburguesa * 2000;
            case "doble" -> costo = cantHamburguesa * 2500;
            case "triple" -> costo = cantHamburguesa * 2800;
        }
        if (tarjeta) return (int) (costo*1.05);
        return costo;


    }
}
