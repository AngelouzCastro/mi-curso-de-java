/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
/**
 *
 * @author rogelio
 */
public class principal {
    static int palabras;
    static int lineas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        palabras = 0;
        lineas =0;
        File archivo = new File("/Users/rogelio/Desktop/palabras.txt");
        contador(archivo);
        
    }
    
    public static void contador(File archivo){
        try{
            if(archivo.exists()){
                BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
                
                String lineaLeida;
                
                while((lineaLeida = archivoLeer.readLine()) != null){
                    //System.out.println(lineaLeida);
                    
                    StringTokenizer st = new StringTokenizer(lineaLeida);
                    lineas ++;
                    System.out.println("cont pal: " + palabras);
                    palabras = palabras + st.countTokens();
                    System.out.println("cont pal: " + st.countTokens());
                }
                System.out.println("\n palabras: "+palabras);
                archivoLeer.close();
            }else{
                System.out.println("no existe el archivo");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
