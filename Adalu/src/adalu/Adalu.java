/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adalu;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author darka
 */
public class Adalu {
    private Lista mLista;
    private Nodo mNodo;
    private int a;
    private Articulos n;
    private String Nombre;
    private Interfaz mInterfaz;
    private Articulos mArticulos;
   // private Archivos mArchivos;
    
    
    public Adalu() {
        mLista = new Lista();
        mNodo = new Nodo();
        mInterfaz = new Interfaz();
        //mArchivos = new Archivos("Aldalu.txt");
        Nombre = "";
    }
    
    public void Correr() {
        int Opcion = 0;
        do{
            mInterfaz.imprimirMenu();
            Opcion = mInterfaz.getOpcion();
            
            switch(Opcion)
            {
                case 1:
                    mArticulos = new Articulos();
                    mInterfaz.PedirNombre();
                    mArticulos.setNombre(mInterfaz.getNombre());
                    mInterfaz.PedirPrecio();
                    mArticulos.setPrecio(mInterfaz.getPrecio());
                    mInterfaz.PedirCantidad();
                    mArticulos.setCantidad(mInterfaz.getCantidad());
                    
                    mArticulos.CalcularTotal();
                    
                    mLista.agregarNodo(mArticulos);
                    break;
                case 2:
                    mInterfaz.Imprimir(mLista);
                    mLista = new Lista();
                    break;
                case 3:
                    mInterfaz.conocerTiket(mLista);
                    break;
                case 4:
                    mInterfaz.PedirCantidad();
		int Nombre = mInterfaz.getCantidad();
		mLista.buscarNodo(Nombre);
		a = mInterfaz.getCantidad();
		n = new Articulos();
		n.setNombre(mInterfaz.getNombre());
		mInterfaz.PedirNombre();
		n.setPrecio(mInterfaz.getPrecio());
		mInterfaz.PedirCantidad();
		n.setCantidad(mInterfaz.getCantidad());
		mLista.ModificarNodo(a, n);
                    
                    break;
                case 5:
                    mInterfaz.PedirCantidad();
                    Nombre = mInterfaz.getCantidad();
                    mLista.buscarNodo(Nombre);
                    mLista.eliminar(Nombre);
                    break;
                
                    
                
            }
        }while(Opcion != 6);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adalu mAdalu = new Adalu();
        mAdalu.Correr();
    }
    
}
