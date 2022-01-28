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
    private Depositar mDepositar;
    private Retiro mRetiro;
    private consumidor1 mConsumidor;
    private Cuenta mCuenta;

    public Main() {
        mRetiro = new Retiro();
        mCuenta = new Cuenta();
        mDepositar = new Depositar();
    }

    public void Correr() {
        //Thread mDepositar2 = new Thread(mDepositar, "productor 1");
        Thread mRetiro1 = new Thread(mRetiro, "consumidor1");
        Thread mRetiro2 = new Thread(mConsumidor, "consumidor2");
        
        //mDepositar2.start();
        mRetiro1.start();
        mRetiro2.start();
       
        
        
    }
    public void comprobar(){
        
        if( mRetiro.getSuma1() > mConsumidor.getSuma1()){
            System.out.println("Gano consumidor 1");
        }else{
             System.out.println("Gano consumidor 2");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main mMain = new Main();
        float x,y;
        Retiro m = new Retiro();
        consumidor1 n = new consumidor1();
        x= m.getSuma1();
        y=n.getSuma1();
        mMain.Correr();
        if(x<y){
            System.out.println("gano el 1");
        }else{
            System.out.println("gano el 2");
        }
        //mMain.comprobar();
        
         
        

    }

}
