package com.nacho;

/* Crea una clase llamada Contador que contenga un único atributo entero llamado cont.
        La clase tendrá los siguientes constructores:

        - Constructor por defecto
        - Constructor con parámetros para inicializar el contador con un valor no negativo.

        Si el valor inicial que se recibe es negativo, el contador tomará l valor cero
        como valor inicial.

        Además de los métodos getter y setter,
        la clase contendrá los métodos:

        - incrementar: incrementa el contador en una unidad.
        - decrementar: decrementa el contador en una unidad.

        El contador nunca podrá tener un valor negativo. Si al decrementar se alcanza
        un valor negativo, el contador toma el valor cero. Una vez creada la clase,
        escribe un método main para probarla.
 */
public class Contador {
    private int cont = 0;

    public Contador() {
    }

    public Contador(int cont) {
        if (cont > 0) {
            this.cont = cont;
        }else{
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