/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_gamma;
import java.util.Scanner;
/**
 *
 * @author darka
 */
public class MCAJ_Gamma {
     static double Gamma(double n) {
      if(n == 1){
          return 1;
      }else if(n == 0.5){
          return 0.5*Math.sqrt(Math.PI);
      }else if(n == 1.5){
          return 1.5*Math.sqrt(Math.PI);
      }else if(n == 2){
          return 2;
      }else if(n == 2.5){
          return 2.5*Math.sqrt(Math.PI);
      }else if(n == 3){
          return 2;
      }else if(n == 3.5){
          return 3.323;
      }else if(n == 4){
          return 6;
      }else {
          return n-1 * Gamma(n-1);
      }
     }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el numero");
      double n = entrada.nextDouble();
      System.out.println(Gamma(n));
        
    }
    
    
}
