package com.nacho;
 //  NUMEROS PRIMOS MULTIPLICACION //
import java.util.Scanner;

public class Main {
    public static int  checkPrime(int numero){
        int resultado = 1;

        for( int i = 2;  i<=numero; i++){
        if (numero%i == 0){
            //System.out.println(numero + "No es primo");
            break;
        }
        else{
            //System.out.println(numero + "Si es primo");
            resultado = numero;
        }

        }
        return resultado;
    }

    public static int multPrimo(int total){
        int resultado = 1;
        int contador= 0;
        while(contador<total){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su número : ");
            int numero = scanner.nextInt();

            if(numero==0 || numero ==1){
                System.out.println(numero + " No Es número primo");
            }
            else{
                System.out.println();
                resultado *= checkPrime(numero)>1 ? numero :1;
            }

            contador+=1;
        }
        return resultado;

    }


    public static void main(String[] args) {
        //System.out.println(checkPrime(3));
        //System.out.println(multPrimo(2));
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Cuantos números desea multiplicar?: ");
        int total_num = scanner1.nextInt();
        System.out.println("El resultado es: " + multPrimo(total_num));


    }
}

