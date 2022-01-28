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
public class Retiro extends Thread {

    private Cuenta mCuenta;
    private Deposito mDeposito;

    public void setmCuenta(Cuenta mCuenta) {
        this.mCuenta = mCuenta;
    }

    Random rnd = new Random();

    public void run() {
        int retiro = 0;
        int i;

        retiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame Retiro: "));
        if (this.mCuenta.getDato() > retiro) {
            System.out.println("Cuenta: " + (this.mCuenta.getDato() - retiro));
            this.mCuenta.setDato(this.mCuenta.getDato() - retiro);
            System.out.println("se retiro " + retiro);
        } else {
            System.out.println("Bloqueo");
        }

        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

}
