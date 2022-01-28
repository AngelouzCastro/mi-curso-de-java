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
public class ListaB {
        private NodoB Inicio;
	private NodoB Fin;
	private NodoB mNodo;
	private NodoB aNodo;
	private NodoB bNodo;

	public ListaB() {
		Inicio = null;
		Fin = null;
	}
	
	public void agregarNodo(Materia Dato) {
		NodoB NodoNuevo;
		NodoNuevo = new NodoB();
		NodoNuevo.setDato(Dato);
		
		if(Inicio == null) {
		Inicio = NodoNuevo;
		
	}else {
		Fin.setSiguiente(NodoNuevo);
		NodoNuevo.setAnterior(Fin);
		
	}
		Fin=NodoNuevo;
	}

	public NodoB getInicio() {
		return Inicio;
	}

	public NodoB getFin() {
		return Fin;
	}

	


	
}

	
		
	
    

