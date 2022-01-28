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
    FrmPrincipal mFrmPrincipal;
    
    public Main()
    {
       mFrmPrincipal = new FrmPrincipal(); 
      
    }
    
    public void Correr()
    {
      mFrmPrincipal.setVisible(true);
      
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Main mPuntoVenta = new Main();
        mPuntoVenta.Correr();   
    }
    
}
