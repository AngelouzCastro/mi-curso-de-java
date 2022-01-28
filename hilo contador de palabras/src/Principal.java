
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rogelio
 */
public class Principal {

    static int palabras;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo1 mHilo1 = new Hilo1();
        Hilo2 mHilo2 = new Hilo2();
        Hilo3 mHilo3 = new Hilo3();
        Hilo4 mHilo4 = new Hilo4();
        Hilo5 mHilo5 = new Hilo5();

        mHilo1.start();
        mHilo2.start();
        mHilo3.start();
        mHilo4.start();
        mHilo5.start();

    }

}
