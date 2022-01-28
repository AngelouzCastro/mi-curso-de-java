/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adalu;

/**
 *
 * @author darka
 */
public class Nodo {
    private Articulos Dato;
    private Nodo Siguiente;
    private Nodo Anterior;
    private Articulos mArticulos;
        
    public Nodo() {
		Articulos Dato = new Articulos();
		Siguiente = null;
		Anterior = null;
	}
	
	public void setDato(Articulos Dato) {
		this.Dato = Dato;
	}

	public void setSiguiente(Nodo Siguiente) {
		this.Siguiente = Siguiente;
	}

	public void setAnterior(Nodo Anterior) {
		this.Anterior = Anterior;
	}

	public Articulos getDato() {
		return Dato;
	}
	public Nodo getSiguiente() {
		return Siguiente;
	}

	public Nodo getAnterior(){
		return Anterior;
	}
    
}
