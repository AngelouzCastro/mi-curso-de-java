/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_pong;

import java.awt.event.*;

/**
 *
 * @author darka
 */
public class EventoTeclado extends KeyAdapter {

    static boolean w, s, arriba, abajo;

    @Override
    public void keyPressed(KeyEvent e) {
        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = true;
        }
        if (id == KeyEvent.VK_S) {
            s = true;
        }
        if (id == KeyEvent.VK_UP) {
            arriba = true;
        }
        if (id == KeyEvent.VK_DOWN) {
            abajo = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int id = e.getKeyCode();
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_UP) {
            arriba = false;
        }
        if (id == KeyEvent.VK_DOWN) {
            abajo = false;
        }
    }

}
