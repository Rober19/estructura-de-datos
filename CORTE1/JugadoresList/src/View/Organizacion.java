/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.JugadorModel;
import Controller.JugadorController;
import View.RegisterView;
import static View.RegisterView.jugaco;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orlando Castilla
 */
public class Organizacion extends javax.swing.JFrame {

    /**
     * Creates new form Organizacion
     */
    public Organizacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        juco.getLista_Jugador();
    }

    public static Vector<JugadorModel> Lista_Orden = new Vector<>();
    public static JugadorController juco = new JugadorController();
    RegisterView re = new RegisterView();
    float num;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPorEdad = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPorEstatura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOrden = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tblPorEdad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Estatura", "Fecha Nacimiento", "Posicion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPorEdad.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPorEdad);
        if (tblPorEdad.getColumnModel().getColumnCount() > 0) {
            tblPorEdad.getColumnModel().getColumn(0).setResizable(false);
            tblPorEdad.getColumnModel().getColumn(1).setResizable(false);
            tblPorEdad.getColumnModel().getColumn(2).setResizable(false);
            tblPorEdad.getColumnModel().getColumn(3).setResizable(false);
        }

        tblPorEstatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Estatura", "Fecha Nacimiento", "Posicion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPorEstatura.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblPorEstatura);
        if (tblPorEstatura.getColumnModel().getColumnCount() > 0) {
            tblPorEstatura.getColumnModel().getColumn(0).setResizable(false);
            tblPorEstatura.getColumnModel().getColumn(1).setResizable(false);
            tblPorEstatura.getColumnModel().getColumn(2).setResizable(false);
            tblPorEstatura.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("ORDEN POR EDAD");

        jLabel2.setText("ORDEN POR ESTATURA");

        btnOrden.setText("Orden");
        btnOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenMouseClicked(evt);
            }
        });
        btnOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(btnOrden)
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnOrden)))
                .addGap(33, 33, 33)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        RegisterView r = new RegisterView();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenActionPerformed
        ordenar();

    }//GEN-LAST:event_btnOrdenActionPerformed

    private void btnOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenMouseClicked

//        for (int i = 0; i < juco.Read(i); i++) {
//            if (chbxEdad.isSelected() == false) {
//                tblPorEstatura.getSize();
//                tblPorEdad.getSize();
//            } else if (chbxEdad.isSelected() == true) {
//                tblPorEdad.getSize();
//                tblPorEstatura.getSize();
//                
//            }
//        }
//        
//        for (int j = 0; j < juco.Read(i); j++) {
//            if (chbxEstatu.isSelected() == false) {
//                tblPorEstatura.getSize();
//                tblPorEdad.getSize();
//            } else if (chbxEstatu.isSelected() == true) {
//                tblPorEdad.getSize();
//                tblPorEstatura.getSize();
//                
//            }
//        }
    }//GEN-LAST:event_btnOrdenMouseClicked

    public void ordenar() {

        Vector vEstatura = new Vector();
        Vector vEdad = new Vector();
        

        for (int i = 0; i < juco.getLista_Jugador().size(); i++) {
           vEstatura.add(juco.getLista_Jugador().get(i));
        }
        System.out.println("\n");
        for (int i = 0; i < juco.getLista_Jugador().size(); i++) {
           vEdad.add(juco.getLista_Jugador().get(i));
        }
        
        ordenEstatura(vEstatura);
        ordenEdad(vEdad);
        
        juco.listar_1((DefaultTableModel) tblPorEstatura.getModel(), vEstatura);
        juco.listar_1((DefaultTableModel) tblPorEdad.getModel(), vEdad);
//        jugs.add(new JugadorModel("Pedro", 65, "Volante", 1.70));
//        jugs.add(new JugadorModel("Hector", 67, "Volante", 1.77));
//        jugs.add(new JugadorModel("Roberto", 76, "Volante", 1.69));

    }

    public void ordenEstatura(Vector Lista_Orden) {
        JugadorModel temp = new JugadorModel();
        for (int i = 0; i < Lista_Orden.size(); i++) {
            for (int j = 0; j < Lista_Orden.size(); j++) {
                JugadorModel ref_i = (JugadorModel) Lista_Orden.get(i);
                JugadorModel ref_j = (JugadorModel) Lista_Orden.get(j);

                if (ref_i.getEstatura() > ref_j.getEstatura()) {
                    temp = (ref_i);
                    Lista_Orden.set(i, ref_j);
                    Lista_Orden.set(j, temp);
                }

            }
        }
    }

    public void ordenEdad(Vector Lista_Orden) {
        JugadorModel temp = new JugadorModel();
        for (int i = 0; i < Lista_Orden.size(); i++) {
            for (int j = 0; j < Lista_Orden.size(); j++) {
                JugadorModel ref_i = (JugadorModel) Lista_Orden.get(i);
                JugadorModel ref_j = (JugadorModel) Lista_Orden.get(j);

                if (ref_i.getFecha_Nacimiento() > ref_j.getFecha_Nacimiento()) {
                    temp = (ref_i);
                    Lista_Orden.set(i, ref_j);
                    Lista_Orden.set(j, temp);
                }

            }
        }
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
            java.util.logging.Logger.getLogger(Organizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Organizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Organizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Organizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Organizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrden;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable tblPorEdad;
    private static javax.swing.JTable tblPorEstatura;
    // End of variables declaration//GEN-END:variables
}
