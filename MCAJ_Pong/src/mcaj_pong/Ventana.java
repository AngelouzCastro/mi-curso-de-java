/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_pong;
 
import javax.swing.*;
/**
 *
 * @author darka
 */
public class Ventana extends JFrame{
    Tablero canvas;
    Pelota p = new Pelota();

    public Ventana() {
        setTitle("Pong DEMO");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        canvas = new Tablero();
        add(canvas);

        addKeyListener(new EventoTeclado());
        new MemoriaCompartida(canvas).start();
    }
    
}
