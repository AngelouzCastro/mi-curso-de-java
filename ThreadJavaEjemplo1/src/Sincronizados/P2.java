/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sincronizados;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darka
 */
public class P2 extends Thread {
    protected Semaphore oFinP2;

    public P2(Semaphore oFinP2) {
        this.oFinP2 = oFinP2;
    }

    public void run() {
        try {
            Thread.sleep((long) Math.round(500 * Math.random() - 0.5));
        } catch (InterruptedException ex) {
            Logger.getLogger(P2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("P2");
        //contador interno qie se decrementa en cada acquire
        this.oFinP2.release(2);
    }
}
