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
public class NodoB {
        private Materia Dato;
	private NodoB Siguiente;
	private NodoB Anterior;
	private Materia mMateria;

	public NodoB() {
		Materia Dato = new Materia();
		Siguiente = null;
		Anterior = null;
	}
	
	public void setDato(Materia Dato) {
		this.Dato=Dato;
	}

	public void setSiguiente(NodoB Siguiente) {
		this.Siguiente = Siguiente;
	}

	public void setAnterior(NodoB Anterior) {
		this.Anterior = Anterior;
	}

	public Materia getDato() {
		return Dato;
	}
	public NodoB getSiguiente() {
		return Siguiente;
	}

	public NodoB getAnterior(){
		return Anterior;
	}
    
}
