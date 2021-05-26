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
	cortana.apagado();
	cortana.limpiar();
	cortana.encendido();
	cortana.limpiar();
	cortana.encendido();
	cortana.agregarAlPerimetro("R2D2");
	cortana.limpiar();
    }

}
