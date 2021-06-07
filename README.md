# 1° Módulo: Programación en Java | Ignacio CAVALLO

Este repositorio corresponde al primer módulo del Curso Android Trainee -  BOTIC-SOFOF-20-14-13-0016 impartido por A.I.E.P.

## Introducción  
Soy **Ignacio Cavallo** de profesión Ingeniero Comercial y desde hace algunos años me introduje en el mundo de la programación. Si bien soy competente en el lenguaje de programación *Pyhton*, realizar este módulo fué un verdadero desafío.  
</br> Realmente fué un poco complicado acostumbrarme al estilo de *Java*, ya que es fuertemente tipificado a diferencia de Python. Esto me generó una serie de inquietudes resolviendo algunas en clase, pero la mayoría fuera de ella. Es por ello que si ingresan a las diferentes clases, verán mi progreso no solo en programación sino también, en como **crear, actualizar y presentar un repositorio**. De hecho, lo que están leyendo está realizado en *Markdown* y día a día podrán observar el progreso en mis presentaciones, partiendo desde simples words, pasando por implementaciones en Markdown para concluir en lo que están observando. Considero que este progreso se propició inicialmente por lo aprendido en clase, pero finalmente por la gran cantidad de horas dedicadas fuera del horario académico. El profesor enseña la base, pero es muy importante incentivarnos a aprender fuera de clase. Este hábito lo forjé aprendiendo de forma autodidacta a programar en Python.  


</br> En este apartado iré simplificando algunos de los hitos que realicé durante esta primera sección. Luego, explicaré en el [desarrollo](##desarrollo) lo aprendido en las unidades.  
A continuación destacaré algunos de los desafíos más interesantes que he superado en este módulo, ya sea con los ejercicios propuesto o con aquellos realizados de forma extra curricular. Para evitar un *testamento*, trataré de resumirlos dejando un enlace hacia su correspondiente sección por si es de su interés indagar más en mi desarrollo.

## Destacados
Como es probable que el lector *no llegue hasta el final de este documento*, aprovecho esta sección para mostrar algunos de los desarrollos implementados en este módulo que significaron un verdadero desafío.

### A. Examen Final del Módulo

El desarrollo completo está en este [link](https://github.com/cavigna/modulo_programacion_basica_en_java/tree/main/5%20-%20Examen/TiendaBodega). Aquí podrán Observar como el buen [Geralt](https://witcher.fandom.com/es/wiki/Geralt_de_Rivia) va a comprar a su mercader de confianza.  
El requerimiento era simplemente un gráfico con la secuencia lógica, pero,  como desafío personal, *decidí implementarlo en código*.  
La verdad, que al principio costó, sobre todo poder relacionar las clases Cliente, Tienda y bódega. De hecho, en una ejercició que realicé posteriormente ([Ticketera](###c.-ticketera.)) de forma opcional, encontré una buena solución, que simplificaría mi propuesta. Por ejemplo la creación de una Clase Venta con métodos estáticos que fuera el nexo entre todos los participantes.  
Fue un desafío muy interesante, sobre todo por que lo desarrollé el mismo día del exámen. Dejo a continuación un poquito del código:
```java
// Agregamos algunos Productos
        var mutageno = new Producto(1, " Mutágeno Rojo", 50);
        var armaduraOso = new Producto(2, "Armadura Oso", 1500);
        var espadaDePlata = new Producto(3,"Espada de Plata", 250 );


        var bodega = new Bodega(); // Creamos una nueva Bodega
        var tienda = new Tienda("Novigrad", bodega); //Tienda
        // Agregamos unas algunos productos...
        bodega.agregarProducto(espadaDePlata, 5);
        bodega.agregarProducto(mutageno, 10);
        bodega.agregarProducto(armaduraOso, 1);

        

        //Check del Stock Inicial
        bodega.imprimirStock(espadaDePlata);
        bodega.imprimirStock(mutageno);
        bodega.imprimirStock(armaduraOso);
        
        
        /* --- Stock En Bodega ---
    El producto Espada de Plata tiene un stock total de: 5   
    El producto  Mutágeno Rojo tiene un stock total de: 10   
    El producto Armadura Oso tiene un stock total de: 1   
            --- Fin --- */
    var geraltOfRivia = new Cliente("Geralt of Rivia", "42.424242-7", 200)
    
    /* Geralt of Rivia tiene un saldo de $200.0 */ 

```

### B. SORT AND ORDER.
Si hay algo que es sumamente importante para comprender mejor como es la lógica de la programación son los algoritmos de Ordenamiento y Búsqueda. Como reto, me permití implementar varios algoritmos de este tipo, destacando sobe todo el de ordenamiento por Rápido, [*QuickSort*](https://es.wikipedia.org/wiki/Quicksort). Como siempre, el [desarrollo completo lo dejo por acá...](https://github.com/cavigna/modulo_programacion_basica_en_java/tree/main/0%20-%20Ejercicios%20Extracrurriculares/SortOrder/src/com/nacho).
Este algoritmo, me permitió comprender de mejor forma como funcionan no solo las estructuras de datos como Arrays, sino, poder implementar estos métodos de forma *recursiva*.
```java
public class QuickSort {
    public void quickSort(int [] array, int izquierda, int derecha){

        if(izquierda<derecha){
            int particion_pos =particion(array, izquierda, derecha);
            quickSort(array, izquierda, particion_pos-1);

            quickSort(array, particion_pos+1, derecha);

            /*
            LEER PRIMERO PARTICIóN LUEGO VOLVER AQUÍ
            Comenzamos desde izquierda = 0 y derecha = array.length-1
            Mientras la posición de la izquierda no sea mayor a la derecha seguimos con la función.
            La implementamos de manera recursiva desde 0 hasta la posición que nos devuelva la partición menos 1.
            Del mismo modo la implementamos desde la partición más 1 hasta el final del array.
            Básicamente dividimos en dos la búsqueda, en una sección izquierda y una derecha que tendrá su pivot y sus
            propios punteros i,j.
            Ej:
            Al terminar la primera recursión, hemos intercambiado el pivot por uno nuevo. Ahora
            nuestra array se transformará de la siguiente manera:
            [15, 23, 95, 8, 63, 321, 1786, -523, 42] ==> [15, 23, -523, 8, 42, 321, 1786, 95, 63]
            La posición que regresa la función partición de i es de 4 (particion_pos). Aquí se cambió 42 por 63.
            El método se implementará desde la nueva posición de 42 para la izquierda y la derecha(No inclusiva).
               [15,23,-523] 42 [321, 1786, 95 , 63]
            En la parte IZQUIERDA DE LA RECURSION ==> quickSort(array, izquierda=0, derecha = 4-1 =3)
            array_izquierda = [15, 23, -523, 8] | el pivot será 8.
                              -523 <==> 15
                              [-523, 23 , 15, 8]  |  el pivot será 8.
                              No hay menor número entre 8 y 15.
                              15 <==> 8
                              [-523,23,8,15] | el pivot será 15.
                              23 <==>8
                              [-523,8,23,15] | el pivot será 15.
                              No hay menor número entre 15 y 23.
                              23 <==> 15
                              Finalmente:
                              [-523, 8, 15, 23]
                              TODO MIENTRAS ESTA RECURSIÓN SE EJECUTE izquierda será MENOR A DERECHA.
            En la parte DERECHA DE LA RECURSION ==> quickSort(array, izquierda=4+1 =5, derecha = fin array)
            array_derecha = [321, 1786, 95 , 63] | el pivot será 63.
                            No hay menor número entre 321 y 63.
                            321 <==> 63
                            [63, 1786, 95 , 321] | el pivot será 321.
                            1786 <==> 321
                            [63, 321, 95 , 1786] | el pivot será 1786.
                            No hay MAYOR número entre 63 y 1786.
                            321 <==> 95
                            Finalmente:
                            [63, 925, 321, 1786]
                            TODO EN ESTA PARTE EVENTUALMENTE IZQUIERDA SERÁ IGUAL A DERECHA.
                            Esto se debe a como se formuló el método: izquierda irá incrementando su posición.
                            En este ejemplo izquierda será igual a 8 ==> array.length-1
          RESULTADO
            Originalmente:
                            [15,23,-523] 42 [321, 1786, 95 , 63]
            Con las implementaciones:
                            [-523, 8, 15, 23]  42 [ 63, 95, 321, 1786]
                            [-523, 8, 15, 23, 42, 63, 95, 321, 1786]
             */
        }

    }

    private  int particion(int[] array, int izquierda, int derecha){
        int i = izquierda, j = derecha, k; //Puntero izquierda, derecha
        int pivot = array[derecha]; //pivote de la derecha. al principio es el ultimo elemento arr[-1]
        /* i==> i se mueve hacia la derecha y comprueba si algún valor es MAYOR al pivote.
                Cuando lo encuentra se detiene.
          j<== j se mueve hacia la izquierda. y comprueba si algún valor es MENOR al pivote.
                Cuando lo encuentra se detiene.
         Pivote = Este tiene como función ser el comparador con los punteros i, j. Cuando no haya más cambios con este,
        realizamos un swap entre el valor array[i] con el pivote. Ahora tendremos un nuevo pivote para comparar.
         */

        while (i<j) {
            /*
            Mientras el marcador de la izquierda (i) no supere al marcador de la derecha(j)
             */
            System.out.printf("Array = %s%n", Arrays.toString(array));
            while(i<derecha && array[i]<pivot){
                 /* Mientras que el indice de i sea menor a la derecha(el último elemento del array), es decir,
                 no llegó hasta el final del array. Además el de array[i] debe ser menor al pivot.
                 Siempre y cuando se cumpla, i avanza hacia la derecha (i++).
                 ej
                 Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42  ==> El sentido de la vida,
                  el universo y todos lo demás
                         42 >15
                         42 > 23
                         42 < 95 ===> AQUí SE DETIENE i
                 */

                i++;
            }
            while(j>izquierda && array[j]>= pivot){//j > izquierda y el elemento array[j] es mayor al pivote

                 /* Mientras que el indice de j sea mayor a la izquierda(el primer elemento del array), es decir,
                 no llegó hasta el principio del array. Además el de array[j] debe ser menor al pivot.
                 Siempre y cuando se cumpla, i avanza hacia la derecha.
                 Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42
                                                         42 > -523 ==> AQUí SE DETIENE j
                 */

                j--;
            }
            if(i<j){ // Si i es MENOR a j
                /*
                Si el índice de i es menor el de la izquierda. Se realiza el cambio
                Array = [15, 23, 95, 8, 63, 321, 1786, -523, 42] | pivote = 42
                array[i] = 95. Este es MAYOR que el pivote 42.
                array[j] = -523. Este es MENOR que el pivote 42.
                Por ende, se intercambian array[i] <==> array[j]
                Ahora nuestra array queda configurada así:
                    Array = [15, 23, -523, 8, 63, 321, 1786, 95, 42]
                 */
                System.out.println();
                System.out.println("*** i menor a j ***");
                System.out.println();
                System.out.printf("Pivot = %d %n",pivot);

                System.out.printf("%narray[%s] = %s <==> array[%s] = %s %n", i, array[i], j, array[j]);
                System.out.println();
                k = array[i];
                array[i] = array[j];
                array[j] =k; // SWAP array[i] por array[j]

            }

        }

        while(array[i]>pivot){
            /*
            Cuando j que viene por la derecha, sobrepasa a i(que es el que busca el mayor), quiere decir que no hay hay
            un numero menor en ese rango, por ende array[i] debe ir al último, por que este es mayor que el pivote.
            Intercambiamos array[i] por el pivote:
                        [15, 23, -523, 8, 63, 321, 1786, 95, 42]
                        42 > 15                         42 < 95
                        42 > 23                         42 < 1786
                        42 > -523                       42 < 321
         i se detiene   42 < 63                         42 < 63
                                                        42 > 8 j se detiene.
            En este caso j superó a i. Entonces, 42 ya no es el mayor valor, por lo que se intercambia el pivote con
            array[i] (siempre y cuando sea mayor al pivote)
            Como resultado, nuestra Array queda de la siguiente manera:
                Array = [15, 23, -523, 8, 42, 321, 1786, 95, 63]
            y volvemos a iterar nuevamente. Hasta que no haya un valor MAYOR al pivote.
             */
            System.out.println();
            System.out.println("*** Se agotó búsqueda.  ***");
            System.out.println("*** Swap array[i](mayor) por Pivot ");
            System.out.println();
            System.out.printf("Pivot = %d %n",pivot);

            System.out.printf("%narray[%s] = %s <==> array[%s](Pivot) = %s %n", i, array[i], derecha, array[derecha]);
            System.out.println();
            k = array[i];
            array[i] = array[derecha];
            array[derecha] =k;
        }


        return i;
        /*
        Lo importante de esta función es que nos devuelve la posición de i. Es decir, desde donde debe empezar a
        realizar la búsqueda nuevamente. Tanto para la izquierda de i como la derecha de i
         */
    }

}
```

### C. TICKETERA.
Para no perder la costumbre, aquí se puede servir el [desarrollo completo](https://github.com/cavigna/modulo_programacion_basica_en_java/tree/main/0%20-%20Ejercicios%20Extracrurriculares/Ticketera)).
Este ejercicio es de otro curso ofrecido por Talento Digital, que comparte el módulo de java. Me pareció interesante poder desarrollar estos problemas, en aras de mejorar mi *destreza en java*. Aquí tuve que aplicar herencia sobre objetos que no hubiese considerado en otra situación, como es el caso de una Entrada a un evento. Lo interesante fué poder crear lista de objetos con clases creadas por mí y poder aplicar una clase nexo como fue Venta. Entre los desafíos de este problema destaco:

* La creación de Listas con Objetos Creados por mí, ej: Entrada.
* Poder utilizar esta lista como una forma de almacenar todas las entradas vendidas en un Concierto.
* Asociar las Entradas a un Cliente, a un Vendedor, y a un Evento.
* LLevar la cuenta de que entradas han sido vendidas, y cuales han sido utilizadas.
* Impedir el acceso si el evento no se ha iniciado.
* Si alguien quiere ingresar al evento con una entrada usada, no podrá hacerlo.
* Contabilizar la cantidad de entradas vendidas por un Vendedor en particular como también el total por evento.
* Dividir las entradas en regulares y entradas Vip.

```bash
*** Venta Entrada Normal Válida ***

Entrada Vendida! 
Número de Asiento: 7 de Miguel Cliente


*** Venta Entrada Normal Inválida: No cumple Edad Mínima ***

Roberto Cliente Ud tiene: 12
Ud. no cumple la edad mínima de: 18

*** Venta de Entrada con número de asiento ya Usado ***

Este Asiento no está Disponible.

*** Venta de Entrada Vip ***

Número de Asiento: 42 de James VIP
Entrada Vendida! 
Número de Asiento: 23 de Norberto

*** Intento de Ingreso cuando el evento no Comenzó ***

Concierto Pulenta no ha comenzado!

*** Inicio de Evento ***


*** Ingreso al Evento ***

1
*** Ingreso al Concierto Pulenta***
Bienvenido Miguel Cliente al evento Concierto Pulenta, ud. puede pasar


*** Intento de ingresar con Entrada Usada ***

La entrada fue usada!

*** Ingreso al Concierto Pulenta***
Bienvenido James VIP al evento Concierto Pulenta, ud. puede pasar


*** Ingreso al Concierto Pulenta***
Bienvenido Norberto al evento Concierto Pulenta, ud. puede pasar


*** Listado de Ventas Del Vendedor ***

Juan Venta ha vendido: 
Entradas Normales: 2
Entradas Vip: 1
El total vendido es de: 3

*** Entradas Vendidas! ***


Entrada número: 7
Cliente: Miguel Cliente
Vendedor: Juan Venta


Entrada número: 42
Cliente: James VIP
Vendedor: Juan Venta


Entrada número: 23
Cliente: Norberto
Vendedor: Juan Venta

```
  
## Desarrollo.
A lo largo de este módulo hemos aprendido conceptos fundamentales como por ejemplo:

1. **Algoritmos**:
   1. Que es un algoritmo.
   2. Para que sirven como se pueden implementar.
   3. Las estructuras de control, los bucles y otros menesteres.
2. **Diagramas de Flujo**: 
   1. Como visualizar las estructuras de control.
   2. Su interacción.

3. **Java**:
   1. Conceptós básicos de este lenguaje.
   2. Datos primitivos
   3. las palabras claves
   4. Definir estructuras de Control.
4. **Programación Orientada a Objetos**:
   1. Que es una Clase
   2. Implementación de una Clase
   3. Atributos
   4. Métodos.
   5. Constructores.
   6. Herencia.
   7. Polimorfismo.
