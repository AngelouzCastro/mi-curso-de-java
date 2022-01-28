/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_cuenta3.pkg0.pkg5;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class Deposito extends Thread {

    private Cuenta mCuenta;

    public void setmCuenta(Cuenta mCuenta) {
        this.mCuenta = mCuenta;
    }
    Random rnd = new Random();

    public Deposito() {
        mCuenta = new Cuenta();
    }

    public void run() {
        int i;
        int numero = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame Deposito: "));
        this.mCuenta.setDato(mCuenta.getDato() + numero);
        System.out.println("Se Deposito: " + numero);
        System.out.println("Cuenta:" + this.mCuenta.getDato());

        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

}
