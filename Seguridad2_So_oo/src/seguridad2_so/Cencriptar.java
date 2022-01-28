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
public class Cencriptar {

    
    private Scanner lector = new Scanner(System.in);
    private String palabra;
    private String palabra2;
    private String clave;
    private String cad = "";
    private String cad1 = "";
    private String cad2 = "";
    private String cad3 = "";
    private String cad4 = "";
    private String cad5 = "";
    private String cad6 = "";
    private String cadena = "";
    
     private String cad8 = "";
    private String cad9 = "";
    private String cad10 = "";
    private String cad11 = "";
    private String cad12 = "";
    private String cad13 = "";
    private String cad14 = "";
    private String cadena2 = "";
    
    private int i;
    private int cont = 0;
    private int cont2 = 1;
    private int cont3 = 0;
    private int diferencia;
    private int uno, dos, tres, cuatro, cinco;

    
    public void pedirPalabra(){
        palabra = JOptionPane.showInputDialog(null, "dame palabra:");
    }
    public void pedirClave(){
        clave = JOptionPane.showInputDialog("Introduce palabra clave: ");
    }
    
    public void encriptar(String Palabra,String Clave) {
        this.palabra = Palabra;
        this.clave = Clave;

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
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    public void desencriptar(String Clave,String Palabra2){
        String cad8;
        this.clave = Clave;
        cad8 = Palabra2;

        char clave1[] = clave.toCharArray();

        uno = Integer.parseInt(String.valueOf(clave1[0]));
        dos = Integer.parseInt(String.valueOf(clave1[1]));
        tres = Integer.parseInt(String.valueOf(clave1[2]));
        cuatro = Integer.parseInt(String.valueOf(clave1[3]));
        cinco = Integer.parseInt(String.valueOf(clave1[4]));
        
        char letras2x[] = cad8.toCharArray();
        cont2=1;
        for (i = 0; i < cad8.length(); i++) {
            if (cont2 == uno) {
                cad9 = cad9 + letras2x[i];
            }
            if (letras2x[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad8.length(); i++) {
            if (cont2 == dos) {
                cad10 = cad10 + letras2x[i];
            }
            if (letras2x[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad8.length(); i++) {
            if (cont2 == tres) {
                cad11 = cad11 + letras2x[i];
            }
            if (letras2x[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad8.length(); i++) {
            if (cont2 == cuatro) {
                cad12 = cad12 + letras2x[i];
            }
            if (letras2x[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cont2 = 1;
        for (i = 0; i < cad8.length(); i++) {
            if (cont2 == cinco) {
                cad13 = cad13 + letras2x[i];
            }
            if (letras2x[i] == '-') {
                cont2 = 0;
            }
            cont2++;
        }
        cad14 = cad14 + cad9 + cad10 + cad11 + cad12 + cad13;
        
        int v = cad14.length()/5;
        
        for (i = 0; i < v; i++) {
            
           
            cadena2 = cadena2 + cad9.charAt(i);
            cadena2 = cadena2 + cad10.charAt(i);
            cadena2 = cadena2 + cad11.charAt(i);
            cadena2 = cadena2 + cad12.charAt(i);
            cadena2 = cadena2 + cad13.charAt(i);
           
            
            
            
        }
        String Cadena3 ="";
        int j =0;
        for(i=0; i < cadena2.length();i++){
            if(cadena2.charAt(i) != 'x'){
                Cadena3= Cadena3 + cadena2.charAt(i);
            }
        }
        
        //JOptionPane.showMessageDialog(null,"lol "+ cadena2);
        JOptionPane.showMessageDialog(null,Cadena3);

    }
    
    public String GetPalabra(){
        return palabra;
    }
    public String GetClave(){
        return clave;
    }
    public String GetCad6(){
        return cadena;
    }
    
}
