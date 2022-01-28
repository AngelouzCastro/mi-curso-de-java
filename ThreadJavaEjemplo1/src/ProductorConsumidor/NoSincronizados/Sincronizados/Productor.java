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
public class Productor extends Thread {

    private Buffer sharedPlace;

    public Productor(Buffer shared) {
        super("Producer");
        this.sharedPlace = shared;
    }

    public void run() {
        for (int counter = 1; counter <= 4; counter++) {
            try {
                Thread.sleep((int) (Math.random() * 3001));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.sharedPlace.set(counter);

        }
    }
}
