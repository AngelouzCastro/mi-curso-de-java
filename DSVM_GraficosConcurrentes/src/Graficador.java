
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vi_ma
 */
public class Graficador extends Thread{
    private int posX;
    private int posY;
    private int Valor;
    private JFrame mJFrame;
    private Graphics g;

    public Graficador(int posX, int posY, int Valor, JFrame mJFrame) {
        this.posX = posX;
        this.posY = posY;
        this.Valor = Valor;
        this.mJFrame = mJFrame;
        this.g = this.mJFrame.getGraphics();
    }
    
    public void run(){
        for(int i = posY;i<posY+Valor;i=i+15){
            g.fillOval(posX, i, 10, 10);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
