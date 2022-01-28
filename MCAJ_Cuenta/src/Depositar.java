
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author darka
 */
public class Depositar {

    private Cuenta mCuenta;
    private int Dinero;
    int suma = 0;

    public void setmCuenta(Cuenta mCuenta) {
        this.mCuenta = mCuenta;
    }

    public int nRandom() {
        
        for (int i = 0; i < 10; i++) {
            
            Random rnd = new Random();
            Dinero = 0 + rnd.nextInt(100);
            suma = suma + Dinero;
        }
        return suma;
    }
    

    public void run() {
        this.mCuenta.setDato(mCuenta.getSaldoActual() + nRandom());
        System.out.println("Se Deposito " + nRandom());
        System.out.println("La suma es1:" + this.mCuenta.getSaldoActual());

        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
