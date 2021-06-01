package com.nacho;

public class Main {

    public static void main(String[] args) {
        var tv= new Tv("Smansung", "UHD43",100, 75, 10,11,43 );
        tv.onOff();
        tv.cambioCanal(42);
        tv.consumoDiario(3.5);
        tv.consumoMensual(25);

        var microondas = new Microondas("Samsung", "MS02", 40,20, 60, 120 );
        microondas.onOff();
        microondas.consumoDiario(.5);
        microondas.consumoMensual(28);
        microondas.calentar();
    }
}
