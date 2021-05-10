package com.nacho;
// Chismefeon
// 1 - Primeros 5 min   ==> 100 p/min
// 2 - Siguientes 3 min ==> 80 p/min
// 3 - Siguientes 2 min ==> 80 p/min
// 4 - Mayor de 10 min == >50 p/min
// Dia Hábil - Matutino 15% Vespertino 10%
// Domingo - 3%
public class ChismeFeon {
    public static double costoLlamada(int minutos, boolean diaHabil){

        int costoTotal = 0;
        if(minutos<=5){costoTotal = minutos * 100;}

        else if(minutos>=8)
        {costoTotal = 500 + ((minutos -5) * 80);}

        else if (minutos>=8 && minutos>=10)
        { costoTotal= 740 + ((minutos -10) * 5);}

        else{costoTotal = 800 +((minutos - 10 )*5);}

        if (diaHabil) return costoTotal*1.03;
        return costoTotal;

    }
}
