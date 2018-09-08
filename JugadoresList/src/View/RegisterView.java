package View;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.JugadorModel;
import Controller.JugadorController;
import java.awt.Image;
import java.util.Vector;
import View.Organizacion;

/**
 *
 * @author Orlando Castilla
 */
public class RegisterView extends javax.swing.JFrame {

    public RegisterView() {
        initComponents();
        setLocationRelativeTo(null);
        if (jugaco.getLista_Jugador().size() == 0) {
            jugaco.create(new JugadorModel("Juancho", 1, "volante", 65));
            jugaco.create(new JugadorModel("Juancho", 45, "volante", 6));
            jugaco.create(new JugadorModel("Juancho", 3, "volante", 80));
            jugaco.create(new JugadorModel("Juancho", 67, "volante", 45));
            jugaco.create(new JugadorModel("Juancho", 8, "volante", 63));
            jugaco.create(new JugadorModel("Juancho", 9, "volante", 25));
            jugaco.create(new JugadorModel("Juancho", 23, "volante", 15));
            jugaco.create(new JugadorModel("Juancho", 23, "volante", 75));
            jugaco.create(new JugadorModel("Juancho", 98, "volante", 45));

        }
        jugaco.getLista_Jugador();
        listarTabla();
    }

    public Image getIconImagen() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Icons/instagram.png"));
        return retValue;
    }

//    Organizacion org = new Organizacion();
    static JugadorController jugaco = new JugadorController();
//    public static int lo=1, Nombre,Fecha_Nacimiento, posicion, Estatura;
    int num;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShow_Player = new javax.swing.JTable();
        BtnAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtFecha = new javax.swing.JTextField();
        txtPosicion = new javax.swing.JTextField();
        txtEsta = new javax.swing.JTextField();
        BtnAgregarJugador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tblShow_Player.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblShow_Player.setEnabled(false);
        tblShow_Player.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblShow_Player);

        BtnAdd.setText("AGREGAR");
        BtnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAddMouseEntered(evt);
            }
        });
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtPosicion.setEnabled(false);

        txtEsta.setEnabled(false);
        txtEsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstaActionPerformed(evt);
            }
        });

        BtnAgregarJugador.setText("Add New Player");
        BtnAgregarJugador.setEnabled(false);
        BtnAgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarJugadorActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Fecha de Nacimiento:");

        jLabel3.setText("Posicion:");

        jLabel4.setText("Estatura:");

        txtNombre.setEnabled(false);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre)
                        .addComponent(txtFecha)
                        .addComponent(txtPosicion)
                        .addComponent(txtEsta, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(BtnAgregarJugador)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnAgregarJugador)
                .addContainerGap())
        );

        jButton1.setText("ORDENAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout (1).png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/down-arrow.png"))); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed

    }//GEN-LAST:event_BtnAddActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        int boton = JOptionPane.YES_NO_OPTION;
        int result = 0;
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        int boton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del Menu?", "Exit", boton);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        this.setState(RegisterView.ICONIFIED);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void BtnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseClicked
        int HabilitarBtn = JOptionPane.YES_NO_OPTION;
        HabilitarBtn = JOptionPane.showConfirmDialog(null, "¿Desea Agregar Jugador?", "QUE DESEA HACER?", 1);

        try {
            if (HabilitarBtn == 1) {
                BtnAdd.setEnabled(false);
                BtnAgregarJugador.setEnabled(false);
                txtNombre.setEnabled(false);
                txtFecha.setEnabled(false);
                txtPosicion.setEnabled(false);
                txtEsta.setEnabled(false);
            }
            if (HabilitarBtn == 0) {
                BtnAdd.setEnabled(true);
                BtnAgregarJugador.setEnabled(true);
                txtNombre.setEnabled(true);
                txtFecha.setEnabled(true);
                txtPosicion.setEnabled(true);
                txtEsta.setEnabled(true);
            }
        } catch (Exception e) {
            BtnAdd.setEnabled(true);
            BtnAgregarJugador.setEnabled(false);
            txtNombre.setEnabled(false);
            txtFecha.setEnabled(false);
            txtPosicion.setEnabled(false);
            txtEsta.setEnabled(false);

        }


    }//GEN-LAST:event_BtnAddMouseClicked

    private void BtnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAddMouseEntered

    }//GEN-LAST:event_BtnAddMouseEntered

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtEstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstaActionPerformed

    private void BtnAgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarJugadorActionPerformed
        try {
            jugaco.create(new JugadorModel(txtNombre.getText(), Integer.parseInt(txtFecha.getText()), txtPosicion.getText(), Double.parseDouble(txtEsta.getText())));
            listarTabla();
            borrarTxtField();
//            Object l[]={Nombre,Fecha_Nacimiento, posicion, Estatura};
//            Nombre++;
//            org.tbl.addRow(l);
//            lo=1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Necesita Ingrsar Datos", "Datos No Compatibles", 1);
        }


    }//GEN-LAST:event_BtnAgregarJugadorActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (!Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }

    }//GEN-LAST:event_txtNombreKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Organizacion o = new Organizacion();
//        int fila = tblShow_Player.getSelectedRow();
//        Organizacion.Nombre.setText(tblShow_Player.getValueAt(fila, 0));
//        
//        M.show();

        o.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_jButton1ActionPerformed

    public void borrarTxtField() {
        String t = "";
        txtNombre.setText(t);
        txtFecha.setText(t);
        txtPosicion.setText(t);
        txtEsta.setText(t);

    }

    public void listarTabla() {
        jugaco.admintabla(tblShow_Player, jugaco.getLista_Jugador());
        jugaco.admintabla1(tblShow_Player, jugaco.getLista_Jugador());

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnAgregarJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblShow_Player;
    private javax.swing.JTextField txtEsta;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
