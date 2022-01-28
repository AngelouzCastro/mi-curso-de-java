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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String palabra;
        String clave;
        String cad = "";
        String cad1 = "";
        String cad2 = "";
        String cad3 = "";
        String cad4 = "";
        String cad5 = "";
        String cad6 = "";
        String cadena = "";
        int i;
        int cont = 0;
        int cont2 = 1;
        int cont3 = 0;
        int diferencia;
        int uno, dos, tres, cuatro, cinco;

        
        palabra = JOptionPane.showInputDialog(null,"Introduce palabra: ");
        clave = JOptionPane.showInputDialog("Introduce palabra clave: ");

        char clave1[] = clave.toCharArray();

        uno = Integer.parseInt(String.valueOf(clave1[0]));
        dos = Integer.parseInt(String.valueOf(clave1[1]));
        tres = Integer.parseInt(String.valueOf(clave1[2]));
        cuatro = Integer.parseInt(String.valueOf(clave1[3]));
        cinco = Integer.parseInt(String.valueOf(clave1[4]));

        char letras1[] = palabra.toCharArray();

        for (i = 0; i < palabra.length(); i++) {

            if (cont % 5 == 0 && cont != 0) {
                cad = cad + "-" + letras1[i];
                cont = 0;
            } else {
                cad = cad + letras1[i];
            }

            cont++;
        }
        diferencia = 5 - cont;
        while (diferencia != 0) {
            cad = cad + "x";
            diferencia--;
        }
        JOptionPane.showMessageDialog(null, cad);
        char letras2[] = cad.toCharArray();

        for (i = 0; i < cad.length(); i++) {
            if (cont2 == uno) {
                cad1 = cad1 + letras2[i];
            }
            if (letras2[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad.length(); i++) {
            if (cont2 == dos) {
                cad2 = cad2 + letras2[i];
            }
            if (letras2[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad.length(); i++) {
            if (cont2 == tres) {
                cad3 = cad3 + letras2[i];
            }
            if (letras2[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad.length(); i++) {
            if (cont2 == cuatro) {
                cad4 = cad4 + letras2[i];
            }
            if (letras2[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad.length(); i++) {
            if (cont2 == cinco) {
                cad5 = cad5 + letras2[i];
            }
            if (letras2[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cad6 = cad6 + cad1 + cad2 + cad3 + cad4 + cad5;
      
        cont2=0;
        for(i=1;i<=cad6.length();i++){
            cont2++;
            
        }
        //System.out.println(cont2+"-"+ palabra.length() +"-" + cad6.length());
        int v = cad6.length()/5;
        
        for (i = 0; i < v; i++) {
            
            if(i <= 5){
                
            
            cadena = cadena + cad1.charAt(i);
            cadena = cadena + cad2.charAt(i);
            cadena = cadena + cad3.charAt(i);
            cadena = cadena + cad4.charAt(i);
            cadena = cadena + cad5.charAt(i);
            cadena = cadena + "-";
            }else{
            cadena = cadena + cad1.charAt(i);
            cadena = cadena + cad2.charAt(i);
            cadena = cadena + cad3.charAt(i);
            cadena = cadena + cad4.charAt(i);
            cadena = cadena + cad5.charAt(i);
            
            }
            
        }
        //System.out.println(cadena);
        JOptionPane.showMessageDialog(null, cadena);
    }

}
