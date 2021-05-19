package com.nacho;
import java.util.Scanner;

/* Realizar una calucladora simple */

public class Main {
    public static void simpleCalc(int n1, int n2, char op) {

        switch (op) {
            case '+' -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            case '-' -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            case '*' -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            case '/' -> System.out.println(n1 + " * " + n2 + " = " + (1.0 * n1 / n2));
            case '^' -> System.out.println(n1 + " ^ " + n2 + " = " + Math.pow(1.0*n1,1.0*n2));
            case 'r' -> System.out.println(n1 + " ^ " + n2 + " = " + Math.sqrt(1.0*n1));

        }
    }

    public static void interactivoCalc(){
        boolean terminar = true;
        Scanner scanner = new Scanner(System.in);
        while(terminar){
            System.out.println("------------------");
            System.out.println("Calculadora Casera");
            System.out.println("------------------");
            System.out.println("Desea continuar? (si-no)" );
            String respuesta = scanner.next();
            if(respuesta.equals("no") || respuesta.equals("n")) {
                System.out.println("Muchas Gracias por usar Calculadora Casera");
                terminar = false;
            }
            else{
                System.out.println("Ingrese un numero seguido por la operación\n" +
                        "finalizando con el segundo número:");
                System.out.println("Elegir entre: + | - | * | / | ** | r");
                int num1= scanner.nextInt();
                char op = scanner.next().charAt(0);
                int num2= scanner.nextInt();
                System.out.println("");
                System.out.println("****** Resultado *******");
                simpleCalc(num1, num2, op);

            }
        }
    }

    public static void main(String[] args) {
	interactivoCalc(); // llamando a la calculadora
    }

}
