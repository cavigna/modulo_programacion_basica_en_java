package com.nacho.ejericios;

public class Fibonnacci {
    public static void recursivo(int cantNumeros){
        int n1 =0; int n2=1; int n3;
        if (cantNumeros<=1) System.out.println(cantNumeros);
        n3 =n1 +n2;
        n1= n2;
        n3 =n2;

        //System.out.println(recursivo((n1-1))+recursivo(n-2));

    }
}
