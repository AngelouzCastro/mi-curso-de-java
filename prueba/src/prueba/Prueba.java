/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author darka
 */
public class Prueba {
        private ListaA mListaA;
        private ListaB mListaB;
	private NodoA mNodoA;
        private NodoB mNodoB;
	private Interfaz mInterfaz;
	private int  Dato;
	private Alumno n;
        private Materia m;
	private int a;
	private int Numero;
	private Alumno mAlumno;
        private Materia mMateria;
        
        public Prueba(){
        mListaA = new ListaA();
        mListaB = new ListaB();
	mNodoA = new NodoA();
        mNodoB = new NodoB();
	mInterfaz = new Interfaz();
	Dato = 0;
        }
        public void Correr() {
	int Opcion = 0;

	do{
	mInterfaz.ImprimirMenu();
	Opcion = mInterfaz.getOpcion();	

	switch (Opcion)
	{
		case 1:
		mAlumno = new Alumno();
		mInterfaz.PedirClave();
		mAlumno.setClave(mInterfaz.getClave());
                mInterfaz.PedirNombre();
                mAlumno.setArticulo(mInterfaz.getNombre());
		
		mListaA.agregarNodo(mAlumno);
		break;

		case 2:
                mMateria = new Materia();
		mInterfaz.PedirClaveM();
		mMateria.setClaveM(mInterfaz.getClaveM());
                mInterfaz.PedirNombreM();
                mMateria.setNombreM(mInterfaz.getNombreM());
		
		mListaB.agregarNodo(mMateria);
		
		break;

		
		case 3:
		mInterfaz.PedirBuscado();
                mAlumno.setBuscado(mInterfaz.getBuscado());
                mInterfaz.PedirBuscado2();
                mMateria.setBuscado2(mInterfaz.getBuscado2());
                
                mListaA.agregarNodo(mAlumno);
                mListaB.agregarNodo(mMateria);
                
                mInterfaz.ImprimirLista(mListaA, mListaB);
		break;
                
                case 4:
                mAlumno = new Alumno();
		mInterfaz.PedirClave();
		mAlumno.setClave(mInterfaz.getClave());
                mInterfaz.PedirNombre();
                mAlumno.setArticulo(mInterfaz.getNombre());
                mMateria = new Materia();
		mInterfaz.PedirClaveM();
		mMateria.setClaveM(mInterfaz.getClaveM());
                mInterfaz.PedirNombreM();
                mMateria.setNombreM(mInterfaz.getNombreM());
                mInterfaz.PedirBuscado();
                mAlumno.setBuscado(mInterfaz.getBuscado());
                mInterfaz.PedirBuscado2();
                mMateria.setBuscado2(mInterfaz.getBuscado2());
                mListaA.agregarNodo(mAlumno);
                mListaB.agregarNodo(mMateria);
                mInterfaz.ImprimirLista(mListaA, mListaB);
                break;

	}

	}while(Opcion != 5);
	
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba mMain = new Prueba();
		mMain.Correr();
}
}
    

