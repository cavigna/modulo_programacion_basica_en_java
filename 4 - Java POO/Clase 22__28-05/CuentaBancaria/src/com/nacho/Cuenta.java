package com.nacho;

public class Cuenta<getSaldo> {
    private String nombre;
    private String nCuenta;
    private double saldo;

    public Cuenta(String nombre, String nCuenta, double saldo) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.saldo = saldo > 0 ? saldo : 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnCuenta() {
        return this.nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double montoDeposito) {
        this.saldo += montoDeposito;
    }

    public void giro(double montoGiro) {
        if (this.saldo >= montoGiro) {
            this.saldo -= montoGiro;
        } else {
            System.out.println("No hay platica, estás peor que las pitucas sin lucas!");
            System.out.println("Su saldo de $" + getSaldo() + " no es suficiente para completar su solicitud");
        }
    }

    public void transferencia(double montoTrans, Cuenta receptor) {
        if (this.saldo >= montoTrans) {
            this.saldo -= montoTrans;
            receptor.deposito(montoTrans);
            System.out.println(this.nombre + " transfirió a " + receptor.getNombre() +
                    " un monto de: $" + montoTrans);
        } else {
            System.out.println();
            System.out.println("*** AVISO ***");
            System.out.println("No hay platica, estás peor que las pitucas sin lucas");
            System.out.println("Su saldo de $" + getSaldo() + "no es suficiente para transferir su solicitud");
            System.out.println();
        }
    }


    @Override
    public java.lang.String toString() {
        return "Cuenta n° " + this.nCuenta + "  de " + getNombre() +
                " tiene un saldo de: $" + saldo;
    }
}
