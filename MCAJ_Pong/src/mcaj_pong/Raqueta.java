/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_pong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author darka
 */
public class Raqueta {

    private int x, y;
    static final int ancho = 10, largo = 40;

    public Raqueta(int x, int y) {
        this.x = x;
        this.y = y;
    }
     public Rectangle2D getRaqueta() {
        return new Rectangle2D.Double(x, y, ancho, largo);
    }
     
     public void moverR1(Rectangle limites){
         if(EventoTeclado.w && y > limites.getMinY()){
             y--;
         }
         if(EventoTeclado.s && y < limites.getMaxY() - largo){
             y++;
         }
     }
     public void moverR2(Rectangle limites){
         if(EventoTeclado.arriba && y > limites.getMinY()){
             y--;
         }
         if(EventoTeclado.abajo && y < limites.getMaxY()-largo){
             y++;
         }
     }

}
