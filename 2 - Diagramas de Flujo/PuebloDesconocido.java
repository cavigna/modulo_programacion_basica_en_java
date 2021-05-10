package com.nacho.ejericios;

public class PuebloDesconocido {
    public static int nuevoLimite(int tipo){
        double limiteDouble =0;
        switch (tipo){
            case 1  -> limiteDouble = .25;
            case 2  -> limiteDouble = .35;
            case 3  -> limiteDouble = .40;
            default  -> limiteDouble = .50;
        }


        return (int) limiteDouble;
    }


}
