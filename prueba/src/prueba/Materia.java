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
public class Materia {
    private int ClaveM;
    private String NombreM;
    private int Buscado2;
    
    public Materia(){
        ClaveM =0;
        NombreM ="";
        Buscado2=0;
    }
    
        public void setClaveM(int ClaveM)
	{
		this.ClaveM = ClaveM;
	}

	public void setNombreM(String NombreM)
	{
		this.NombreM = NombreM;
	}
        
        public void setBuscado2(int Buscado2)
	{
		this.Buscado2 = Buscado2;
	}
        
        public int getClaveM()
	{
		return ClaveM;
	}

	public String getNombreM()
	{
		return NombreM;
	}
        public int getBuscado2()
	{
		return Buscado2;
	}
}
