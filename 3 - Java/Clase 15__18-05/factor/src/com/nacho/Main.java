package com.nacho;

/* calcular el factorial del cualquier
número n
 */


public class Main {
    public static void factorial(int totalN) {
        var acum = 1;
        for (var i = 1; i <= totalN; i++) {
            acum *= i;
        }
        System.out.println(totalN + "!" +
                " = " + acum);
    }



    public static void main(String[] args) {
        for (var i = 0; i <= 10; i++) {
            factorial(i);
        }

    }
}
