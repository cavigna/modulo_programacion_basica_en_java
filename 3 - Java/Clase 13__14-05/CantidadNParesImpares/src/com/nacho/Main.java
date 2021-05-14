package com.nacho;

import java.util.Scanner;

// Contar y sumar Pares e inpares. Determinar cuales es mayor el numero y la suma //
public class Main {
    public static int[] paresImpares(int totalNumeros){
        int [] paImpa = new int[4];
        int sumaPares = 0,  totalPares = 0;
        int sumaImpares = 0 , totalImpares = 0;
        for(int i =0 ; i<=totalNumeros; i++){
            Scanner scanner1 = new Scanner(System.in);
                System.out.println("Ingrese" + i +"número: ");
                int numero = scanner1.nextInt();
            if(numero%2==0){ sumaPares +=numero; totalPares+=1;}
            else{sumaImpares +=numero; totalImpares+=1;}
        }
        paImpa[0] = sumaPares; paImpa[1] = totalPares;
        paImpa[2] = sumaImpares; paImpa[3] = totalImpares;
        return paImpa;


    }


    public static void main(String[] args) {

    }
}
