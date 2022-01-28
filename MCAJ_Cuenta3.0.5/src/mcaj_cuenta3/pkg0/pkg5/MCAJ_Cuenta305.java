/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_cuenta3.pkg0.pkg5;

/**
 *
 * @author darka
 */
public class MCAJ_Cuenta305 {

    private Cuenta mCuenta;
    private Deposito mDeposito;
    private Retiro mRetiro;

    public MCAJ_Cuenta305() {
        mCuenta = new Cuenta();
        mDeposito = new Deposito();
        mRetiro = new Retiro();
    }

    public void Correr() {
        mDeposito.setmCuenta(mCuenta);
        mRetiro.setmCuenta(mCuenta);
        for (int i = 0; i < 5; i++) {
            mDeposito.run();
            mRetiro.run();
        }

        while (mDeposito.isAlive() || mRetiro.isAlive());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MCAJ_Cuenta305 MCAJ_Cuenta305 = new MCAJ_Cuenta305();
        MCAJ_Cuenta305.Correr();
    }

}
