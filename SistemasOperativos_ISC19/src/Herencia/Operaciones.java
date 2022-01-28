/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author darka
 */
public class Operaciones {

    private long numero;
    private String titular;
    private float saldo;
    private float interesAnual;

    public Operaciones(long cnt, String titular) {
        NuevaCuenta(cnt, titular);
    }

    public Operaciones() {
        this.interesAnual = 1;
    }

    public void NuevaCuenta(long cnt, String titular) {
        this.numero = cnt;
        this.titular = titular;
        this.interesAnual = 1;
    }

    public String obtenerTitular() {
        return this.titular;
    }

    public long obtenerNumeroCuenta() {
        return this.numero;
    }

    public void ingreso(float deposito) {
        this.saldo += deposito;
    }

    public void retiro(float cantidad) {
        this.saldo -= cantidad;
    }

    public boolean enRojos() {
        return this.saldo < 0;
    }

    public void interesMensual() {
        this.saldo += this.interesAnual * this.saldo / 1200;
    }

    public float obtenerSaldo() {
        return this.saldo;
    }

}
