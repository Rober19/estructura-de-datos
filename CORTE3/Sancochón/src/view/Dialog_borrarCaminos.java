package view;

import model.Tree;
import model.Draw;
import java.awt.Frame;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Dialog_borrarCaminos extends javax.swing.JFrame {

    public String prop(String prop1) {
        Properties propt = new Properties();
        InputStream fs;
        try {
            fs = VentanaPrincipal.class.getClassLoader().getResourceAsStream("properties/messages.properties");
            propt.load(fs);
        } catch (Exception e) {
        }
        return propt.getProperty(prop1);

    }

    public void R_repaint() {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                if (tree_1.getmAdyacencia(j, k) == 1) {
                    Draw.pintarLinea(VentanaPrincipal.PanelGeneral.getGraphics(), tree_1.getCordeX(j), tree_1.getCordeY(j), tree_1.getCordeX(k), tree_1.getCordeY(k), tree_1.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < i; j++) {
            Draw.pintarCirculo(VentanaPrincipal.PanelGeneral.getGraphics(), tree_1.getCordeX(j), tree_1.getCordeY(j), String.valueOf(tree_1.getNombre(j)));

        }
    }
    Draw draw_all;
    Tree tree_1;
    Frame frame;
    int i;

    public Dialog_borrarCaminos(Draw pinta, Tree arbole, int ii, Frame fram) {
        initComponents();
        i = ii;
        this.draw_all = pinta;
        this.tree_1 = arbole;
        frame = fram;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle(":Eliminr:");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Arista"));
        jPanel1.setLayout(null);

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                n1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n1KeyReleased(evt);
            }
        });
        jPanel1.add(n1);
        n1.setBounds(100, 30, 30, 20);

        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        n2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n2KeyReleased(evt);
            }
        });
        jPanel1.add(n2);
        n2.setBounds(100, 60, 30, 20);

        jLabel1.setText("Digite el Nodo 1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 110, 14);

        jLabel2.setText("Digite el nodo 2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 100, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 150, 90);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 110, 90, 23);

        setBounds(60, 130, 182, 179);
    }// </editor-fold>//GEN-END:initComponents

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed

    private void n1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1KeyPressed

    private void n1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyReleased
        String tem = new String(n1.getText());
        StringBuffer tem2 = new StringBuffer();
        for (int j = 0; j < tem.length(); j++) {
            if (Character.isDigit(tem.charAt(j))) {
                tem2.append(tem.charAt(j));
            }
        }
        n1.setText("" + tem2);
    }//GEN-LAST:event_n1KeyReleased

    private void n2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n2KeyReleased
        String tem = new String(n2.getText());
        StringBuffer tem2 = new StringBuffer();
        for (int j = 0; j < tem.length(); j++) {
            if (Character.isDigit(tem.charAt(j))) {
                tem2.append(tem.charAt(j));
            }
        }
        n2.setText("" + tem2);        // TODO add your handling code here:
    }//GEN-LAST:event_n2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x;
        int y;
        int ta;
        if (n1.getText().length() < 1 || n2.getText().length() < 1) {
            JOptionPane.showMessageDialog(null, prop("errReqData"));
        } else {
            x = Integer.parseInt(n1.getText());
            y = Integer.parseInt(n2.getText());

            if (x == y) {
                JOptionPane.showMessageDialog(null, prop("errReqDifNode") + y);
            } else if (x < 0 || x >= i || y < 0 || y >= i) {
                JOptionPane.showMessageDialog(null, prop("errInvalidNode"));
            } else {
                tree_1.setmAdyacencia(x, y, 0);
                tree_1.setmAdyacencia(y, x, 0);
                tree_1.setmCoeficiente(x, y, 0);
                tree_1.setmCoeficiente(y, x, 0);
                n1.setText(null);
                n2.setText(null);
                VentanaPrincipal.PanelGeneral.paint(VentanaPrincipal.PanelGeneral.getGraphics());

                R_repaint();

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frame.setEnabled(true);  // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Dialog_borrarCaminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_borrarCaminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_borrarCaminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_borrarCaminos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    // End of variables declaration//GEN-END:variables
}
