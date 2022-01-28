
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPrincipal extends javax.swing.JFrame {

    private FrmReceptor mFrmReceptor;
    private FrmValidar mFrmValidar;
    private String[] Datos = new String[7];
    private int i;
    private int fila;
    private int cont;
    private DefaultTableModel Modelo;
    private String[] archivos = {"EUSA740126TQ2_Factura_A1228_20151228.xml", "EUSA740126TQ2_Factura_A1238_20151230.xml",
        "EUSA740126TQ2_Factura_A1240_20151230.xml", "EUSA740126TQ2_Factura_A1244_20151231.xml",
        "EUSA740126TQ2_Factura_A1291_20160129.xml", "EUSA740126TQ2_Factura_A1292_20160129.xml",
        "EUSA740126TQ2_Factura_A1298_20160130.xml", "EUSA740126TQ2_Factura_A1299_20160130.xml",
        "EUSA740126TQ2_Factura_A1338_20160227.xml", "EUSA740126TQ2_Factura_A1340_20160227.xml",
        "EUSA740126TQ2_Factura_A1342_20160227.xml", "EUSA740126TQ2_Factura_A1345_20160229.xml",
        "EUSA740126TQ2_Factura_A1346_20160229.xml", "EUSA740126TQ2_Factura_A1359_20160304.xml"};

    public FrmPrincipal() {

        initComponents();
        String[] Titulo = {"RFC", "Nombre", "Fecha", "Folio", "Serie", "Importe", "Total Impuestos Trasladados"};
        Modelo = new DefaultTableModel(null, Titulo);
        BtnReceptor.setVisible(false);
        this.setVisible(false);
        this.setTitle("MCAJ_XML");
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnCargar = new javax.swing.JButton();
        BtnReceptor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LBLPropiedades = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnCargar.setText("Cargar XML");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        BtnReceptor.setText("Consultar Receptor");
        BtnReceptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReceptorActionPerformed(evt);
            }
        });

        jButton1.setText("Comprovador de atrivutos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LBLPropiedades.setText("Angel Josue Martinez Castro");

        jLabel1.setText("NC:17010369");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(697, Short.MAX_VALUE)
                        .addComponent(BtnCargar)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LBLPropiedades)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLPropiedades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        this.setVisible(true);
        FrmPrincipal mFrmPrincipal = new FrmPrincipal();
        BtnReceptor.setVisible(true);
        while (i < 14) {
            String rfc = mFrmPrincipal.dividir("Receptor .*rfc=\"", archivos[i]);
            String nombre = mFrmPrincipal.dividir("Receptor .*nombre=\"", archivos[i]);
            String fecha = mFrmPrincipal.sinhora("fecha=\"", archivos[i]);
            String folio = mFrmPrincipal.dividir("folio=\"", archivos[i]);
            String serie = mFrmPrincipal.dividir("serie=\"", archivos[i]);
            String importe = mFrmPrincipal.dividir("Traslado .*importe=\"", archivos[i]);
            String totalImpuestosTrasladados = mFrmPrincipal.dividir("totalImpuestosTrasladados=\"", archivos[i]);

            Datos[0] = rfc;
            Datos[1] = nombre;
            Datos[2] = fecha;
            Datos[3] = folio;
            Datos[4] = serie;
            Datos[5] = importe;
            Datos[6] = totalImpuestosTrasladados;

            Modelo.addRow(Datos);
            jTable1.setModel(Modelo);
            i++;
        }

    }//GEN-LAST:event_BtnCargarActionPerformed

    private void BtnReceptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReceptorActionPerformed
        try {
            fila = jTable1.getSelectedRow();
            if (fila < 0) {

                JOptionPane.showMessageDialog(this, "ERROR: NO SE HA SELECIONADO NINGUN ARCHIVO");
            } else {
                mFrmReceptor = new FrmReceptor();
                mFrmReceptor.enviarfila(fila);
                mFrmReceptor.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_BtnReceptorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mFrmValidar = new FrmValidar();
        mFrmValidar.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    public String dividir(String txt, String nomArchivo) {

        String resultado = "";
        try {
            FileReader f;
            File JSONFile = new File(nomArchivo);
            f = new FileReader(JSONFile);
            BufferedReader bReader = new BufferedReader(f);
            String sLine = null;
            while ((sLine = bReader.readLine()) != null) {

                Pattern p;
                Matcher m;
                p = Pattern.compile(txt);
                m = p.matcher(sLine);
                if (m.find()) {
                    char[] a = sLine.toCharArray();
                    int cont = m.end();
                    char caracter = a[cont];
                    while (caracter != '"') {
                        cont++;
                        resultado += caracter;
                        caracter = a[cont];
                    }

                }

            }
            f.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(manejador_Json.class.getName()).log(Level.SEVERE, null,ex);
        } catch (IOException ex) {
            //Logger.getLogger(Maneja_JSon.class.getName()).log(Level.SEVERE, null,ex);
        }
        return resultado;
    }

    public String sinhora(String txt, String nomArchivo) {

        String resultado = "";
        try {
            FileReader f;
            File JSONFile = new File(nomArchivo);
            f = new FileReader(JSONFile);
            BufferedReader bReader = new BufferedReader(f);
            String sLine = null;
            while ((sLine = bReader.readLine()) != null) {
                //System.out.println(sLine);

                Pattern p;
                Matcher m;
                p = Pattern.compile(txt);
                m = p.matcher(sLine);
                if (m.find()) {
                    char[] a = sLine.toCharArray();
                    int cont = m.end();
                    char caracter = a[cont];
                    while (caracter != 'T') {
                        cont++;
                        resultado += caracter;
                        caracter = a[cont];
                    }

                }

            }
            f.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(manejador_Json.class.getName()).log(Level.SEVERE, null,ex);
        } catch (IOException ex) {
            //Logger.getLogger(Maneja_JSon.class.getName()).log(Level.SEVERE, null,ex);
        }
        return resultado;
    }

    public int GetFila() {

        return fila;

    }

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnReceptor;
    private javax.swing.JLabel LBLPropiedades;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
