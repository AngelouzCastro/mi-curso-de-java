/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCAJ_ProductorConsumidorSinSincronizar;

import java.util.Random;

/**
 *
 * @author darka
 */
public class Consumidor extends Thread {

    private MemoriaCompartida mMemoriaCompartida;
    private int Suma,Productos;

    public Consumidor() {
        Suma = 0;
    }

    public int getSuma() {
        return Suma;
    }

    public void setMemoriaCompartida(MemoriaCompartida mMemoriaCompartida) {
        this.mMemoriaCompartida = mMemoriaCompartida;
    }
    public int nRandom(){
        for(int i = 0;i < 2; i++){
            Random rnd = new Random();
            Productos =  0 + rnd.nextInt(100);
        }
        return Productos;
    }


    public void run() {
        int i;
        for (i = 1; i <= 20; i++) {
            System.out.println("Consumiendo " + nRandom());
            Suma = Suma + mMemoriaCompartida.getDato();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.err.print(ex.getMessage());
            }
        }
    }

}
