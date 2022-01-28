
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author darka
 */
public class Pelota extends Thread {

    int x, y;
    int varY = 1, varX = 1;
    int score1 = 0, score2 = 0;
    int vel = 8;
    boolean juego = true;
    Graphics g;
    FrmPong mFrmPong;
    JButton Raqueta;
    JButton Raqueta0;
    JLabel score11;
    JLabel score12;
    sonido mSonido = new sonido();
    AudioClip rebote1 = mSonido.getAudio("/sonidos/rebote_pelota1.wav");
    AudioClip rebote2 = mSonido.getAudio("/sonidos/rebote_pelota2.wav");
    AudioClip Inicio = mSonido.getAudio("/sonidos/Musica.wav");

    public Pelota(int x, int y, FrmPong mFrmPong, JButton Raqueta, JButton Raqueta0, JLabel score11, JLabel score12) {
        this.x = x;
        this.y = y;
        this.mFrmPong = mFrmPong;
        this.Raqueta = Raqueta;
        this.Raqueta0 = Raqueta0;
        this.score11 = score11;
        this.score12 = score12;

        g = this.mFrmPong.getGraphics();
    }

    public void run() {
        x += varX;
        y += varY;
        while (juego) {

            x += varX;
            y += varY;

            g.setColor(Color.BLACK);
            g.fillOval(x, y, 15, 15);

            if (x < 0) {
                varX = -varX;
                score2++;
                score12.setText("Jugador 2: " + score2);
                x = 200;
                y = 200;
                Inicio.play();

            }
            if (x >= 440) {
                varX = -varX;
                score1++;
                score11.setText("Jugador 1: " + score1);
                x = 200;
                y = 200;
                Inicio.play();

            }
            if (y < 0 + 30) {
                varY = -varY;
            }
            if (y + 30 >= 300) {
                varY = -varY;
            }

            if ((y >= Raqueta0.getY() + 20) && (y <= Raqueta0.getY() + 130)) {
                if ((x == Raqueta0.getX())) {
                    varX = -varX;
                    rebote1.play();
                }

            }

            if ((y >= Raqueta.getY() + 20) && (y <= Raqueta.getY() + 130)) {
                if ((x == Raqueta.getX() + 19)) {
                    varX = -varX;
                    rebote2.play();
                }
            }

            try {
                Thread.sleep(vel);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pelota.class.getName()).log(Level.SEVERE, null, ex);
            }

            g.setColor(mFrmPong.getBackground());
            g.fillOval(x, y, 15, 15);

            if (score1 == 1 || score2 == 1) {
                vel = 7;
            } else if (score1 == 2 || score2 == 2) {
                vel = 6;
            } else if (score1 == 3 || score2 == 3) {
                vel = 5;
            } else if (score1 == 4 || score2 == 7) {
                vel = 4;
            } else if (score1 >= 5 && score1 < 10 || score2 >= 5 && score1 < 10) {
                vel = 3;
            } else if (score1 == 10 || score2 == 10) {

                if (score1 > score2) {
                    JOptionPane.showMessageDialog(null, "gano jugador 1");
                    break;

                }
                if (score2 > score1) {
                    JOptionPane.showMessageDialog(null, "gano jugador 2");
                    break;
                }

            }

        }

    }

}
