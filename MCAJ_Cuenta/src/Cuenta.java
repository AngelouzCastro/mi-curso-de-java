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
    Depositar mDeposito = new Depositar();
    private int Dato = mDeposito.nRandom();
    
    public int getSaldoActual(){
        return Dato;
    }
    
    public void Retiro(int Saldo){
        Dato -= Saldo;
        
    }
     public void Suma(int numero)
    {
        Dato = Dato + numero;
    }
     public void setDato(int Dato)
    {
        this.Dato = Dato;
    }
    
}
