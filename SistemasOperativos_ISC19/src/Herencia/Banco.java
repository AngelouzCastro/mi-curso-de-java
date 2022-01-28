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
public class Banco extends Operaciones {

    public Banco(long cuenta, String titular) {
        super(cuenta, titular);
        System.out.println("Propietario: " + this.obtenerTitular());
        ingreso(1000);
        this.interesMensual();
        System.out.println("La cuenta está en Rojos: " + this.enRojos());
        this.retiro(300);
        System.out.println("Saldo actual de la cuenta: " + this.obtenerSaldo());
    }
    
    public static void main(String[] args){
        Banco b = new Banco(123456789, "pedir páramo");
    }
}
