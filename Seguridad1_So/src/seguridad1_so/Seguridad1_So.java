/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad1_so;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class Seguridad1_So {

    private String encripto = "";
    private String encripto2 = "";
    private String palabra;
    private String desencriptado = "";
    private String cadena1 = "", cadena2 = "";

    public void pedirPalabra(){
        palabra = JOptionPane.showInputDialog(null, "dame palabra:");
    }
    
    public void encriptar(String palabra) {
        
        for (int i = 0; i < palabra.length(); i++) {
            if (i % 2 == 0) {
                cadena1 = cadena1 + palabra.charAt(i);
            } else {
                cadena2 = cadena2 + palabra.charAt(i);
            }

        }

        encripto = cadena1 + cadena2 ;
        JOptionPane.showMessageDialog(null,"\nBloque1: "+ cadena1 + "\nBloque2: " + cadena2 + "\nCripto:" + encripto);
        
        

    }

    public void desencriptar(String pal) {
        for (int i = 0; i < palabra.length(); i++) {
            if (i % 2 != 0) {
                desencriptado = desencriptado + palabra.charAt(i);
            } else {
                desencriptado = desencriptado + palabra.charAt(i);
            }
                
        }
        
        JOptionPane.showMessageDialog(null,desencriptado);
        
    }

    public String getEncripto() {
        return encripto;
    }
    
    public String Getpal(){
        return palabra;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        Seguridad1_So mSeguridad = new Seguridad1_So();

        

        do {
            opcion = Integer.parseInt( JOptionPane.showInputDialog("\nTransposición simple"
                    + "\n1.introducir palabra"
                    + "\n2.Encriptar"
                    + "\n3.Desencriptar"
                    + "\n4.Salir"
                    + "\nElige opcion: " ));

            if (opcion == 1) {
                mSeguridad.pedirPalabra();
            } else if (opcion == 2) {
                mSeguridad.encriptar(mSeguridad.Getpal());
            } else if (opcion == 3){
                mSeguridad.desencriptar(mSeguridad.getEncripto());
            }

        } while (opcion != 4);

    }

}
