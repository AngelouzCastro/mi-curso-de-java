//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author darka
 */
public class Interfaz {
    private int Dato;
    private int Opcion;
    private int Clave;
    private String Nombre;
    private int ClaveM;
    private String NombreM;
    private ListaA mListaA;
    private ListaB mListaB;
    private Alumno mAlumno;
    private Materia mMateria;
    private int Buscado;
    private int Buscado2;
	private Scanner sc = new Scanner(System.in);

	public Interfaz()
	{
	Dato=0;
	Opcion = 0;
        Clave = 0;
        Nombre ="";
        ClaveM=0;
        NombreM="";
        mListaA = new ListaA();
        mListaB = new ListaB();
	}

	 public void ImprimirMenu()
        {
           
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Agregar Materia");
            System.out.println("3. Asignar");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
          	Opcion = sc.nextInt();
        }


     public void PedirClave()
     {
        System.out.println("Dame Clave:");
        Clave = sc.nextInt();
     }

     public void PedirNombre()
     {
        Nombre = JOptionPane.showInputDialog("Dame Nombre: ");
     }

     public void PedirClaveM()
     {
        System.out.println("Dame ClaveM:");
        ClaveM = sc.nextInt();
     }

     public void PedirNombreM()
     {
        NombreM = JOptionPane.showInputDialog("Dame NombreM: ");
     }
      public void PedirBuscado()
     {
        System.out.println("selecione alumno:");
        Buscado = sc.nextInt();
     }
      public void PedirBuscado2()
     {
        System.out.println("selecione materia:");
        Buscado2 = sc.nextInt();
     }


    public int getDato(){
        return Dato;
    }

    public int getClave() {
        return Clave;
    }
    public String getNombre() {
        return Nombre;
    }

    public int getClaveM()
    {
        return ClaveM;
    }

    public String getNombreM() {
        return NombreM;
    }
	
    public int getOpcion(){
	return Opcion;
    }
    
    public int getBuscado(){
	return Buscado;
    }
    
    public int getBuscado2(){
	return Buscado2;
    }

     public void ImprimirLista(ListaA mListaA, ListaB mListaB)
     {
        Alumno mMandado;
        Materia mMateria;
        String Cadena1 = " ";
        String cadena2 = " ";
        String Cadena3= " ";
        NodoA mNodoA=mListaA.getInicio();
        while(mNodoA!=null){
        while(mNodoA.getDato().getBuscado()!= mNodoA.getDato().getClave()){
            if(mNodoA.getDato().getBuscado()== mNodoA.getDato().getClave()){
                Cadena1 = Cadena1 + mNodoA.getDato().getClave() + "-" + mNodoA.getDato().getNombre();
            }else{
                mNodoA = mNodoA.getSiguiente();
            }
        }
        }
        NodoB mNodoB = mListaB.getInicio();
        while(mNodoB!=null){
        while(mNodoB.getDato().getBuscado2()!= mNodoB.getDato().getClaveM()){
            if(mNodoB.getDato().getBuscado2()== mNodoB.getDato().getClaveM()){
                cadena2 = cadena2 + mNodoB.getDato().getClaveM() + "-" + mNodoB.getDato().getNombreM();
            }else{
                mNodoB = mNodoB.getSiguiente();
            }
        }
        }
        Cadena3 = Cadena1 + cadena2;
        
        System.out.println("Alumno: "+ Cadena3);
             
        
     
     }

     
}
     
     
 
    

