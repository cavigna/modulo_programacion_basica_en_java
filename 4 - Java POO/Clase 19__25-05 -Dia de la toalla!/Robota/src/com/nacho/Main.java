package com.nacho;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        AspiradoraRobotin cortana = new AspiradoraRobotin();
        ArrayList<String> places = new ArrayList<String>(
                Arrays.asList("Bender", "Marvin", "Wall-E", "T-800" ,"Optimus Prime"));

        cortana.encendido();
        cortana.setPerimetro(places);
        cortana.apagado(); // Si lo apago no puede limpiar
        cortana.limpiar(); // Salta aviso, que se debe encender
        cortana.encendido();
        cortana.limpiar(); // Ahora si limpia
        cortana.encendido(); // Un vez finalizado la limpieza
        cortana.agregarAlPerimetro("R2D2");
        cortana.limpiar();
    }

}
