/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoSincronizados;

/**
 *
 * @author darka
 */
public class Principal {
    
    public static void main(String[] args){
        (new Thread(new P1())).start();
        (new Thread(new P2())).start();
        (new Thread(new P3())).start();
        (new Thread(new P4())).start();
    }
}
