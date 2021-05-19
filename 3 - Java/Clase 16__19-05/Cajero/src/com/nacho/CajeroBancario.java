package com.nacho;

import java.util.Scanner;

public class CajeroBancario {
    private double saldo;
    private Scanner input = new Scanner(System.in);

    public CajeroBancario(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirSaldo() {
        System.out.println("Su saldo es: " + this.saldo);

    }

    public void transaccion() {
        int opcion;
        System.out.println("1. Retirar ");
        System.out.println("2. Depositar");
        System.out.println("3. Balance");
        System.out.println("4. Salir");
        System.out.println("---------------------" +
                "Elija opción " +
                "---------------------");
        opcion = input.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("Por favor, ingrese monto a retirar");
                var monto = input.nextDouble();
                if (monto > saldo || saldo == 0) {
                    System.out.println("No tenés tarasca!");
                    otraTransaccion();

                } else {
                    saldo -= monto;
                    System.out.println("Ud retiró: $" + monto);
                    imprimirSaldo();

                }
                break;
            }

            case 2:{

                System.out.println("Por favor, ingrese monto a depositar");
                var deposito = input.nextDouble();
                saldo += deposito;
                System.out.println("Ud depositó: $" + deposito);
                imprimirSaldo();
                otraTransaccion(); // ==> llamada a funcion otra Transacción
                break;

            }
            case 3: {
                imprimirSaldo();
                otraTransaccion();
                break;
            }
            case 4: {
                System.out.println("Muchas Gracias. Vuelvas Prontos");
                break;
            }

            default:
                throw new IllegalStateException("Valor Incorrecto" + opcion);
        }

    }

    public  void otraTransaccion(){
        System.out.println("Quiere continuar usando este Cajero?");
        System.out.println("s-n");
        String res = input.next();
        switch (res){
            case "s" -> {
                transaccion(); //==>  Llamo a la función transaccion(); o sea, el Menú
                break;
            }
            case "n" -> {
                System.out.println("Muchas Gracias");
                break;
            }
            default -> {
                System.out.println("Opcion Incorrecta");
                transaccion();
                break;
            }
        }

    }


}
