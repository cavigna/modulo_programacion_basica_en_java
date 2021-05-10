package com.nacho.ejericios;

public class ElDespachete {
    public static double costoEnvio(int zona, int peso){
        double costo= 0;
        switch(zona) {
            case 1 -> costo = peso *110;
            case 2 -> costo = peso *100;
            case 3 -> costo = peso *120;
            case 4 -> costo = peso *240;
            case 5 -> costo = peso *270;
        }

        return peso>5000 ? costo : -1 ;

    }
    // método para chequear si es el paquete tiene el peso válido.
    public static String paqueteValido(int peso){
        return peso>5000 ? "Paquete válido" : "Paquete Inválido";
    }
}
//throw new IllegalStateException("Cannot change health, character is dead already.");

/* Una compañía de paquetería internacional tiene servicio en algunos países de América del Norte, América
Central, América del Sur, Europa y Asia. El costo por el servicio de paquetería se basa en el peso del
paquete y la zona a la que va dirigido.
• Zona 1: América del norte costo/gramo: $110.-
• Zona 2: América central costo/gramo: $100.-
• Zona 3: América del sur costo/gramo: $120.-
• Zona4: Europa costo/gramo: $240.-
• Zona 5: Asia costo/gramo: $270.-
Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados */