/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darka
 */
public class Main {

    private Cuenta mCuenta;
    private Depositos mDepositos;
    private Retiros mRetiros;
    
    
    private int cuenta;

    public Main() {
        mCuenta = new Cuenta();
        mDepositos = new Depositos();
        mRetiros = new Retiros();
    }
    
    public void Correr()
    {
        mDepositos.setCuenta(mCuenta);
        mRetiros.setCuenta(mCuenta);
       for(int i = 0; i<5;i++){
            mDepositos.run();
            mRetiros.run();
        }
        
        while(mDepositos.isAlive() || mRetiros.isAlive());
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main mMain = new Main();
        mMain.Correr();
    }

}
