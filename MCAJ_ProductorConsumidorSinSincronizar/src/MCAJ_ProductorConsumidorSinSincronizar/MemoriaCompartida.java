/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCAJ_ProductorConsumidorSinSincronizar;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darka
 */
public class MemoriaCompartida {

    private int Dato;

    public MemoriaCompartida() {
        Dato = 0;
    }

    public synchronized int getDato() {
        int datoanterior;
        while (Dato == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
        datoanterior = Dato;
        Dato = 0;
        notifyAll();
        return datoanterior;
    }

    public synchronized void setDato(int Dato) {
        while (this.Dato != 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
        }
        this.Dato = Dato;
        notifyAll();
    }
}
