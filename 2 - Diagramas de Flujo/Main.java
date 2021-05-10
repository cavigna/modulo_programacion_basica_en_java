package com.nacho;

public class Main {
    // ----Ejercicio n1 ------//
    public static double metrosApulgadas(double metros){

        return metros/0.0254;
    }
    // ---- Ejercicio n2 ----//
    public static int lapicesApagar(int cantidadLapices){
        if (cantidadLapices >= 1000){
            return cantidadLapices * 85;
        }
        else{
            return  cantidadLapices * 90;
        }
    }

    // ------ Ejercicio n3 ---//
    public static double harapientoDistinguido(double precioOriginal){
        /*double [] precioDescuento = new double[2];*/
        if (precioOriginal >= 250000){
            return  precioOriginal -(precioOriginal*.15);
         /*   precioDescuento[0] = precioOriginal * 0.15;
            precioDescuento[1] = precioOriginal - precioDescuento[0];
            return  precioDescuento;*/ // Revisar hacerlo con ARRAY
        }

        else{
//            precioDescuento[0] = precioOriginal * 0.08;
//            precioDescuento[1] = precioOriginal - precioDescuento[0];
            return  precioOriginal -(precioOriginal*.08);        }

    }

    // ------ Ejercicio n4 ----//
    public static int langostaAhumada(int cantidadComensales){
        int costoXpersona;
        if (cantidadComensales>=200 && cantidadComensales<=300){
            costoXpersona = 8500;
        }
        else if( cantidadComensales>300){
            costoXpersona = 7500;
        }
        else{
            costoXpersona = 9500;
        }

        return  (costoXpersona * cantidadComensales);

    }

    // ------ Ejercicio n5 ----//

    public static int uvitaLoca(String tipo, int tamaño, int precioXkilo, int cantidadKilos){
        int prima;
        if (tipo == "A"){
            if (tamaño == 1){
                prima = 20;
            }
            prima = 30;
        }
        else{
            if (tamaño == 1){
                prima = -30;
            }
            prima = -50;
        }

        return cantidadKilos * (precioXkilo + prima);
    }

    // ----- Ejercicio n6 ---//
    public static int viajeEgreso(int cantidadALumnos){
        int costoTotal;
        if (cantidadALumnos>=100){
            costoTotal =6500;
        }
        else if (cantidadALumnos>=50){
            costoTotal =7000;
        }
        else if (cantidadALumnos>=30){
            costoTotal =9500;
        }
        else{
            costoTotal = 40000;
        }


        return costoTotal;
    }

    public static void main(String[] args) {

    double respuesta1 = metrosApulgadas(23);
        System.out.println("Cantidad de pulgadas a pedir:" + respuesta1 );

    int respuesta2 = lapicesApagar(2000);
        System.out.println("El costo total es de " + respuesta2);

    double respuesta3 = harapientoDistinguido(32000);
        System.out.println("El descuent0 es de :" + (32000-respuesta3) +
                        "Entonces el precio final es de: "    + respuesta3);

    int respuesta4 = langostaAhumada(250);
        System.out.println("El costo total es de: " + respuesta4);

    int respuesta5 = uvitaLoca("A", 2, 80, 120);
        System.out.println("Sus ingresos son :" + respuesta5);

    int respuesta6 = viajeEgreso(93);
        System.out.println("El costo total es del viaje es : " + respuesta6);

    }



}
