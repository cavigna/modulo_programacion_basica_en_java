package com.nacho;

import java.util.ArrayList;


public class AspiradoraRobotin {
    private String nombre = "Cortana";

    private boolean prendido = false; // Check si está prendido o no
    private int deposito = 0; // Deposito de Polvo
    private int bateria = 100; // Nivel De Batería
    private boolean aspiradoCompleto = false; // Si completó o no el aspirado
    private ArrayList<String> robot = new ArrayList<>(); // Lista de robots a limpiar

    private String aviso = " *** Aviso ***";
    private String printName = this.nombre +" dice: "; // Variable para no escribir tanto. Si, sé que podría usar
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
        return  deposito<100 && bateria > 5; // Verdadero para niveles normales, falso en lo contrario.
    }

    public void encendido() {
        if (!prendido && checkList()) { // Check si esta NO prendido y los niveles del deposito
            System.out.println();                       // y batería son normales.
            System.out.println(printName + "Buenas, soy " + this.nombre + " y estoy lista para laburar!!");
            System.out.println();
            System.out.println(aviso);
            prendido = true;
            System.out.println(printName + " el nivel de BATERIA es  " + bateria);
            System.out.println(printName + ": el nivel del DEPOSITO es  " + deposito);
        } else if (deposito<=100) { // deposito de polvo lleno
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
