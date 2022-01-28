/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class Main {
    private String palabra;
    private String pal;
    private String pal2;
    Main(){
        palabra = "";
        pal ="";
        pal2 ="";
    }
    
    public void introducirpal(){
         palabra = JOptionPane.showInputDialog(null, "dame palabra:");
    }
    public String Getpal(){
        return palabra;
    }

    public void encriptar(String palabra) {
        char[] invertido;
        invertido = palabra.toCharArray();
        for (int i = palabra.length() - 1; i >= 0; i--) {
           
            pal = pal+ invertido[i];
            
        }
         JOptionPane.showMessageDialog(null,pal);
    }


    public void desencriptar(String palabra2) {
        char[] invertido2;
        invertido2 = palabra2.toCharArray();
        for (int i = palabra2.length() - 1; i >= 0; i--) {
           
            pal2 = pal2+ invertido2[i];
            
        }
         JOptionPane.showMessageDialog(null,pal2);
    }
    
    public String GetEncriptar(){
        return pal;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main mMain = new Main();
        int opcion = 0;
        Scanner lector = new Scanner(System.in);
        
        do {
            

            opcion = Integer.parseInt( JOptionPane.showInputDialog("\nTransposición inversa"
                    + "\n1.introducir palabra"
                    + "\n2.Encriptar"
                    + "\n3.Desencriptar"
                    + "\n4.Salir"
                    + "\nElige opcion: " ));

            if (opcion == 1) {
                mMain.introducirpal();
            } else if (opcion == 2) {
                mMain.encriptar(mMain.Getpal());
            } else if (opcion == 3){
                mMain.desencriptar(mMain.GetEncriptar());
            }

        } while (opcion != 4);
    }
}
