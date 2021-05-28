# Parte 4 - POO | Ignacio CAVALLO 

----

## Clase 18  | 24/05

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

## Clase 19  | 25/05 - Día de la Toalla!

### Conceptos Aprendidos:  

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


#### Primera parte  

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

---- 

## Clase 20  | 26/05 

### Conceptos Aprendidos:  

*En Clase:*

* Métodos Constructores Continuación.
* Uso de condicionales para asignar atributos.

*Fuera de clase:*
- Amplié conocimientos con el curso paralelo que realizo de mooc-fi
- Uso de Tennary
- Mejora de Portafolio.
  - [Uso de links en markDown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet#links).

#### Primera parte  

Continuamos con **Programación Orientada a Objetos**.</br></br> 
Seguimos con el ejercicio de ayer, pero ya lo había terminado como tarea. O sea, que aproveche la mañana para aprender un poco más acerca de la *sobrecarga de métodos.*.  
Dejo a continuación una parte del ejercicio. Todo el desarrollo está [aquí](https://github.com/cavigna/modulo_programacion_basica_en_java/blob/180b9dfbc0311e98adf347e3837bd6c174128a4e/4%20-%20Java%20POO/Clase%2019__25-05%20-Dia%20de%20la%20toalla!/README.md).
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



```

#### Segunda Parte
Nos asignaron el siguiente ejercicio:
>Crea una clase llamada Contador que contenga un único atributo entero llamado cont. La clase tendrá los siguientes constructores:
>
>- Constructor por defecto
>- Constructor con parámetros para inicializar el contador con un valor no negativo.
>
>Si el valor inicial que se recibe es negativo, el contador tomará el valor cero como valor inicial. Además de los métodos getter y setter,la clase contendrá los métodos:  
>  - incrementar: incrementa el contador en una unidad.
>  - decrementar: decrementa el contador en una unidad.
>
> El contador nunca podrá tener un valor negativo. Si al decrementar se alcanza  un valor negativo, el contador toma el valor cero. Una vez creada la clase,escribe un método main para probarla.

**Resultado**

```java 
public class Contador {
    private int cont = 0;

    public Contador() {
    }

    public Contador(int cont) {
        if (cont > 0) {
            this.cont = cont;
        }
        else{
            this.cont=0;
        }
    }

    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {this.cont = cont;}

    public void incrementar(){
        this.cont++;
        System.out.println("Contador: " +getCont());
    }
    public void decrementar(){
        if(getCont()<=0){
            this.cont = 0;
        }else{
            this.cont--;
        }
        System.out.println("Contador: " +getCont());
    }
}
```
---
---



## Clase 21  | 27/05

### Conceptos Aprendidos:  

*En Clase:*

* Expansión de habilidades al manejar una clase.

*Fuera de clase:*
- Uso de HasMap
- Buenas practicas en la implemetnación de Constructores.
- Recursión
- Mejora de Código.
- No desanimarse.
- Volver sobre el mismo Código.
  

### Unico Ejecicio  


En clase se planteó un problema que al  principio parecia simple, pero ***terminó siendo mucho más COMPLEJO***.  
Se pidió la implementación de una clase FECHA, con los siguientes atributos y métodos :  

```java
int dia;
int mes;
int año
public boolean fechaCorrecta(){}
public diaSiguiente(){}
```  
El método fechaCorrecta debe confirmar que sea una fecha válida, y el díaSiguiente debe seguir el orden cronologico de las fechas.  
Ahora, analizandolo en mayor profundidad me percaté que tenía varios niveles de complejidad:  
>
>1. Los  días y meses no pueden ser menores a 1.
>2. Los meses no pueden ser mayor a 12.
>3. Los días no pueden ser mayor a 31.
>4. Dependiendo del mes, el último día será distinto.
>5. En función a al año, el último día de febrero será 28 o 29.

Después de analizarlo en clase, y fuera de ella, decidí separar el problema de la siguiente manera:  
- Definir el  constructor con  una restricción:  
     Si los días son validos (1-31), serán cargados.
     * Si los meses son validos (1-31), serán cargados.
     * El año al aceptar valores siempre negativos no tiene restricción.
     * Si alguna de las condiciones no son válidas, la fecha por defecto será:
     * 4 / 2 /42
     * Esto simplifica el uso del mapeo y de el día siguiente.

- Implementar un Check de año bisiesto:
- Para evitar el uso excesivo de condicionales, consideré pertinente utilizar un
    * HashMap, que vincule el mes con su respectivo último día.
    * A su vez, utilicé un operador Tenary en el mes de Febrero, este usa método para comprobar
    * si es Bisiesto, en caso verdadero el último días es 29, sino, 28.

- Por requerimiento  del ejercició implemente la función fechaCorrecta.
    * Esta llama al mapeoFecha y devuelve TRUE si el día en cuestión es menor al que está asignado en el HASH.
- Día Siguiente fué el  método más complejo, por que tenemos varias restricciones:
    *       1. Si el día actual es mayor al día máximo del mes. En este caso   debemos pasar al próximo mes.
    *       2. Si el mes actual es mayor al último mes del año, debemos pasar a un nuevo año.
    *       3. No debemos preocuparnos si el día o el mes es incorrecto, ya que por definición de la clase, esto no es permitido.

Mi implementación  FINAL fué la siguiente:
``` java
package com.nacho;

import java.util.*;

/*          Clase Fehca:
 Atributos:
 dia
 mes
 año
 Métodos Getters y Setters.
 fechaCorrecta()
    Comprueba si fecha es correcta.
diasSiguientes()
    Imprime los siguientes días

 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    private Map mapa = new HashMap(); //HasMap para mapear los días 28,29,30 y 31

    /* El constructor es definido por una restricción:
     * Si los días son validos (1-31), serán cargados.
     * Si los meses son validos (1-31), serán cargados.
     * El año al aceptar valores siempre negativos no tiene restricción.
     * Si alguna de las condiciones no son válidas, la fecha por defecto será:
     * 4 / 2 /42
     * Esto simplifica el uso del mapeo y de el día siguiente.
     * */

    public Fecha(int dia, int mes, int año) {

        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        } else {
            this.dia = 4;
            this.mes = 2;
            this.año = 42;
            System.out.println("Día o Mes incorrecto");
            System.out.println("Fecha por defecto: 4/2/42");
        }


    }
    /* Getters y Setters.*/

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    /* Método que devuelve verdadero en caso de ser Bisiesto */
    private boolean esBisiesto() {
        return (this.año % 4 == 0) && ((this.año % 100 != 0) || (this.año % 400 == 0));
    }

    /* Para evitar el uso excesivo de condicionales, consideré pertinente utilizar un
    * HashMap, que vincule el mes con su respectivo último día.
    * A su vez, utilicé un operador Tenary en el mes de Febrero, este usa método para comprobar
    * si es Bisiesto, en caso verdadero el último días es 29, sino, 28.
    * */

    public void mapeoFecha() {
        mapa.put(1, 31);
        mapa.put(2, (esBisiesto() ? 29 : 28)); // Tenary para check Bisiesto
        mapa.put(3, 31);
        mapa.put(5, 31);
        mapa.put(6, 30);
        mapa.put(7, 31);
        mapa.put(8, 31);
        mapa.put(9, 30);
        mapa.put(10, 31);
        mapa.put(11, 30);
        mapa.put(12, 31);
    }

    /* Por requerimiento  del ejercició implemente la función fechaCorrecta.
    * Esta llama al mapeoFecha y devuelve TRUE si el día en cuestión es menor al que
    * está asignado en el HASH.*/


    public boolean fechaCorrecta() {
        mapeoFecha();
        return this.dia < (int) mapa.get(this.mes);
    }
    /* Representación en String de la Clase*/
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.año;
    }

    /* Está fué el  método más complejo, por que tenemos varias restricciones:
    *       1. Si el día actual es mayor al día máximo del mes. En este caso
    *           debemos pasar al próximo mes.
    *       2. Si el mes actual es mayor al último mes del año, debemos pasar
    *          a un nuevo año.
    *       3. No debemos preocuparnos si el día o el mes es incorrecto, ya que
    *          por definición de la clase, esto no es permitido.
    *
    * */

    public void diaSiguiente() {
        if (!fechaCorrecta()) { //Si la fecha es mayor al día máx.
            if (getMes() < 12) { // si no es el último mes del año
                setDia(1); // El día es 31 pasa a 1.
                this.mes += 1; // el mes 1 pasa a mes 2.
                System.out.println("********");
                System.out.println("Pasamos a otro mes: " + getMes());
                System.out.println("********");
            } else if (getMes() == 12) { // si es el ultimo més del año.
                                        // Ej: 31/12/1999
                setDia(1); // el día pasa a 1.
                setMes(1); // el mes 12 pasa a mes 1.
                this.año += 1; //  el año se incrementa en 1 ==>2000
                System.out.println("********");
                System.out.println("FELIZ AÑO NUEVO");
                System.out.println("Te deseamos un muy buen " + getAño());
                System.out.println("********");

            }
        } else { //Si la fecha es menor al último día
            this.dia += 1; // Se aumenta en uno.
        }
        System.out.println(this.dia + "/" + this.mes + "/" + this.año);
    }

    /* Implemnentación Recursiva para imprimir los n días que
    * requiera el usuario.*/

    public void printDiaSiguiente(int stop) {
        if (stop == 0) {
            System.out.println(this.dia + "/" + this.mes + "/" + this.año);
        } else {
            diaSiguiente();
            printDiaSiguiente(stop - 1);
        }
    }   

}
}

/* ---------RESULTADO------------*/

 ---- FECHAS INCORRECTAS ----

Día o Mes incorrecto // -15/3/1927
Fecha por defecto: 4/2/42
Fecha Correcta?: true // ==> Es true por que se aplica la
                    // fecha por defecto
Día o Mes incorrecto
Fecha por defecto: 4/2/42 // 21/42/1933
Fecha Correcta?: true

 ---- AÑO BISIESTO ----

Fecha Ingresada:27/2/2020

Fecha Correcta?: true

Los próximos 5 dias son:
28/2/2020
29/2/2020
********
Pasamos a otro mes: 3
********
1/3/2020
2/3/2020
3/3/2020
3/3/2020

 ---- AÑO NO BISIESTO ----

Fecha Ingresada:27/2/2018

Fecha Correcta?: true

Los próximos 5 dias son:
28/2/2018
********
Pasamos a otro mes: 3
********
1/3/2018
2/3/2018
3/3/2018
4/3/2018
4/3/2018

 ---- AÑO Nuevo ----

Fecha Ingresada:30/12/2020

Fecha Correcta?: true

Los próximos 5 dias son:
31/12/2020
********
FELIZ AÑO NUEVO
Te deseamos un muy buen 2021
********
1/1/2021
2/1/2021
3/1/2021
4/1/2021
4/1/2021

```