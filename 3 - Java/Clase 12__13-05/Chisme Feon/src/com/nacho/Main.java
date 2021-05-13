package com.nacho;
// Chismefeon


// 1 - Primeros 5 min   ==> 100 p/min
// 2 - Siguientes 3 min ==> 80 p/min
// 3 - Siguientes 2 min ==> 70 p/min
// 4 - Mayor de 10 min == >50 p/min
// Dia Hábil - Matutino 15% Vespertino 10%
// Domingo - 3%

import java.util.Scanner;

public class Main {
    public static double costoLlamada(int minutos, String diaHabil, String horario){

        double costoTotal;
        double sobrecargo = 1.03;
        if(minutos<=5) {
            costoTotal = minutos * 100;
        }
        else if(minutos<=8){
            costoTotal = 500 + ((minutos -5) * 80);
        }

        else if (minutos<=10)
        { costoTotal= 740 + ((minutos - 8) * 70);}

        else{costoTotal = 880 +((minutos - 10 )*50);}

        if (diaHabil.equals("si")) {
            if(horario.equals("mañana")){
                sobrecargo =1.15;
            }
            else{
                sobrecargo=1.10;
            }
                        }
       return costoTotal * sobrecargo;


    }
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //new int minutos =

        double telefono = costoLlamada(15,"si", "mañana");
        System.out.println(telefono);
    }
}
