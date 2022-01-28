/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_palindromo;
import java.util.Scanner;
import java.io.*;

/**
 *
 * 
 * @author darka
 */
public class MCAJ_Palindromo {
    public static boolean ChecarPalindromo(String Palabra)
    {
        for(int i = 0; i < Palabra.length(); i++)
        {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Palabra;
        Scanner Frase = new Scanner(System.in);
        System.out.print("Dame Frase: ");
        Palabra = Frase.next();
        
        if (ChecarPalindromo(Palabra) == true)
        {
            System.out.print("La frase " + Palabra + " es un palindromo ");
        } else
        {
            System.out.print("La frase "+ Palabra + " no es un palindromo ");
        }
    }
    
}
