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
public class Productor extends Thread{
    private MemoriaCompartida mMemoriaCompartida;
    
    public void setMemoriaCompartida(MemoriaCompartida mMemoriaCompartida){
        this.mMemoriaCompartida = mMemoriaCompartida;
    }
            
    
    public void run(){
        int i;
        for(i=1; 1<=10; i++){
            this.mMemoriaCompartida.setDato(i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex){
                System.out.print(ex.getMessage());
            }
        }
    }
}
