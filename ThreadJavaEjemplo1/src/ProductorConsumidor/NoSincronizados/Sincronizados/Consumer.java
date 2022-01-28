/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor.NoSincronizados.Sincronizados;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darka
 */
public class Consumer extends Thread {

    public Buffer sharedPlace;

    public Consumer(Buffer Shared) {
        this.sharedPlace = Shared;
    }

    public void run() {
        int sum = 0;
        for (int counter = 1; counter <= 4; counter++) {
            try {
                Thread.sleep((int) Math.random() * 3001);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            sum += this.sharedPlace.get();
        }
        System.out.println(this.getName() + " finish to read values, total: " + sum);
    }

}
