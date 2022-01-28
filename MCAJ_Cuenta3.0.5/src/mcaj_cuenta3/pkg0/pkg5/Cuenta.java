/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_cuenta3.pkg0.pkg5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darka
 */
public class Cuenta {

    private int Dato;
    Deposito mDeposito;
    private int suma;

    public Cuenta() {

        Dato = 0;
    }

    public void Retiro(int Retiro) {
        Dato = Dato - Retiro;

    }

    public void Suma(int numero) {
        Dato = Dato + numero;
    }

    public synchronized int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

}
