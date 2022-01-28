/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_pong;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
/**
 *
 * @author darka
 */
public class Tablero extends JPanel{
 Raqueta mRaqueta1 = new Raqueta(10, 200);
    Raqueta mRaqueta2 = new Raqueta(794 - 10 - Raqueta.ancho, 200);
    Pelota mPelota = new Pelota();
    

    public Tablero() {
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        Dibujar(g2);

    }

    private void Dibujar(Graphics2D g) {
        Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());

        g.draw(linea);

        g.fill(mRaqueta1.getRaqueta());
        ActualizarU();

        g.fill(mRaqueta2.getRaqueta());
        ActualizarU();

        g.fill(mPelota.getShape());
        ActualizarU();
    }

//actualiza el estado (posicion) de las raquetas y pelota
    private void ActualizarU() {

        mPelota.moverPelota(getBounds(), colision(mRaqueta1.getRaqueta()), colision(mRaqueta2.getRaqueta()));

        mRaqueta1.moverR1(getBounds());
        mRaqueta2.moverR2(getBounds());
    }

    //detecta si existe una colision entre la raqueta y la pelota
    private boolean colision(Rectangle2D r) {
        return mPelota.getShape().intersects(r);
    }

    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(mPelota.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(mPelota.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (mPelota.getScore1() == 10) {
            g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
        if (mPelota.getScore2() == 10) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
    }
    
}
