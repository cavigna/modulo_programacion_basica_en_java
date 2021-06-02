package com.nacho;

public class Gerente extends Persona{

    public Gerente(String nombre, int edad, String puesto){
        super( nombre,  edad, puesto);

    }

    @Override
    public void actividadPrincipal() {
        hablar("Gerenciar");
        hablar("En realidad, no hago mucho....");


    }

    @Override
    public void actividiadSecudnaria() {
        hablar("Contratar");
        hablar("Despedir");
    }


}

//    Eso está bien o hay q explicar más?:
//        Problemática:
//        Implementar un sistema de reloj-control en una empresa para regitrar los horarios de inicio
//        y término de los turnos:
//
//        Requerimientos Funcionales:
//        - Registrar horario de entrada
//        - Registar horario de salida
//        - Calcular horas trabajadas al mes
