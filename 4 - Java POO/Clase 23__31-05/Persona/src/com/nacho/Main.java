package com.nacho;

import java.util.ArrayList;

/* Crear una superclase Persona con sus respectivos atributos y metodos propios de la clase,
luego a partir de esa clase como mínimo tres subclases (hacerle métodos abstractos).

 */
public class Main {

    public static void main(String[] args) {
        Adulto rubenRamirez = new Adulto("Programador", "Ruben", "Ramirez",29);
        Infante jimenoJuarez = new Infante("Jimeno", "Juarez", 3);
        Infante marceloMoretti = new Infante("Marcelo", "Moretti", 75);


        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(rubenRamirez);
        personas.add(jimenoJuarez);
        personas.add(marceloMoretti);

        for(Persona persona:personas){
            System.out.println("*** ***");
            persona.toString();
            System.out.println();
            persona.actividadLaboral();
            persona.actividadRecreativa();
            persona.dormir();
            persona.contarHastaN(12);
        }
    }
}
