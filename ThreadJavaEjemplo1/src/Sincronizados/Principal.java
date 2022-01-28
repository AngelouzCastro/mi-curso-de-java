/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sincronizados;

import java.util.concurrent.Semaphore;

/**
 *
 * @author darka
 */
public class Principal {
    
    protected static Semaphore oFinP1, oFinP2;
    
    public static void main(String[] args){
      oFinP1 = new Semaphore(0, true);
      oFinP2 = new Semaphore(0, true);
      (new Thread(new P1(oFinP1))).start();
      (new Thread(new P2(oFinP2))).start();
      (new Thread(new P3(oFinP1,oFinP2))).start();
      (new Thread(new P4(oFinP1,oFinP2))).start();
    }
}
