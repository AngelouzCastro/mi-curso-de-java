
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static java.lang.Thread.sleep;
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
public class Hilo5 extends Thread {

    int palabras = 0;
    String Ruta;

    public void run() {
        Ruta = JOptionPane.showInputDialog(null, "hilo 5\nIntroduse ruta del archivo\n Ejemplo:\nC:/Users/nombre/Documents/carpeta/Archivo.txt");
        File archivo = new File(Ruta);
        try {
            if (archivo.exists()) {
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));

                String lineaLeida = archivoLeer.readLine();

                for (int i = 0; i < lineaLeida.length(); i++) {
                    if (lineaLeida != null) {
                        sleep(100);

                        if (lineaLeida.charAt(i) == (char) 32) {
                            if (lineaLeida.charAt(0) == (char) 32) {
                                //System.out.println("espacio");
                            }

                            palabras++;
                            System.out.println("Hilo 5 a Leído: " + palabras + " palabras");

                        }
                        if (palabras == 0) {
                            palabras++;
                            System.out.println("Hilo 5 a Leído: " + palabras + " palabra");
                        }

                    }

                }
                System.out.println("Hilo 5 termino de leer");

                archivoLeer.close();
            } else {
                System.out.println("Hilo 5: no existe el archivo");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
