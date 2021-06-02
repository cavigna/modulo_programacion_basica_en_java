package com.nacho;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	var conserjeUno = new Conserje("Jan I. Tor", 42, "Conserje");
	var conserjeDos= new Conserje("James Collins", 31, "Conserje");;
	var gerenteUno = new Gerente("Vicente Virgolini", 63,"Gerente Finanzas" );
	Gerente gerenteDos;
	ArrayList<Persona> personas = new ArrayList<>();
	personas.add(conserjeUno); personas.add(conserjeDos); personas.add(gerenteUno);

	for(Persona persona: personas){
		System.out.println(); System.out.println("*** Nueva Persona ***");
		persona.hablar("Aloha");
		System.out.println(persona); System.out.println();
		persona.caminar();

        persona.actividadPrincipal();
        persona.actividiadSecudnaria();
    }



    }
}

/*
ejercicio: Discutir una problemática y pensar en una solución que sea
la implementación de un software (especificar requerimientos funcionales y clases en esa solución).*/


