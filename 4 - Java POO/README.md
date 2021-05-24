# Parte 4 - Programacion en  Java

##  Clase 18  | 24/05

Empezamos con **Programación Orientada a Objetos**.</br> 
Por mi cuenta investigué como funcionaban los constructores.</br>
Los ejercicios de hoy, me plantearon el desafió de pensar creativamente en aplciar una clase.
</br>

Después de mucha reflexión puedo afirmar energicamente que estoy particularmente orgulloso de la clase *Tamagochi* de mi autoria:


``` java
public class Tamagochi {
    String nombre;
    int edad;
    boolean tieneHambre = false;    
    boolean estaAburrido = true;
    boolean tieneSueño = false;

    public String getNombre() {

        return nombre;
    }

    public void comer(){
        if(tieneHambre){
            System.out.println("");
            System.out.println("*** Comer ***");
            System.out.println("");
            System.out.println(nombre + " tiene hambre!");
            System.out.println(" ");
            System.out.println(nombre + " Esta comiendo");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("ñam ");
                }
                System.out.println();
            }
            tieneHambre = !tieneHambre;
            System.out.println("");
            System.out.println(nombre + " ya no tiene hambre!");

        }        else{
            System.out.println(nombre + "  no tiene hambre!");
        }

    }

    public void ejercitar(){
        if (!tieneHambre && !tieneSueño){
            System.out.println("");
            System.out.println("*** Ejercitar ***");
            System.out.println("");
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* " );
                }
                System.out.println();
            }
            tieneHambre = true;
            System.out.println("Tengo Hambre");
            tieneSueño = true;
            System.out.println("Tengo sueño");

        }
        else{
            System.out.println("Tengo hambre o Sueño!.");
            System.out.println("Voy a tener que hablar con los muchachos del sindicato");
            System.out.println("manejalo vos!");
        }

    }

    public void dormir(){
        if (tieneSueño){
            System.out.println("");
            System.out.println("*** Dormir ***");
            System.out.println("");
            System.out.println("Me voy a dormir ya. No aguanto más.");
            tieneSueño = !tieneSueño;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("z " );
                }
                System.out.println();
            }
            System.out.println("Ya me desperté!!!");
        }
        else {
            System.out.println("Estoy re despierto man!.");
        }
    }
    public void entretener(){
        if(estaAburrido){
            System.out.println("");
            System.out.println("*** Aburrido ***");
            System.out.println("");
            System.out.println("Estoy re bajon, muy aburrido loco...");
            System.out.println("No me vas a hacer correr como siempre, no? ");
            estaAburrido = !estaAburrido;
            ejercitar();
        }
    }

}
// en MAIN

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

/* Output

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

```

## Clase 21  | 24/05
