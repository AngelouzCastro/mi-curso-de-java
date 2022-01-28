/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darka
 */
public class Cuenta {

    private int Dato;
    private Retiros mRetiros;

    public Cuenta() {
        Dato = 0;
       
    }

    public void Retiro(int Retiro)
    {
        Dato = Dato - Retiro;
        
    }
   
    public void Suma(int numero)
    {
        Dato = Dato + numero;
    }
    public synchronized int getDato()
    {
        return Dato;
    }
    
    
    public void setDato(int Dato)
    {
        this.Dato = Dato;
    }

}
