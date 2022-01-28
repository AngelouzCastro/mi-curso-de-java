/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_arbolstring;

/**
 *
 * @author darka
 */
public class Nodo {
        private String Dato;
	private Nodo Izquierda;
	private Nodo Derecha;

	public Nodo() {
		Dato = " ";
		Izquierda = null;
		Derecha = null;
	}

	public void setDato(String Dato) {
		this.Dato = Dato;
	}

	public void setIzquierda(Nodo Izquierda) {
		this.Izquierda = Izquierda;
	}

	public void setDerecha(Nodo Derecha) {
		this.Derecha = Derecha;
	}

	public String getDato() {
		return Dato;
	}

	public Nodo getIzquierda() {
		return Izquierda;
	}

	public Nodo getDerecha() {
		return Derecha;
	}
}
