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
public class Alumno {
    private int Clave;
    private String Nombre;
    private int Buscado;
    
    public Alumno(){
        Clave = 0;
        Nombre = "";
        Buscado =0;
    }
    
        public void setClave(int Clave)
	{
		this.Clave = Clave;
	}

	public void setArticulo(String Nombre)
	{
		this.Nombre = Nombre;
	}
        
         public void setBuscado(int Buscado)
	{
		this.Buscado = Buscado;
	}
        
        public int getClave()
	{
		return Clave;
	}

	public String getNombre()
	{
		return Nombre;
	}
        public int getBuscado()
	{
		return Buscado;
	}
    
}
