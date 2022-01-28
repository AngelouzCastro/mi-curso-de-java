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
public class ThreadEjemplo3 implements Runnable {

    private Thread t;

    public ThreadEjemplo3() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        int cont = 0;
        while (cont < 1000) {
            try {
                System.out.println(cont);
                Thread.sleep(10);
                cont++;
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadEjemplo3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[]args){
        ThreadEjemplo3 t = new ThreadEjemplo3();
    }

}
