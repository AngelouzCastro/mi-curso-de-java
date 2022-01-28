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
public class ThreadEjemplos extends Thread {

    public ThreadEjemplos(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 1000; i++) {

            try {
                System.out.println(i + " " + this.getName());
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadEjemplos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args){
        System.out.println("Comienza el metodo main");
        new ThreadEjemplos("pepe").start();
        new ThreadEjemplos("Juan").start();
        System.out.println("Termino el metodo llamado mai");
    }
}
