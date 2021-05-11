package com.nacho.ejericios;

import java.util.Arrays;

public class CuentaCorriente {
    public static double totalAhorrado(double [] arr){
        return Arrays.stream(arr).sum();
    }

}
