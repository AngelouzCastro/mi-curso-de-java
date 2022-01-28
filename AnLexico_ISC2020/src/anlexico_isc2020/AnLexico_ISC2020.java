/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anlexico_isc2020;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darka
 */
public class AnLexico_ISC2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            Reader reader = new BufferedReader(
                    new FileReader("/Users/darka/Documents/NetBeansProjects/AnLexico_ISC2020/src/anlexico_isc2020/CodeLanguage.txt"));
            Lexer lexer = new Lexer(reader);
            String resultado = "";
            while (true) {
                Token token = lexer.yylex();
                if (token == null) {
                    resultado = resultado + "END OF file";
                    System.out.println(resultado);
                    return;
                }
                switch (token) {
                    case ERROR:
                        resultado += "Error, símbolo no reconocido \n";
                        break;
                    case ID:  case INT:
                        resultado += "Token " + token + "\n";
                        break;
                    default:
                        resultado += "Token " + token + "\n";
                        break;
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnLexico_ISC2020.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
