import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class principal {

    public void leer(){
        //StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("C:\\Users\\darka\\Desktop\\isc21-8\\psp-dani\\a1\\tamanos1.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while((linea = br.readLine())!= null)
            {
                //sb.append(linea).append("\n");
                String[] datosDeLinea = linea.split(",");
                ArrayList<String> datosTemporal = new ArrayList<String>();
                for(String dato: datosDeLinea)
                {
                    datosTemporal.add(dato);
                }
                datos.add(datosTemporal);
            }
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        System.out.println(datos);
    }
    public static void main(String[] args) {
        principal mPrincipal = new principal();
        mPrincipal.leer();
    }
    
}
