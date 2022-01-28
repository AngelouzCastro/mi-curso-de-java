/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoSincronizados;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darka
 */
public class P2 extends Thread {

    public void run() {
        try {
            Thread.sleep((long) Math.round(500 * Math.random() - 0.5));
        } catch (InterruptedException ex) {
            Logger.getLogger(P1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("P2");
    }
}
