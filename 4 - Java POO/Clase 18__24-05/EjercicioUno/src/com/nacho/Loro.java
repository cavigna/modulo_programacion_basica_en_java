package com.nacho;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Loro {
    String nombre;
     private Scanner scanner = new Scanner(System.in);

    public void repetir(){

        System.out.println("el loro te pregunta una frase: ");
        String hablar = scanner.nextLine();
        System.out.println(nombre + " el loro dice :" + hablar);
    }

    public void sumar (){
        System.out.println(nombre + " el loro quiere saber dos numeros: ");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(nombre + "el loro dice: " + "el resultado es:" + (a+b));

    }
}
