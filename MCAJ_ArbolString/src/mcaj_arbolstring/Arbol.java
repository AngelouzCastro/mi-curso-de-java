/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_arbolstring;
import java.util.TreeSet;
/**
 *
 * @author darka
 */
public class Arbol {
    
	private Nodo Raiz;
	private String Cadena;
	private int Cont;
        TreeSet<String> add = new TreeSet<String>();

	public Arbol() {
		Raiz = null;
	}

	

	public int realizarConteo() {
		Cont = 0;
		contar(Raiz);
		return Cont;
	}

	public void contar(Nodo mNodo) {
		if (mNodo != null) {
			contar(mNodo.getIzquierda());
			contar(mNodo.getDerecha());
			Cont++;
		}
	}

	public Nodo buscar(String Dato) {
		Nodo mNodo = Raiz;

		while((mNodo != null) && (mNodo.getDato() != Dato)) {
			if (Dato != mNodo.getDato()) {
				mNodo = mNodo.getDerecha();
			} else {
				mNodo = mNodo.getIzquierda();
			}
		}

		return mNodo;
	}
}
