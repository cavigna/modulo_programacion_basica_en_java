package com.nacho;


/* cada vez que un número sea múltiplo de 3, debe decir Fizz
y cada vez que un número sea múltiplo de 5,
 debe decir Buzz, en el caso que un número sea múltiplo de 3 y 5,
 debe decir FizzBuzz, si el número no es múltiplo,
 se debe mostrar solamente el número.
 */


public class Main {

    public static void fizzBuzz(int totalN) {
        for (var i = 1; i <= totalN; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " ==> FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " ==> Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " ==> Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        fizzBuzz(100);
    }
}
