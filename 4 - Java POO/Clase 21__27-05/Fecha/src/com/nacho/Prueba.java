package com.nacho;

import java.util.HashMap;
import java.util.Map;

public class Prueba {
}


/*          Clase Fehca:
 Atributos:
 dia
 mes
 año
 Métodos Getters y Setters.
 fechaCorrecta()
    Comprueba si fecha es correcta.

 */
/* public class Fecha {
    private int dia = 1;
    private int mes = 1;
    private int año = 1778;
    private Map mapa = new HashMap();




    public Fecha(int dia, int mes, int año) {
        if(dia>= 1 && dia<=31) {
            this.dia = dia;
        }
        if(mes >=1 && mes<= 12){
            this.mes = mes;
        }
        this.año = año;
    }





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

    private boolean esBisiesto(){
        return (this.año % 4 == 0) && ((this.año % 100 != 0) || (this.año % 400 == 0));
    }

    public void mapeoFecha(){
        mapa.put(1, 31);
        mapa.put(2,(esBisiesto() ? 29 :28)); // Tenary para check Bisiesto
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
    public int maxDia(){
        mapeoFecha();
        return (int) mapa.get(this.mes);
    }

    public boolean fechaCorrecta(){

        if (this.dia < maxDia()) {
            System.out.println("Fecha Correcta");
        } else {
            System.out.println("Fecha Incorrecta");
        }
        return this.dia<maxDia();

    }


    public String toString(){
        return this.dia + "/" + this.mes+ "/" + this.año;
    }

    public void diaSiguiente(){
        if (fechaCorrecta()){
            if(fechaCorrecta() && getMes()<12){
                this.dia +=1;
            }
        }


        if (fechaCorrecta()){
            this.dia +=1;
        }else{
            this.dia =1;
            this.mes +=1;
        }



        System.out.println(this.dia + "/" + this.mes+ "/" + this.año);
    }

    public void printDiaSiguiente(int stop){
        for(var i = 1; i<=stop;i++){
            diaSiguiente();
        }
    }

} */

// if(this.dia<maxDia() && getMes()<12){
//        this.dia +=1;}
//           } else if (this.dia == maxDia() && getMes()<12){
//               setDia(1);
//               this.mes +=1;
//           }else {
//               setDia(1);
//               setMes(1);
//           }


//if(this.dia>31 && this.mes<12)

/*bisiesto.printDiaSiguiente(33);
        System.out.println("****************");
        System.out.println("");
        noBisiesto.printDiaSiguiente(33);*/

/*
public void diaSiguiente(){
        if (fechaCorrecta()){
            this.dia +=1;

        }
        else {
            this.dia =1;
            this.mes +=1;
        }
        System.out.println(this.dia + "/" + this.mes+ "/" + this.año);
    }

 */
