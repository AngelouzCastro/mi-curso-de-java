/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_alumno_java;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author darka
 */
public class Interfaz {
        private String NC;
        private String Nombre;
        private int OPC;
        private Scanner sc = new Scanner(System.in);

        public Interfaz()
        {
            NC = "";
            Nombre = "";
            OPC = 0;
        }

        public void PedirNC()
        {
            
            NC = JOptionPane.showInputDialog("Dame numero de control: ");
        }
        public void PedirNombre()
        {
            Nombre = JOptionPane.showInputDialog("Dame Nombre: ");
        }
        public void ImprimirMenu()
        {
            System.out.println("MENU");
            System.out.println();
            System.out.println("1. Agrgar Alumno");
            System.out.println("2. Imprimir");
            System.out.println("3. Salir");
            System.out.println("Eliga Opcion...");
            OPC = sc.nextInt();
        }

        public String GetNC()
        {
            return NC;
        }

        public String GetNombre()
        {
            return Nombre;
        }

        public int GetOPC()
        {
            return OPC;
        }

        public void ImprimirSaludo(Alumno mAlumno)
        {
            JOptionPane.showInputDialog(null,"Hola que tal " + mAlumno.GetNC() + " - " + mAlumno.GetNombre());
        }
    
}
