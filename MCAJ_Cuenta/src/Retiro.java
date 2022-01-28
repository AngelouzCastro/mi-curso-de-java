
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darka
 */
public class Retiro implements Runnable{
    
    Cuenta mCuenta = new Cuenta();
    private int Dinero;
    private float suma1=0, suma2=0;
    
    public int nRandom(){
        for(int i = 0;i < 2; i++){
            Random rnd = new Random();
            Dinero =  0 + rnd.nextInt(100);
        }
        return Dinero;
    }
    
    public void run(){
        for(int i =0; i<5; i++){
            
            try {
                RetirarDineroCuenta(nRandom());
                if(mCuenta.getSaldoActual()<0){
                    System.out.println("saldo negativo/n");
                }
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private synchronized void RetirarDineroCuenta(int Dato) {
        if(mCuenta.getSaldoActual() >= Dato){
            System.out.println("Cuenta: " + mCuenta.getSaldoActual());
            System.out.println("El usuario: " + Thread.currentThread().getName()+ " Retiro: " + Dato);
            mCuenta.Retiro(Dato);
            suma1 = suma1 + Dato;
            
            
            System.out.println("La Cuenta Contiene: " + mCuenta.getSaldoActual());
        }else{
            System.out.println("La cuenta no tiene saldo insuficiente "+ Thread.currentThread().getName());
        }
    }
    public float getSuma1(){
        return suma1;
    }
}
