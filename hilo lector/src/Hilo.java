
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rogelio
 */
public class Hilo extends Thread{
    int palabras = 0;
   

    public void run(File archivo) {
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
                            System.out.println("Hilo 1 a Leído: " + palabras + " palabras");

                        }
                        if (palabras == 0) {
                            palabras++;
                            System.out.println("Hilo 1 a Leído: " + palabras + " palabra");
                        }

                    }

                }
                System.out.println("Hilo 1 termino de leer");
                palabras =0;

                archivoLeer.close();
            } else {
                System.out.println("no existe el archivo");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
