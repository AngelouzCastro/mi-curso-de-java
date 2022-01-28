/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_1a10;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author darka
 */
public class MCAJ_1A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        int i;
        double suma=0;
        for (i=1; i <= 10; i++){
            System.out.println(i);
            
        }
        for (i=1; i <= 10; i++){
            suma = suma + i;
            
        }
        suma = suma /10;
            System.out.println(suma);
            
             Scanner sc = new Scanner(System.in);
            int num;
            
            
            System.out.println("Dame un numero: ");
            num = sc.nextInt();
                if(num %2 ==0)
                {
                    System.out.println(num +" es par");
                }
                else
                {
                    System.out.println(num +" es impar");
                }
            
                
            int n;
            System.out.println("Dame numero: ");
            n = sc.nextInt();
            
            
    }
    
}
