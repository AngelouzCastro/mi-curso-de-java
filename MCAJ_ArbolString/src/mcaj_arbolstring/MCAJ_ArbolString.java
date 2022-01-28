/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_arbolstring;
import java.util.TreeSet;
import javax.swing.JOptionPane;
/**
 *
 * @author darka
 */
public class MCAJ_ArbolString {
    private Nodo mNodo;
    private Interfaz mInterfaz;
    TreeSet<String> Arbol = new TreeSet<String>();
    
    public MCAJ_ArbolString() {
    mInterfaz = new Interfaz();
    }
    public void Correr() {
        String Numero = " ";
        int opc;
        
        do{
            mInterfaz.imprimirMenu();
            opc = mInterfaz.getOpcion();
            
            switch(opc) {
                case 1:
                    mInterfaz.pedirNumero();
                    Arbol.add(mInterfaz.getNumero());
                    break;
                case 2:
                    mInterfaz.ImprimirArbol(Arbol);
                    break;
                case 3:
                    mInterfaz.pedirNumero();
                    if(Arbol.remove(mInterfaz.getNumero()))
                    {
                        JOptionPane.showInputDialog("Eliminado");
                    }
                    else{
                        JOptionPane.showInputDialog("No se puede borrar ya que no existe");
                    }
                    
                    break;
                case 4:
                    mInterfaz.pedirNumero();
                    if(Arbol.contains(mInterfaz.getNumero()))
                    {
                        JOptionPane.showInputDialog("si esta");
                    }
                    else{
                        JOptionPane.showInputDialog("no esta");
                    }
                    
                    break;
                    
            }
            
        }while(opc != 5);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MCAJ_ArbolString mMain = new MCAJ_ArbolString();
        mMain.Correr();
    }
    
}
