import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String regex, cad;
            while(true){    
                System.out.println("\nInserte la expreciòn regular: ");
                regex = entrada.next();
                System.out.println("\nInserte la cadena donde se va a buscar: ");
                cad = entrada.next();
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(cad);
                boolean found = false;
                while(matcher.find()){
                    System.out.println(" Texto encontrado: " +
                    matcher.group() + " comienza en el indice " +
                    matcher.start() + " termina el indice " +
                            (matcher.end()-1 + "\n")
                    );
                    found = true;
                }
                if(found){
                    System.out.println("no se encontro concidencias");
                }
            }
    }
    
}

