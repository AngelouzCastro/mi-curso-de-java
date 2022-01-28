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
public class NodoA {
        private Alumno Dato;
	private NodoA Siguiente;
	private NodoA Anterior;
	private Alumno mAlumno;

	public NodoA() {
		Alumno Dato = new Alumno();
		Siguiente = null;
		Anterior = null;
	}
	
	public void setDato(Alumno Dato) {
		this.Dato=Dato;
	}

	public void setSiguiente(NodoA Siguiente) {
		this.Siguiente = Siguiente;
	}

	public void setAnterior(NodoA Anterior) {
		this.Anterior = Anterior;
	}

	public Alumno getDato() {
		return Dato;
	}
	public NodoA getSiguiente() {
		return Siguiente;
	}

	public NodoA getAnterior(){
		return Anterior;
	}
    
}
