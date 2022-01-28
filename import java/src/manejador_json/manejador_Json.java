package manejador_json;


import com.sun.istack.internal.logging.Logger;
import static java.awt.JobAttributes.DestinationType.FILE;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.util.logging.PlatformLogger;
import java.util.Scanner;


public class manejador_Json {
    
    Scanner entrada = new Scanner(System.in);
    String [][]Conceptos;
    
       
        
    
    public String dividir(String txt, String nomArchivo ){
        
        String resultado ="";
          try{
            FileReader f;
            File JSONFile =  new File(nomArchivo);
            f =  new FileReader(JSONFile);
            BufferedReader bReader = new BufferedReader(f);
            String sLine = null;
            while((sLine = bReader.readLine()) != null){
                //System.out.println(sLine);
                
           
                
                Pattern p;
                Matcher m;
                p = Pattern.compile(txt);
                m= p.matcher(sLine);
                if(m.find()){
                    char[]a = sLine.toCharArray();
                    int cont = m.end();
                    char caracter = a[cont];
                    while(caracter != '"'){
                        cont++;
                        resultado += caracter;
                        
                        caracter = a[cont];
                    }
                    
                    System.out.println("\n"+resultado+"\n");
                }
                
                //System.out.println("\nLol: "+resultado+"\n");
                
            }
            f.close();
        }catch(FileNotFoundException ex){
            //Logger.getLogger(manejador_Json.class.getName()).log(Level.SEVERE, null,ex);
        }catch(IOException ex){
            //Logger.getLogger(Maneja_JSon.class.getName()).log(Level.SEVERE, null,ex);
        }
        return resultado;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        manejador_Json Mmanejador_Json;
        Mmanejador_Json = new manejador_Json();
        
        int i;
        
         String[] archivos = {"EUSA740126TQ2_Factura_A1228_20151228.xml", "EUSA740126TQ2_Factura_A1238_20151230.xml",
        "EUSA740126TQ2_Factura_A1240_20151230.xml", "EUSA740126TQ2_Factura_A1244_20151231.xml",
        "EUSA740126TQ2_Factura_A1291_20160129.xml", "EUSA740126TQ2_Factura_A1292_20160129.xml",
        "EUSA740126TQ2_Factura_A1298_20160130.xml", "EUSA740126TQ2_Factura_A1299_20160130.xml",
        "EUSA740126TQ2_Factura_A1338_20160227.xml", "EUSA740126TQ2_Factura_A1340_20160227.xml",
        "EUSA740126TQ2_Factura_A1342_20160227.xml", "EUSA740126TQ2_Factura_A1345_20160229.xml",
        "EUSA740126TQ2_Factura_A1346_20160229.xml", "EUSA740126TQ2_Factura_A1359_20160304.xml"};
        
        String  rfc;
        String  nombre;
        String  fecha;
        String  folio;
        String  serie;
        String  importe;
        String  totalImpuestosTrasladados;
        
        
        int pos = 0;
        i=0;
        while(archivos.length != i){

         rfc  = Mmanejador_Json.dividir("Concepto .*cantidad=\"",archivos[i]);
         nombre  = Mmanejador_Json.dividir("Concepto .*unidad=\"",archivos[i]);
         /*fecha [i] = Mmanejador_Json.dividir("fecha=\"",archivos[i]);
         folio [i] = Mmanejador_Json.dividir("folio=\"",archivos[i]);
         serie [i] = Mmanejador_Json.dividir("serie=\"",archivos[i]);
         importe [i] = Mmanejador_Json.dividir("Traslado .*importe=\"",archivos[i]);
         totalImpuestosTrasladados [i] = Mmanejador_Json.dividir("totalImpuestosTrasladados=\"",archivos[i]);*/
         
         System.out.println("Rfc:" + rfc  + " \nnombre: "+ nombre /*+ " fecha: "+ fecha[i] + " folposo: "+ folio[i]
            + " serpose: "+ serie[i]+ " posmporte: "+ importe[i]+" totalposmpuestosTrasladados: "+totalImpuestosTrasladados[i]*/);
        
        i++;
         
            }
        
       
        
    }
    
    
}


