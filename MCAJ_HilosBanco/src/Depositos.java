/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class Depositos extends Thread {

    private Cuenta mCuenta;
    int Suma;
    int dinero2;

    public void setCuenta(Cuenta mCuenta) {
        this.mCuenta = mCuenta;
    }

    public int aleatorio() {
        for (int i = 0; i < 5; i++) {
            Random dinero = new Random();
            dinero2 = 100 + dinero.nextInt(101);
        }
        return dinero2;
    }

    public void run() {
        int i;
        this.mCuenta.setDato(mCuenta.getDato() + aleatorio());
        System.out.println("Se Deposito " + dinero2);
        System.out.println("La cuenta:" + this.mCuenta.getDato());

        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
