# Parte 4 - Programacion en  Java
---- 
## Clase 19  | 25/05

###Conceptos Aprendidos:  
*En Clase:*
* Métodos Constructores
* Sobre Carga de Métodos
* Diferencia entre :
 ```java
 public
 private
 ```
*Fuera de clase:*
- Amplié conocimientos con el curso paralelo que realizo de mooc-fi
- Uso de Array List
- Impresión de ArrayList
- Uso del lenguaje markdown para hacer este archivo que estás leyendo. Por ejemplo:
  - Hacer listas.
  - Lineas Separadoras
  - Emojis :rocket: 


####Primera parte  

Continuamos con **Programación Orientada a Objetos**.</br></br> 
Iniciamos con los métodos constructores, dando lugar a nuevos aprendizajes, en especial la *sobrecarga de métodos*. A diferencia de Python, en Java se pueden crear muchos métodos constructores para diferentes parámetros. Por ejemplo: </br>
</br>


``` java
package com.nacho;

import java.util.ArrayList;


public class AspiradoraRobotin {
    private String nombre = "Cortana";

    private boolean prendido = false; // Check si está prendido o no
    private int deposito = 0; // Deposito de Polvo
    private int bateria = 100; // Nivel De Batería
    private boolean bateriaOk = true;
    private boolean aspiradoCompleto = false; // Si completó o no el aspirado
    private ArrayList<String> robot = new ArrayList<>(); // Lista de robots a limpiar

    private String aviso = " *** Aviso ***";
    private String printName = this.nombre +" dice: "; 
    // Variable para no escribir tanto. Si, sé que podría usar
    // un getter o toString. Per elegí esto.




    public AspiradoraRobotin() {
    }

    public AspiradoraRobotin(String nombre) {
        this.nombre = nombre;
    }

    /* Getters y Setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBateria() {
        return bateria;
    }

    public void setPerimetro(ArrayList<String> perimetro) {
        this.robot = perimetro; // Lista de Robots a Limpiar
    }
    private boolean checkList(){
        return  deposito<100 && bateria > 5; 
        // Verdadero para niveles normales, falso en lo contrario.
    }

    public void encendido() {
        if (!prendido && checkList()) { 
            // Check si esta NO prendido y los niveles del deposito
            // y batería son normales.
            System.out.println(); 
            System.out.println(printName + "Buenas, soy " +
             this.nombre + " y estoy lista para laburar!!");
            System.out.println();
            System.out.println(aviso);
            prendido = true;
            System.out.println(printName + " el nivel de BATERIA es  " + bateria);
            System.out.println(printName + ": el nivel del DEPOSITO es  " + deposito);
        } else if (deposito<100) { // deposito de polvo lleno
            System.out.println(printName + "Tengo lleno el deposito. Lavame, suci@!");
            vaciarDeposito();
        } else { // batería descargada
            System.out.println(printName + "No tengo más batería. Procedo a cargarme!");
            cargarBateria();
        }
    }

    public void apagado() { // Apagado
        System.out.println(printName + "Adiós mundo Cruel");
        prendido = false;
    }


    public void cargarBateria() { //Simple Loop que carga la batería
        System.out.println(aviso);
        System.out.println("Batería Baja");
        while (getBateria() < 100) {
            bateria += 25;
            System.out.println("Cargando: Batería al: " + bateria + " %");
        }

    }

    public void vaciarDeposito() { // Simple Loop que vacía del deposito
        if (deposito >= 100) {
            System.out.println(aviso);
            System.out.println(printName + " Deposito Lleno");
            System.out.println(printName + " Vaciando Deposito....");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
            System.out.println(aviso);
            System.out.println("Deposito Limpio");
            deposito = 0;
        }
    }


    public void agregarAlPerimetro(String nuevoRobot) {
        this.robot.add(nuevoRobot); // Agrega nuevo robot a la lista
        System.out.println(printName + "Se agregó el nuevo Robot ==> " + nuevoRobot);



    }


    public void limpiar() {

        if (prendido) { //Check si está prendido.
            System.out.println(printName + "Los Robots a limpiar : ");
            for (var j : this.robot){
                System.out.println(j); // Listado de Robots a Limpiar
            }
            var i = 0;
            while (i <= this.robot.size() - 1) {
                /*
                Iterando por la lista hasta que todos los robots estén limpios.
                Imprime que robot está limpio.
                Disminuye los niveles de batería y deposito en 25 por cada limpieza.
                Remueve los limpios de la lista
                 */
                aspiradoCompleto = false;
                if (checkList() ) {
                    System.out.println();
                    System.out.println(printName + "Estoy aspirando a  ==> " + this.robot.get(i));
                    System.out.println();
                    bateria -= 25;
                    deposito += 25;
                    i += 1;
                } else {
                    if(getBateria()<5) cargarBateria();
                    else vaciarDeposito();
                }
            }
            aspiradoCompleto = true; // Cuando finaliza, es Verdadero.
        } else {
            System.out.println(aviso);
            System.out.println("Encender Primero!");
        }
        if (aspiradoCompleto) {
            /*
            Si el aspirado está completo, se eliminan los elementos de la lista.
            Avisa que se apagará. Ejecuta función de apagado.
             */
            this.robot.clear();
            System.out.println("**** AVISO ****");
            System.out.println(printName + "Aspirado Completo");
            System.out.println("");
            System.out.println("Apagando en ...");
            for (var j = 3; j >= 0; j--) {
                System.out.println(j);
            }
            System.out.println();
            apagado();
        }
    }
}


/* --------------- Main ----------- */

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	AspiradoraRobotin cortana = new AspiradoraRobotin();
    ArrayList<String> places = new ArrayList<String>(
            Arrays.asList("Bender", "Marvin", "Wall-E", "T-800" ,"Optimus Prime"));

    cortana.encendido();
    cortana.setPerimetro(places);
	cortana.apagado();
	
	cortana.encendido();
	cortana.limpiar();
	cortana.encendido();
	cortana.agregarAlPerimetro("R2D2");
	cortana.limpiar();
    }

}

```
**Resultado**  
```java



 
        cortana.encendido();
        cortana.setPerimetro(places);
        cortana.apagado();
        cortana.limpiar();

/* =========================================*/

Cortana dice: Buenas, soy Cortana y estoy lista para laburar!!

 *** Aviso ***
Cortana dice:  el nivel de BATERIA es  100
Cortana dice: : el nivel del DEPOSITO es  0
Cortana dice: Adiós mundo Cruel
 *** Aviso ***
Encender Primero! // Al estar Apagado, salta este aviso. No se
//puede limpiar

/*======================================== */

cortana.encendido(); // Se debe encender por que se auto apaga.
cortana.limpiar();


Cortana dice: Buenas, soy Cortana y estoy lista para laburar!!


 *** Aviso ***
Cortana dice:  el nivel de BATERIA es  100
Cortana dice: : el nivel del DEPOSITO es  0
Cortana dice: Los Robots a limpiar : 
Bender
Marvin
Wall-E
T-800
Optimus Prime

Cortana dice: Estoy aspirando a  ==> Bender


Cortana dice: Estoy aspirando a  ==> Marvin


Cortana dice: Estoy aspirando a  ==> Wall-E


Cortana dice: Estoy aspirando a  ==> T-800

 *** Aviso ***
Batería Baja
Cargando: Batería al: 25 %
Cargando: Batería al: 50 %
Cargando: Batería al: 75 %
Cargando: Batería al: 100 %
 *** Aviso ***
Cortana dice:  Deposito Lleno
Cortana dice:  Vaciando Deposito....
***
**
*
 *** Aviso ***
Deposito Limpio

Cortana dice: Estoy aspirando a  ==> Optimus Prime

**** AVISO ****
Cortana dice: Aspirado Completo

Apagando en ...
3
2
1
0

Cortana dice: Adiós mundo Cruel

/* ========================================== */

cortana.encendido();
cortana.agregarAlPerimetro("R2D2"); //Probamos Agregar un nuevo Robot.
cortana.limpiar();

Cortana dice: Buenas, soy Cortana y estoy lista para laburar!!

 *** Aviso ***
Cortana dice:  el nivel de BATERIA es  75
Cortana dice: : el nivel del DEPOSITO es  25
Cortana dice: Se agregó el nuevo Robot ==> R2D2
Cortana dice: Los Robots a limpiar : 
R2D2

Cortana dice: Estoy aspirando a  ==> R2D2

**** AVISO ****


Cortana dice: Aspirado Completo

Apagando en ...
3
2
1
0

Cortana dice: Adiós mundo Cruel

```
