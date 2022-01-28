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
public class Consumidor extends Thread{
    private MemoriaCompartida mMemoriaCompartida;
    private int Suma;
    
    public Consumidor(){
        Suma = 0;
    }
    
    public int getSuma(){
        return Suma;
    }
    
     public void setMemoriaCompartida(MemoriaCompartida mMemoriaCompartida) {
        this.mMemoriaCompartida = mMemoriaCompartida;
    }
     
     public void run(){
        int i;
        for(i=1; 1<=10; i++){
            Suma = Suma + mMemoriaCompartida.getDato();
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex){
                System.err.print(ex.getMessage());
            }
        }
    }
    
}
