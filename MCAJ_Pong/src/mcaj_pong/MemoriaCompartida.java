/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_pong;

/**
 *
 * @author darka
 */
public class MemoriaCompartida extends Thread {

    private final Tablero mTablero;

    public MemoriaCompartida(Tablero mTablero) {
        this.mTablero = mTablero;
    }
    @Override
    public void run() {
        while (Pelota.finJuego == false) {
            mTablero.repaint();
            try {
                //Paint Velocity 
                Thread.sleep(6);
            } catch (Exception ex) {
                System.out.println("error in graphics engine: " + ex.getMessage());
            }
        }
    }
}
