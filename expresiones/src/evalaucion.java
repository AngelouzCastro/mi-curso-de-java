
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class evalaucion {
    private Stack<Character> pila = new Stack<Character>();
    Scanner entrada = new Scanner (System.in);
    String areaTexto = "";
    
        public void evaluar(){
      
        String infija = entrada.next();   
        
        //Validamos que la emprecion tecleada no este en blanco.
        if(infija.equals("")){
            return;
        }
        
        //Validamos que los parentesis esten correctamente anidados
        if(validarParentesis(infija)){
            //System.out.println("error en parentesis");
        }
        else{
            System.out.println("error en parentesis");
            return;
        }
        
        
        //Validamos que la emprecion no inicie con un operador
        if(empiesaConOperador(infija)){
            //System.out.println("la exprecion empieza con operador");
            return;
        }
        else{
            //System.out.println("la exprecion no empieza con operador 2");
        }
        
        
        //Validamos que la emprecion no termine con un operador
        if(terminaConOperador(infija)){
            System.out.println("la exprecion no cierra parentesis");
            return;
        }
        else{
            //System.out.println("la exprecion termina con operador");
        }
        //Evaluamos que la exprecion este correctamente alternada
        if(evaluarAlternaciones(infija)){
            //System.out.println("buena alternacion");
        }
        else{
            System.out.println("mala alternacion");
            return;
        }
        //Evaluamos transformamos la exprecion a posfijo
        String posfija = toPosfijo(infija);
        if(posfija==null){
            return;
        }
        else{
            System.out.println("exprecion posfija: \n"+posfija);
        }
        
        int operacion = evaluarPosfijo(posfija);
        System.out.println("resultado = "+ operacion);
        
    }
    
    public int evaluarPosfijo(String posfijo){              
        ArrayList<String> token = new ArrayList<String>();
        
        
        StringTokenizer st = new StringTokenizer(posfijo," ");
        while(st.hasMoreTokens()){
            token.add(st.nextToken());
        }
        
        if(token.size()==1){
            return Integer.parseInt(token.get(0));                
        }
        int c=0;
        areaTexto = areaTexto + token.toString()+"\n";
        while(token.size()!=1){
            
            String operador = token.get(c);
            if(operador.equals("+")||operador.equals("-")||operador.equals("*")||operador.equals("/")||operador.equals("^")){
                String operando1=token.get(c-1);
                String operando2 =token.get(c-2);
                
                token.remove(c);
                token.remove(c-1);
                token.remove(c-2);
                if(operador.equals("+")){
                    try {
                        String suma = (Integer.parseInt(operando2)+Integer.parseInt(operando1))+"";
                        token.add(c-2,suma);
                        c=0;
                    } catch (Exception e) {
                        System.out.println("Error al comvertir un operando\n"+e);
                        return 0;
                    }                    
                }
                else if(operador.equals("-")){
                    try {
                        String resta = (Integer.parseInt(operando2)-Integer.parseInt(operando1))+"";
                        token.add(c-2,resta);
                        c=0;
                    } catch (Exception e) {
                        System.out.println("Error al comvertir un operando\n"+e);
                        return 0;
                    }    
                }
                else if(operador.equals("*")){
                    try {
                        String multiplicacion = (Integer.parseInt(operando2)*Integer.parseInt(operando1))+"";
                        token.add(c-2,multiplicacion);
                        c=0;
                    } catch (Exception e) {
                        System.out.println("Error al comvertir un operando\n"+e);
                        return 0;
                    }    
                }
                else if(operador.equals("/")){
                    try {
                        String divicion = (Integer.parseInt(operando2)/Integer.parseInt(operando1))+"";
                        token.add(c-2,divicion);
                        c=0;
                    } catch (Exception e) {
                        System.out.println("Error al comvertir un operando\n"+e);
                        return 0;
                    }    
                }
                else{
                    try {
                        String potencia = (Integer.parseInt(operando2)^Integer.parseInt(operando1))+"";
                        token.add(c-2,potencia);
                        c=0;
                    } catch (Exception e) {
                        System.out.println("Error al comvertir un operando\n"+e);
                        return 0;
                    }   
                }
                areaTexto = areaTexto + token.toString()+"\n";
            }
            else{
                c++;
            }
        }
        try {            
            return Integer.parseInt(token.get(0));            
        } catch (Exception e) {
            System.out.println("Error al parsear el resultado\n"+e);
            return 0;
        }
        
    }
    
    
    public boolean evaluarAlternaciones(String infijo){
        char[] cadena = infijo.toCharArray();
        char ultimoElemento=cadena[0];
        
        //Se da por entendido que todas las expreciones son correctas hasta que se encuentre un error
        boolean validacion=true;
    
        for(int c =1;c<cadena.length;c++){
            char caracter = cadena[c];
            if(Character.isDigit(caracter)){
                if(ultimoElemento==')'){
                    String salida = generarError(infijo,c);
                    salida+="No se puede poner un numero despues de un ')'\n";
                    areaTexto = areaTexto + salida;
                    validacion=false;                    
                }                                       
                else{
                    ultimoElemento=caracter;
                }
            }
            else if(caracter=='('){
                if(ultimoElemento=='('){
                    ultimoElemento=caracter;
                }
                else if(ultimoElemento=='+' || ultimoElemento=='-' || ultimoElemento=='*' || ultimoElemento=='/' || ultimoElemento=='^'){
                    ultimoElemento=caracter;
                }
                else{
                    String salida = generarError(infijo,c);
                    salida+="Despues de un '"+ultimoElemento+"' no puede venir un '('\n";
                    areaTexto = areaTexto + salida;
                    validacion=false;                         
                }                                    
            }
            else if(caracter==')'){
                if(ultimoElemento==')'){
                    ultimoElemento=caracter;
                }
                else if(Character.isDigit(ultimoElemento)){
                    ultimoElemento=caracter;
                }
                else{
                    String salida = generarError(infijo,c);
                    salida+="Despues de un '"+ultimoElemento+"' no puede venir un ')'\n";
                    //areaTexto.append(salida);
                    areaTexto = areaTexto + salida;
                    validacion=false;                     
                }                                   
            }
            else if(caracter=='+' || caracter =='-' || caracter=='*' || caracter=='/' || caracter=='^'){
                if(ultimoElemento==')'){
                    ultimoElemento=caracter;
                }
                else if(Character.isDigit(ultimoElemento)){
                    ultimoElemento=caracter;
                }
                else{
                    String salida = generarError(infijo,c);
                    salida+="Despues de un '"+ultimoElemento+"' no puede venir un Operador '"+caracter+"'\n";
                    areaTexto = areaTexto + salida;
                    validacion=false;                   
                }                                       
            }            
        }       
        
        return validacion;
    }
    
    
    public boolean terminaConOperador(String infijo){
        char[] cadena = infijo.toCharArray();
        for(int c=cadena.length-1;c>0;c--){
            char caracter = cadena[c];
            if(Character.isDigit(caracter)){
                return false;
            }
            if(Character.isLetter(caracter)){
                return false;
            }
            else if(caracter=='+' || caracter =='-' || caracter=='*' || caracter=='/' || caracter=='^'){
                String salida = generarError(infijo,c);
                salida+="La exprecion nu puede terminar con operador";
                System.out.println(salida);
                return true;
            }
        }
        return false;
    }
    
    
    public boolean empiesaConOperador(String infijo){
        char[] cadena = infijo.toCharArray();
        for(int c=0;c<cadena.length;c++){
            char caracter = cadena[c];
            if(Character.isDigit(caracter)){
                return false;
            }
            if(Character.isLetter(caracter)){
                return false;
            }
            else if(caracter=='+' || caracter =='-' || caracter=='*' || caracter=='/' || caracter=='^'){
                String salida = generarError(infijo,c);
                salida+="La exprecion nu puede empesar con operador";
                System.out.println(salida);
                return true;
            }
        }
        return false;
    }
    
    
    public String toPosfijo(String infijo){             
        String salida="";
        char[] cadena = infijo.toCharArray();
        
        for(int c=0;c<cadena.length;c++){
            char caracter = cadena[c];
            if(caracter=='('){
                pila.push(caracter);
            } 
            else if(caracter==')'){                
                while(true){
                    if(pila.empty()){
                        String retorno = generarError(infijo,c);
                        retorno+="Operacion invalida numero de parentesis impares";
                        System.out.println(retorno);
                        return null;
                    }
                    char temp = pila.pop().charValue();
                    if(temp=='('){
                        break;
                    }
                    else{
                        salida+=" "+temp;
                    }
                }//fin del wile
            }
            else if(Character.isDigit(caracter)){
                salida+=" "+caracter;                
                c++;
     busqueda : for( ; c<cadena.length;c++){
                    if(Character.isDigit(cadena[c])){
                        salida+=cadena[c];
                    }
                    else{
                        c--;
                        break busqueda;
                    }                    
                }                
            }
            else if(caracter=='+'||caracter=='-'||caracter=='/'||caracter=='*'||caracter=='^'){   
                if(pila.empty()){
                    pila.push(caracter);
                }
                else{
                    while(true){                    
                        if(esDeMayorPresedencia(caracter)){                            
                            pila.push(caracter);
                            break;
                        }else{
                            salida+=" "+pila.pop();
                        }  
                    }                                 
                }               
            }
            else{
                String retorno = generarError(infijo,c);
                retorno+="caracter no valido para la exprecion : '"+caracter+"'";
                System.out.println(retorno);
                return null;
            }
        }//fin del for
        if(!pila.empty()){
            do{
                char temp = pila.pop().charValue();
                salida+=" "+temp;                
            }while(!pila.empty());
        }
        
        return salida.trim();
    }
    
    
    public boolean validarParentesis(String operacion){
        Stack<Character> pila = new Stack<Character>();
        
        char[] ecuacion = operacion.toCharArray();        
        for(int c=0;c<ecuacion.length;c++){
            char caracter = ecuacion[c];
            if(caracter=='('){
                pila.push(caracter);
            }
            else if(caracter==')'){
                if(pila.empty()){
                    String salida = generarError(operacion,c);
                    salida+="Numero de parentesis impares";
                    System.out.println(salida);
                    return false;
                }
                else{
                    pila.pop();
                }
            }
        }
        if(!pila.empty()){    
            String salida = generarError(operacion,ecuacion.length-1);
            salida+="Numero de parentesis impares,Se esperaba que se cerrara los parentesis";
            //areaTexto.setText(salida);
            System.out.println(salida);
            return false;
            
        }        
        return true;
    }
    
    
    private String generarError(String infijo,int indice){
        String error[] = new String[infijo.length()];
        for(int c=0;c<error.length;c++){
            error[c]="  ";
        }
        error[indice]="^";
        
        String error2="";
        for(int c=0;c<error.length;c++){
            error2+=error[c];
        }
        return infijo+"\n"+error2+"\n";
    }
    
   
    private boolean esDeMayorPresedencia(char caracter){
        if(pila.empty()){
            return true;
        }
        if(caracter==pila.peek().charValue()){
            return false;
        }
        if(caracter=='^'){
            return true;
        }
        if( (caracter=='*'&&pila.peek().charValue()=='/')||(caracter=='/'&&pila.peek().charValue()=='*')){
            return false;
        }
        if( (caracter=='+'&&pila.peek().charValue()=='-')||(caracter=='-'&&pila.peek().charValue()=='+')){
            return false;
        }        
        else if(caracter=='-'||caracter=='+'){
            char temp = pila.peek().charValue();
            if(temp=='*'||temp=='/'){
                return false;
            }
        }
        return true;        
    }
   
    
}
