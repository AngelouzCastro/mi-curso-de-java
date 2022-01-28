/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_arbolstring;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author darka
 */
public class Interfaz {
    
	private String Numero;
        private String Elim;
	private int Opcion;
        private String Buscar;
	private Scanner sc;
        private String Cadena;

	public Interfaz(){
		Numero = "";
                Elim = " ";
                Buscar = "";
		sc = new Scanner(System.in);
		Opcion=0;
                Cadena="";
	}

	public void imprimirMenu() {
		System.out.println(" M E N U ");
		System.out.println("1 - Agregar numero");
		System.out.println("2 - Imprimir");
		System.out.println("3 - Eliminar");
		System.out.println("4 - Buscar");
                System.out.println("5 - Salir");
		System.out.println("Selecciona una Opcion: ");
		Opcion = sc.nextInt();
	}

	public int getOpcion(){
		return Opcion;
	}

	public void pedirNumero(){
		Numero = JOptionPane.showInputDialog("Dame lo nombre");
                //System.out.println("Dame numero");
                //Numero = sc.nextLine();
	}
       

	public String getNumero(){
		return Numero;
	}
       
	
         public void ImprimirArbol(TreeSet Numero){
            JOptionPane.showMessageDialog(null, Numero);
        }
	
}
