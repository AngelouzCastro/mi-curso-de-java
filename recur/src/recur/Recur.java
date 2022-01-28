/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recur;
import java.util.Scanner;

/**
 *
 * @author darka
 */
public class Recur {
    static int suma(int a,int b){
        if(a==b){
            return 0;
        }
        else if(a>b){
            return 0;
        }else{
            return a+suma(a+1,b);
        }
    }
    static int f(int a,int b){
        if(a==b){
            return a;
        }
        else if(a>b){
            return a-f(a-1,b);
        }else{
            return b-f(a,b-1);
        }
    }
    
     static int s(int a,int b){
        if(a==b){
            return b;
        }
        else if(a<b){
            return a+s(a+1,b);
        }else{
            return b+s(a,b+1);
        }
    }
     
     static int x(int a,int b){
        if(a>b){
            return 0;
        }else{
            return a+x(a+1,b);
        }
    }
    static int potencia(int b,int e){
        if(e==1){
        return b;
        }else if (e==0){
        return 1;
        }else{
            return b*potencia(b,e-1);
        }
    }
    
    static int factorial(int n){
        if(n==0){
        return 1;
        }else{
        return n*factorial(n-1);
        }
    }
    
     public static int Zer(int w)
        {
            if(w >= 0)
            {
                return 1;   
            }
            else
            {
                return w - Zer(w-1);
            }
        }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lol;
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el numero");
      int b = entrada.nextInt();
      System.out.println("Dame Potencia");
      int e = entrada.nextInt();
      System.out.println("elevacion " +potencia(b,e));
      System.out.println("suma "+suma(b,e));
      System.out.println("nachito "+f(b,e));
      System.out.println("nachito2 "+s(b,e));
      System.out.println("delfin "+x(b,e));
      System.out.println("delfin "+Zer(b));
      System.out.println("delfivkhgc,gjv1n "+Zer(b));
      System.out.println("delfivkhgc,gjv1n "+Zer(e));
      
      
      
      //System.out.println("susecion "+ Zer(b));
    }
    
}
