package com.nacho.ejericios;
/*Todavía no vimos OOP */
/*
El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la consulta con
base en el número de cita, de la siguiente forma:
• Las tres primeras citas a $200.00 c/u.
• Las siguientes dos citas a $150.00 c/u.
• Las tres siguientes citas a $100.00 c/u.
• Las restantes a $50.00 c/u, mientras dure el tratamiento.
Se requiere un algoritmo para determinar:
• Cuánto pagará el paciente por la cita.
• El monto de lo que ha pagado el paciente por el tratamiento.
 */
public class TeMata {
      public static int costoCita(int numeroCita){
        if      (numeroCita<=3){ return numeroCita*200;}
        else if (numeroCita<=5){ return numeroCita*150;}
        else if (numeroCita<=8){ return numeroCita*100;}
        else {return numeroCita*50;}

    }

    public static int costoTotal(int numeroCita){
        if      (numeroCita<=3) return numeroCita*200;
        else if (numeroCita<=5) return (numeroCita*150 + 600);
        else if (numeroCita<=8) return numeroCita*100 + 1050;
        else {return numeroCita*50 +1250;}

    }
}
