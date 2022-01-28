/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import MCAJ.Conta;
import javax.swing.JOptionPane;
/**
 *
 * @author darka
 */
public class Main {
    /*public boolean validar(float a)
    {
        
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float a, r;
        boolean val = true;
        //alt+shif+f

        while (val) {
            try {
                a = Float.parseFloat(JOptionPane.showInputDialog("Dame Precio sin IVA: "));
                r = Conta.SumaIVA(a);
                JOptionPane.showMessageDialog(null, r);
                val = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "dato incorrecto");
                val = true;
            }
        }
        
        val = true;
        while (val) {
            try {
                a = Float.parseFloat(JOptionPane.showInputDialog("Dame Precio: "));
                r = Conta.Resta(a);
                JOptionPane.showMessageDialog(null, r);
                val = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "dato incorrecto");
                val = true;
            }
        }

        
        val = true;
        while (val) {
            try {
                a = Float.parseFloat(JOptionPane.showInputDialog("Precio sin IVA: "));
                r = Conta.SacarIva(a);
                JOptionPane.showMessageDialog(null, r);
                val = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "dato incorrecto");
                val = true;
            }
            
        
        }
    }
    
}
