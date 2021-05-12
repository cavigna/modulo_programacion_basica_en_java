package com.nacho;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int entero = 23, enteroNeg = -12;
        byte bit =122;
        short corto = 3;
        float flotante = 23.06f;
        double doble = 23.06;
        boolean booleano = true;
        long largo = 123336668;
        char catracter = 'Z';

        int suma = entero + enteroNeg;
        int resta = entero - enteroNeg;
        int division = entero / enteroNeg;
        int multip = entero * enteroNeg;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(division);
        System.out.println(multip);

        // Cree una clase llamada potencia. Permite hacer potencia en
        // números enteros positvos.
        System.out.println(Potencia.potencia(3,3));

        // Promedio Notas

        double nota1 =4.3, nota2 =6.5, nota3= 6.8, nota4=3.2;

        double promedioSimple = (nota1 + nota2 + nota3 + nota4)/4;
        double[] promedioComp = {1, 2, 3, 4};

        System.out.println(promedioSimple);

        //Promedio con una Clase creada
        System.out.println(Promedio.promedio(promedioComp));

        // TODO Cree una clase con un ARRAY, para intercambiar los números.
        int [] inter = Intercambiar.intercambio(3,1);

        System.out.println(Arrays.toString(inter));

        // Cree una clase con un método para comprobar si un
        //numero es mayor o menor a cero
        System.out.println(IfElse.siono(50));
        System.out.println(IfElse.siono(-50));
        System.out.println(IfElse.siono(0));


        //Scanner leer = new Scanner(System.in);

        //double numero;
        //System.out.println("Ingresar Nota");
        //numero = leer.nextDouble();
        //System.out.println("Numero ingresado");

    }
}
