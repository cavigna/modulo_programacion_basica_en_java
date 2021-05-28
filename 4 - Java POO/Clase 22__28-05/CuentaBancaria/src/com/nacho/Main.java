package com.nacho;

public class Main {

    public static void main(String[] args) {
		Cuenta cuentaRaymundo = new Cuenta("Raymundo Rodriguez", "001", 500);
		var cuentaFulgencio = new Cuenta("Fulgencio Fernandez", "002", 1200.0);
		System.out.println("Cuenta de Raymundo");
		System.out.println(cuentaRaymundo);
		System.out.println();
		System.out.println("------------");
		System.out.println("Cuenta de Fulgencio");
		System.out.println(cuentaFulgencio);
		System.out.println();
		System.out.println();
		System.out.println("Transferencia");
		System.out.println("-----------");
		System.out.println("Fulgencio -200 ==> Raymundo +200");
		cuentaFulgencio.transferencia(200, cuentaRaymundo);
		System.out.println();
		System.out.println(cuentaRaymundo);
		System.out.println(cuentaFulgencio);
		System.out.println();
		System.out.println("Intento Transferencia NO VALIDA");
		System.out.println("------------");
		cuentaRaymundo.transferencia(800, cuentaFulgencio);
		System.out.println();
		System.out.println("Check Saldo Raymundo");
		System.out.println("------------");
		System.out.println(cuentaRaymundo);

    }
}
