/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_descuento;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author darka
 */
public class MCAJ_Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Precio = 0.0;
        String respuesta;
        String Nombre = "";
        float Subtotal = 0;
        boolean x = false;
        double Total = 0;
        String Cadena ="";
        double descuento = 0.005;
        String Mientras;
        Scanner sc = new Scanner(System.in);
        
        while(x == false)
        {
            Nombre = JOptionPane.showInputDialog("Dame Nombre de productos: ");
            Precio = Double.parseDouble(JOptionPane.showInputDialog("Dame Precio: "));
            Subtotal += Precio * descuento;
            descuento = descuento * 2;
            Cadena = Nombre + " - " + Precio + " - " + descuento + "\n";
            
            Mientras = JOptionPane.showInputDialog("Otro producto?:  si/no");
            if(Mientras == "No"|| Mientras == "no" || Mientras == "nO" || Mientras == "NO")
            {
                x = true;
            } else
            {
                x = false;
            }
        }
         Total = Subtotal * 0.16;
         JOptionPane.showInputDialog(Cadena + "\n" + "Subtotal: $" + Subtotal + "\n" + "Total: $" + Total);
    }
    
}
