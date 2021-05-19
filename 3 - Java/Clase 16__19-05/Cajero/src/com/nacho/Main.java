package com.nacho;
/* hacer un programa que simule un cajero bancario, este cajero tendrá una cuenta con un saldo inicial,
 y deberá poder realizar las siguientes operaciones.
 consultar saldo
realizar abono o deposito
realizar giros
por cada transacción debe indicar el saldo disponible en la cuenta
las operaciones se deben poder realizar la cantidad de veces que el usuario requiera
salir del programa


 */
public class Main {

    public static void main(String[] args) {
	CajeroBancario cajero = new CajeroBancario(0);
	    cajero.transaccion();


    }
}
