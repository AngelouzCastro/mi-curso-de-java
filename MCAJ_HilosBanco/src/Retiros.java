
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
public class Retiros extends Thread {
    private Cuenta mCuenta;
    private int Suma;
    int dinero2;

    public Retiros() {
        Suma = 0;
    }

    public int getSuma() {
        return Suma;
    }

    public void setCuenta(Cuenta mCuenta) {
        this.mCuenta = mCuenta;
    }
    
    public int aleatorio() {
        for (int i = 0; i < 2; i++) {
            Random dinero = new Random();
            dinero2 = 100 + dinero.nextInt(1001);
        }
        return dinero2;
    }

    public void run() {   
        int i;
        
            
            if(this.mCuenta.getDato() > aleatorio()){
            System.out.println("cuenta: " + (this.mCuenta.getDato() - aleatorio()));
            this.mCuenta.setDato(this.mCuenta.getDato() - aleatorio());
            System.out.println("se retiro " + aleatorio());
            }else
            {
                System.out.println("Cantidad insuficiente");
            }
                     
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
    }
    
    
    
}
