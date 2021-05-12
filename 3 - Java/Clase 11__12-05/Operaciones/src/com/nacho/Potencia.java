package com.nacho;

public class Potencia {
    public static int potencia(int base, int potencia) {
        int res = 1;
        if (potencia <= 1) {
            return base*base;
        }
        //return potencia(base, potencia-1);
        for (int x = 1; x<=potencia; x++){
            res *= base;
        }

        return res;


    }
}
