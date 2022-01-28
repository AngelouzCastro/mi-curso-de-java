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
public class Main {
    private MemoriaCompartida mMemoriaCompartida;
    private Productor mProductor;
    private Consumidor mConsumidor;
    
    public Main(){
        mMemoriaCompartida = new MemoriaCompartida();
        mProductor = new Productor();
        mConsumidor = new Consumidor();
    }
    public void Correr(){
        mProductor.setMemoriaCompartida(mMemoriaCompartida);
        mConsumidor.setMemoriaCompartida(mMemoriaCompartida);
        
        mProductor.start();
        mConsumidor.start();
        
        while(mProductor.isAlive() || mConsumidor.isAlive());
        
        System.out.println(mConsumidor.getSuma());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main mMain = new Main();
        mMain.Correr();
    }
    
}
