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
public class Lista {
    
        private Nodo Inicio;
	private Nodo Fin;
	private Nodo mNodo;
	private Nodo aNodo;
	private Nodo bNodo;
        
        public Lista() {
		Inicio = null;
		Fin = null;
	}
        
        public void agregarNodo(Articulos Dato) {
		Nodo NodoNuevo;
		NodoNuevo = new Nodo();
		NodoNuevo.setDato(Dato);
		
		if(Inicio == null) {
		Inicio = NodoNuevo;
		
	}else {
		Fin.setSiguiente(NodoNuevo);
		NodoNuevo.setAnterior(Fin);
		
	}
		Fin=NodoNuevo;
	}
        
        public Nodo buscarNodo(int Nombre)
	{
		Nodo buscado;
		Articulos mArticulos;
		buscado = Inicio;
		while((buscado!= null) && (buscado.getDato().getCantidad() != Nombre)){
			buscado = buscado.getSiguiente();
		
	}
	return buscado;

	}
        
        public void eliminar(int Nombre)
	{
		Nodo sNodo;
		Articulos mArticulos;
		bNodo = buscarNodo(Nombre);
		if(bNodo != null){
		if(bNodo == Inicio)
		{
			Inicio = Inicio.getSiguiente();
			Inicio.setAnterior(null);
		}else if(bNodo == Fin)
		{
			aNodo = bNodo.getAnterior();
			aNodo.setSiguiente(null);
			Fin.setAnterior(null);
			Fin = aNodo;
		}else{
			aNodo = bNodo.getAnterior();
			sNodo = bNodo.getSiguiente();
			aNodo.setSiguiente(sNodo);
			sNodo.setAnterior(aNodo);
		}

		}
        }
        
        public Nodo ModificarNodo(int a, Articulos n)
	{
		Articulos mMandado;
		mNodo = buscarNodo(a);
		if(mNodo != null)
		{
			mNodo.setDato(n);
		}
		return mNodo;
	}
        
        public Nodo getInicio() {
		return Inicio;
	}

	public Nodo getFin() {
		return Fin;
	}
    
}
