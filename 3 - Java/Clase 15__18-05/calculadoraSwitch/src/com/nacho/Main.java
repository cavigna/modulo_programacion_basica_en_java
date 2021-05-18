package com.nacho;

/*
Calculadora Simple con Switch.
 */


public class Main {

    public static void simpleCalc(int n1, int n2, char op) {

        switch (op) {
            case '+' -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            case '-' -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            case '*' -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            case '/' -> System.out.println(n1 + " * " + n2 + " = " + (1.0 * n1 / n2));
        }


    }

    public static void main(String[] args) {
        System.out.println("Adición");
        System.out.println("---------------");
        System.out.println();
        simpleCalc(2, 3, '+');
        System.out.println();
        System.out.println("Substracción");
        System.out.println("---------------");

        System.out.println();
        simpleCalc(2, 3, '-');
        System.out.println();

        System.out.println("Multiplicación");
        System.out.println("---------------");
        simpleCalc(2, 3, '*');
        System.out.println();

        System.out.println("División");
        System.out.println("---------------");

        simpleCalc(2, 3, '/');
    }
}
