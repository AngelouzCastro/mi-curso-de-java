/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCAJ_ProductorConsumidorSinSincronizar;

/**
 *
 * @author darka
 */
public class MemoriaCompartida {
    private int Dato;
    
    public MemoriaCompartida(){
        Dato = 0 ;
    }
    
    public int getDato(){
        return Dato;
    }
    
    public void setDato(int Dato){
        this.Dato = Dato;
    }
}
