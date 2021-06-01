package com.nacho;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private int ancho;
    private int largo;
    private int profundidad;
    private double consumo;
    private double consumoKw;
    private double consumoXDía;


    private boolean estaEncendido;

    public Electrodomestico(){}

    public Electrodomestico(String marca, String modelo, int ancho, int largo, int profundidad, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ancho = ancho;
        this.largo = largo;
        this.profundidad = profundidad;
        this.consumo = consumo;
        this.consumoKw = consumo/1000;
        this.consumoXDía = 0;
        this.estaEncendido = true;
    }

    public Electrodomestico(String marca, String modelo ){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void onOff(){
        if(!this.estaEncendido){
            System.out.println("Encendiendo...");
        }else {
            this.estaEncendido = !this.estaEncendido;
            System.out.println("Apagando");
        }

    }

    public double volumen(){
        return this.ancho * this.largo * this.profundidad;
    }

    public void consumoDiario(double tiempoUso){
        this.consumoXDía = consumoKw * tiempoUso;
        System.out.println("Consumo diario es de: " + this.consumoXDía + " Kw/h");
    }
    public void consumoMensual(int cantDias){
        double totalMes = consumoXDía * cantDias;

        System.out.println("Consumo mensual es de: " + totalMes + " Kw/h");

    }





}
