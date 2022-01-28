/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_pong;

import javax.swing.JFrame;

/**
 *
 * @author darka
 */
public class MCAJ_Pong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmPong mFrmPong = new FrmPong();
        Ventana mVentana = new Ventana();
        mFrmPong.setVisible(true);
        mVentana.setVisible(true);
        mFrmPong.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }
    
}
