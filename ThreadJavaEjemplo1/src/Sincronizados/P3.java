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
public class P3 extends Thread{
    protected Semaphore oFinP1, oFinP2;

    public P3(Semaphore oFinP1, Semaphore oFinP2) {
        this.oFinP1 = oFinP1;
        this.oFinP2 = oFinP2;
    }

    public void run() {
        try {
            this.oFinP1.acquire();
            this.oFinP2.acquire();
            Thread.sleep((long) Math.round(500 * Math.random() - 0.5));
        } catch (InterruptedException ex) {
            Logger.getLogger(P3.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("P3");

    }
}
