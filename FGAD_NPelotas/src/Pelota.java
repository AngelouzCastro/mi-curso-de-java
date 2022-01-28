
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
 * @author daniela
 */
public class Pelota extends Thread {

    int x, y;
    int varY = 1, varX = 1;
    int score1 = 0, score2 = 0;
    Graphics g;
    FrmPong mFrmPong;
    JButton Raqueta;
    JButton Raqueta0;
    JLabel score11;
    JLabel score12;

    public Pelota(int x, int y, FrmPong mFrmPong, JButton Raqueta, JButton Raqueta0) {
        this.x = x;
        this.y = y;
        this.mFrmPong = mFrmPong;
        this.Raqueta = Raqueta;
        this.Raqueta0 = Raqueta0;
        g = this.mFrmPong.getGraphics();
    }

    public void run() {
        x += varX;
        y += varY;
        while (true) {

            x += varX;
            y += varY;

            g.setColor(Color.GREEN);
            g.fillOval(x, y, 20, 20);

            if (x < 0) {
                varX = -varX;
                

            }
            if (x >= 440) {
                varX = -varX;
                x = 200;
                y = 200;
            }
            if (y < 0 + 30) {
                varY = -varY;
            }
            if (y + 30 >= 300) {
                varY = -varY;
            }

            if ((y >= Raqueta0.getY()+20) && (y <= Raqueta0.getY() + 130)) {
                if ((x >= Raqueta0.getX())) {
                    varX = -varX;
                }
            }

            if ((y >= Raqueta.getY()+20) && (y <= Raqueta.getY() + 130)) {
                if ((x <= Raqueta.getX() + 19)) {
                    varX = -varX;
                }
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pelota.class.getName()).log(Level.SEVERE, null, ex);
            }

            g.setColor(mFrmPong.getBackground());
            g.fillOval(x, y, 20, 20);

        }
    }

}
