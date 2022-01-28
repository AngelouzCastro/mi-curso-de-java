/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usolibreria;

import javax.swing.JOptionPane;
import MCAJ.Figuras;


/**
 *
 * @author darka
 */
public class UsoLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float b, a, r, area;
        
        b = Float.parseFloat(JOptionPane.showInputDialog("Dame base"));
        a = Float.parseFloat(JOptionPane.showInputDialog("Dame altura"));
        
        area = Figuras.calcularAreaTriangulo(b, a);
        JOptionPane.showInputDialog(null, area);
        
        r = Float.parseFloat(JOptionPane.showInputDialog("Dame radio"));
        
        area= Figuras.cacularAreaCirculo(r);
        
        JOptionPane.showInputDialog(null, area);
        
    }
    
}
