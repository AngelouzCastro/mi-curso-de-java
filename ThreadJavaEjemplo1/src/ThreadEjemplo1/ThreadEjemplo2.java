/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadEjemplo1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darka
 */
public class ThreadEjemplo2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadEjemplo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadEjemplo2(), "pepe").start();
        new Thread(new ThreadEjemplo2(), "luis").start();
    }

}
