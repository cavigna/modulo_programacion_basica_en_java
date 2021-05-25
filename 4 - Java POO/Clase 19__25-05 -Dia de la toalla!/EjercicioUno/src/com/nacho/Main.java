package com.nacho;

public class Main {

    public static void main(String[] args) {
	var ventanaCocina = new Ventana();

	ventanaCocina.altura =50;
	ventanaCocina.ancho = 70;
        System.out.println("La ventana tiene el tamaño de: " + ventanaCocina.tamaño());
    ventanaCocina.setCerradaOAbierta();
    ventanaCocina.setCerradaOAbierta();

    var lorito = new Loro();
    lorito.repetir();
    lorito.sumar();



    Tamagochi ruben = new Tamagochi();
        ruben.nombre = "Ruben García";
        ruben.edad = 42;
        System.out.println();
        System.out.println("*** Tamagochi ***");
        System.out.println();
        System.out.println("el nombre del Tangaochi es: "+ ruben.getNombre());
    ruben.comer();
    ruben.ejercitar();
    ruben.ejercitar();
    ruben.comer();
    ruben.dormir();
    ruben.dormir();
    ruben.entretener();

    }
}

/* RESULTADO
La ventana tiene el tamaño de: 3500
La ventana esta abierta
La ventana esta Cerrada
el loro te pregunta una frase:
Hola, como estás?
Goku el loro dice :Hola, como estás?
Goku el loro quiere saber dos numeros:
23
42
Gokuel loro dice: el resultado es:65

*** Tamagochi ***

el nombre del Tangaochi es: Ruben García
Ruben García  no tiene hambre!

*** Ejercitar ***

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
Tengo Hambre
Tengo sueño
Tengo hambre o Sueño!.
Voy a tener que hablar con los muchachos del sindicato
manejalo vos!

*** Comer ***

Ruben García tiene hambre!

Ruben García Esta comiendo
ñam
ñam ñam
ñam ñam ñam
ñam ñam ñam ñam
ñam ñam ñam ñam ñam

Ruben García ya no tiene hambre!

*** Dormir ***

Me voy a dormir ya. No aguanto más.
z
z z
z z z
z z z z
z z z z z
z z z z z z
z z z z z z z
z z z z z z z z
z z z z z z z z z
z z z z z z z z z z
Ya me desperté!!!
Estoy re despierto man!.

*** Aburrido ***

Estoy re bajon, muy aburrido loco...
No me vas a hacer correr como siempre, no?

*** Ejercitar ***

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
Tengo Hambre
Tengo sueño
 */
