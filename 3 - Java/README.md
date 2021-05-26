# Parte 3 - Programacion en  Java
---

##  Clase 10  | 11/05

Primeros Programas en Java

##  Clase 11  | 12/05
Hicimos algunos ejercicios en Java. Cómo desafío personal, convertí los ejercicios en clases con métodos.
A ellos los importé en main.
Hice algunos ejercicios adicionales.
Aprendí a Usar plug ins in mi IDE.

##  Clase 12 | 13/05
Hicimos Ejercicios pasados, en  java. Como ya los había hecho por mi propia cuenta, decidí implementar el uso de
Scanner como input. Utilicé metodos dentro de Main.

## En mi tiempo | 13/05
Pasamos algunos ejercicios a Java.

## Clase 13 | 14/05
Aprendí un poco sobre Arrays.</br>

## El fin de semana | 15/05
Implementé una función lambda en Java!!!
```java
int sumaPares = paImpa.stream().filter((a) -> a%2 == 0).mapToInt((a) -> a).sum();
```


## Clase 15 | 17/05
En esta clase, se decidió hacer repaso. Por ello, aproveche el tiempo re haciendo algunos ejercecios. </br>
Por otra parte, como las arrays son  bien estrictas, descubrí arrayList como alternativa. Esta fué de suma utilidad, porque se asemejan  las List de Python.
</br>
Hice ejercicios propuestos por el profesor, pero le agregue cierta difiultad. Por ejemplo, un ejercicio, era el número
mayor de N. Aparte de eso, propuese un método que permita  identificar el mayor O menor número.

## Clase 16 | 18/05 
Hoy los compañeros revisaron algunos ejercicios Adeudados. Después el profesor, nos pidio 3 jercicios con loops y
uno con switch. Por ello implementé los siguientes:

1 - **Factorial** ==> 5! = 5* 3 * 2 * 1</br>
```java
    public static void factorial(int totalN) {
        var acum = 1;
        for (var i = 1; i <= totalN; i++) {
            acum *= i;
        }
        System.out.println(totalN + "!" +
                " = " + acum);
    }
```


2 - **FizzBuzz** ==> en un rango de n numeros, si es divisble por 3, imprime Fizz
                 si es divisible por 5 Buzz. Por ambos FizzBuzz</br>

```java
 public static void fizzBuzz(int totalN) {
        for (var i = 1; i <= totalN; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " ==> FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " ==> Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " ==> Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
```                
3 - **Potenciado** ==>  Elevar un número por otro sin libreria
```java
public static void potencia2(int n1, int n2) {
        var potenciaResultado = 1;
        for (var i = 1; i <= n2; i++) {
            potenciaResultado *= n1;
        }
        System.out.println(potenciaResultado);

    }
```


4 - **Calculadora** ==> Toma dos números, un caractér como (+,-,*,/) y aplica la operación matemática.
```java
    public static void simpleCalc(int n1, int n2, char op) {

        switch (op) {
            case '+' -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            case '-' -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            case '*' -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            case '/' -> System.out.println(n1 + " * " + n2 + " = " + (1.0 * n1 / n2));
        }


    }

```

**Implementé mi primera función Void!. Ehhhh!!!**
```java
    public static void factorial(int totalN){
        var acum =1;
        for (var i=1; i<=totalN; i++){
            acum *= i;
        }
        System.out.println( totalN + "!" +
                " = " + acum);

```



## Clase 16 | 19/05

Hicimos dos ejercicios. El primero, una calucladora simple. Usé el código de la clase anterior y lo mejoré.</br>
Aprendí un poco más sobre la librería **Math** de **Java**.</br>
El otro ejercicio fué implementar un  cajero. Lo implementé como un objeto de clase, y practiqué un poco los *constructores*.
```java
public class CajeroBancario {
    private double saldo;
    private Scanner input = new Scanner(System.in);

    public CajeroBancario(double saldo) {
        this.saldo = saldo; // Constructor!!
    }
    public void imprimirSaldo() {
        System.out.println("Su saldo es: " + this.saldo);
    }
```

## Clase 17 | 20/05

En la primera parte, hicimos un ejercicio que calculaba si es un número perfecto.</br>
**Aprendí una forma de no iterar todos los valores ==> Dividir a n/2**</br>
En la segunda parte, vimos Arrays. Hicimos algunos programas con relación a ellos.</br>
En la tercera parte, hicimos una tarea grupal sobre algoritmos de ordenamiento y búsqueda </br>

