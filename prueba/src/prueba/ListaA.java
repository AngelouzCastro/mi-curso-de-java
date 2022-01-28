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
public class ListaA {
        private NodoA Inicio;
	private NodoA Fin;
	private NodoA mNodo;
	private NodoA aNodo;
	private NodoA bNodo;

	public ListaA() {
		Inicio = null;
		Fin = null;
	}
	
	public void agregarNodo(Alumno Dato) {
		NodoA NodoNuevo;
		NodoNuevo = new NodoA();
		NodoNuevo.setDato(Dato);
		
		if(Inicio == null) {
		Inicio = NodoNuevo;
		
	}else {
		Fin.setSiguiente(NodoNuevo);
		NodoNuevo.setAnterior(Fin);
		
	}
		Fin=NodoNuevo;
	}

	public NodoA getInicio() {
		return Inicio;
	}

	public NodoA getFin() {
		return Fin;
	}

	


	public void eliminar(int Numero)
	{
		NodoA sNodo;
		Alumno mMandado;
		bNodo = buscarNodo(Numero);
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

	public NodoA ModificarNodo(int a, Alumno n)
	{
		Alumno mMandado;
		mNodo = buscarNodo(a);
		if(mNodo != null)
		{
			mNodo.setDato(n);
		}
		return mNodo;
	}
		
	public NodoA buscarNodo(int Numero)
	{
		NodoA buscado;
		Alumno mMandado;
		buscado = Inicio;
		while((buscado!= null) && (buscado.getDato().getClave() != Numero)){
			buscado = buscado.getSiguiente();
		
	}
	return buscado;
        }

    
}
