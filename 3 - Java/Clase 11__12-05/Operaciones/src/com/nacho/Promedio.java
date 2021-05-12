package com.nacho;

public class Promedio {
    public static double promedio(double [] notas){
        int sum = 0;
        for (double d : notas) sum += d;
        return sum / notas.length;
    }
}
