
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniela
 */
public class FrmPong extends javax.swing.JFrame {

    int x2, y2;
    JButton Raqueta;
    JButton Raqueta0;

    /**
     * Creates new form FrmPong
     */
    public FrmPong() {
        initComponents();
        Raqueta1.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Raqueta1 = new javax.swing.JButton();
        Raqueta2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        Raqueta1.setFocusPainted(false);
        Raqueta1.setFocusable(false);
        Raqueta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Raqueta1ActionPerformed(evt);
            }
        });
        Raqueta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Raqueta1KeyPressed(evt);
            }
        });

        Raqueta2.setFocusPainted(false);
        Raqueta2.setFocusable(false);
        Raqueta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Raqueta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Raqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(Raqueta2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Raqueta2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
            .addComponent(Raqueta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Raqueta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Raqueta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Raqueta1ActionPerformed

    private void Raqueta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Raqueta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Raqueta2ActionPerformed

    private void Raqueta1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Raqueta1KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_Raqueta1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int x, y;
        // int x2, y2;
        x = Raqueta1.getX();
        y = Raqueta1.getY();
        x2 = Raqueta2.getX();
        y2 = Raqueta2.getY();

        if (evt.getKeyCode() == VK_DOWN) {
            if (y2 <= 150) {
                y2 = y2 + 10;
                Raqueta2.setLocation(x2, y2);

            }
        } else if (evt.getKeyCode() == VK_UP) {
            if (y2 > 0) {
                y2 = y2 - 10;
                Raqueta2.setLocation(x2, y2);

            }
        } else if (evt.getKeyCode() == VK_SPACE) {
            Pelota mPelota = new Pelota(x + 160, y + 30, this, Raqueta1, Raqueta2);
            mPelota.start();
        }


    }//GEN-LAST:event_formKeyPressed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
//        LblX.setText("X: " + evt.getX());
// 
//        LblY.setText("Y: " + evt.getY());


    }//GEN-LAST:event_formMouseMoved

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Raqueta1;
    private javax.swing.JButton Raqueta2;
    // End of variables declaration//GEN-END:variables
}