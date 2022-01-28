
import java.io.File;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogelio
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Ruta,Ruta2,Ruta3,Ruta4,Ruta5;
        Ruta = JOptionPane.showInputDialog(null, "Introduse ruta del archivo\n Ejemplo:\nC:/Users/nombre/Documents/carpeta/Archivo.txt");
        File archivo = new File(Ruta);
        Ruta2 = JOptionPane.showInputDialog(null, "Introduse ruta del archivo\n Ejemplo:\nC:/Users/nombre/Documents/carpeta/Archivo.txt");
        File archivo2 = new File(Ruta2);
        Ruta3 = JOptionPane.showInputDialog(null, "Introduse ruta del archivo\n Ejemplo:\nC:/Users/nombre/Documents/carpeta/Archivo.txt");
        File archivo3 = new File(Ruta3);
        Ruta4 = JOptionPane.showInputDialog(null, "Introduse ruta del archivo\n Ejemplo:\nC:/Users/nombre/Documents/carpeta/Archivo.txt");
        File archivo4 = new File(Ruta4);
        Ruta5 = JOptionPane.showInputDialog(null, "Introduse ruta del archivo\n Ejemplo:\nC:/Users/nombre/Documents/carpeta/Archivo.txt");
        File archivo5 = new File(Ruta5);
        Hilo mHilo = new Hilo();
        mHilo.run(archivo);
        mHilo.run(archivo2);
        mHilo.start();

    }
    
}
