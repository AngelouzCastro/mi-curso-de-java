/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad2_so;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class Seguridad2_So {
Cencriptar mCencriptar;
private int opcion;

Seguridad2_So(){
    mCencriptar = new Cencriptar();
    opcion=0;
}
public void correr(){
    do {
            

            opcion = Integer.parseInt( JOptionPane.showInputDialog("Transposición por grupos"
                    + "\n1.introducir palabra"
                    + "\n2.Desencriptar"
                    + "\n3.Salir"
                    + "\nElige opcion: " ));

            if (opcion == 1) {
               mCencriptar.pedirPalabra();
               mCencriptar.pedirClave();
               mCencriptar.encriptar(mCencriptar.GetPalabra(),mCencriptar.GetClave());
            } else if (opcion == 2) {
                mCencriptar.pedirClave();
                mCencriptar.desencriptar(mCencriptar.GetClave(),mCencriptar.GetCad6());
            
            }
                
          

        } while (opcion != 3);
}
    
    public static void main(String[] args) {
    Seguridad2_So mSeguridad2_So = new Seguridad2_So();
    mSeguridad2_So.correr();
    }

}
