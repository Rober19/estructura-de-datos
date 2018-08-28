/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.medicamentoController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.medicamento;

/**
 *
 * @author E304
 */
public class view1 extends javax.swing.JFrame {

    /**
     * Creates new form view1
     */
    public view1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        quemados();
        listar();
    }

    void quemados() {
        list_med = mc.add(new medicamento("captopril", "pastilla", "La santè", false), list_med);
        list_med = mc.add(new medicamento("Dolex", "pastilla", "La santè", false), list_med);
        list_med = mc.add(new medicamento("Ibupofreno", "pastilla", "MK laboratorios", false), list_med);
        list_med = mc.add(new medicamento("Advil", "pastilla", "MK laboratorios", false), list_med);
        list_med = mc.add(new medicamento("Acetaminofem", "pastilla", "La santè", false), list_med);
        list_med = mc.add(new medicamento("Dolex Jarabe", "jarabe", "MK laboratorios", false), list_med);
        list_med = mc.add(new medicamento("Descongel", "jarabe", "Genomalab", false), list_med);
        list_med = mc.add(new medicamento("Jarabe de Totumo", "jarabe", "Genomalab", false), list_med);

    }

    medicamentoController mc = new medicamentoController();

    medicamento[] list_med = new medicamento[0];
    medicamento[] list_pas = new medicamento[0];
    medicamento[] list_jar = new medicamento[0];

    void listar() {
        ListMeds((DefaultTableModel) tbl_medicamentos.getModel(), list_med);
        ListTipo((DefaultTableModel) tbl_pastillas.getModel(), list_pas);
        ListTipo((DefaultTableModel) tbl_jarabes.getModel(), list_jar);
    }

    public void ListMeds(DefaultTableModel Table, medicamento[] Array) {

        while (Table.getRowCount() != 0) {
            Table.removeRow(0);
        }

        if (Array.length != 0) {
            //se deben enviar todos los parametros del objeto
            for (int i = 0; i < Array.length; i++) {
                Table.addRow(new Object[]{
                    Array[i].getNombre(),
                    //Array[i].getLaboratorio(),
                    Array[i].getTipo()
                });
            }
        }
    }

    public void ListTipo(DefaultTableModel Table, medicamento[] Array) {

        while (Table.getRowCount() != 0) {
            Table.removeRow(0);
        }
        if (Array.length != 0) {
            for (int i = 0; i < Array.length; i++) {
                Table.addRow(new Object[]{
                    Array[i].getNombre(),
                    Array[i].getEstado(),
                    Array[i].getLaboratorio()
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_jarabes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_medicamentos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_pastillas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        btn_regresar2 = new javax.swing.JButton();
        btn_recoger = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_jarabes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Estado", "Laboratorio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_jarabes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_jarabesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_jarabes);
        if (tbl_jarabes.getColumnModel().getColumnCount() > 0) {
            tbl_jarabes.getColumnModel().getColumn(0).setResizable(false);
            tbl_jarabes.getColumnModel().getColumn(1).setResizable(false);
            tbl_jarabes.getColumnModel().getColumn(2).setResizable(false);
        }

        tbl_medicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_medicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_medicamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_medicamentos);
        if (tbl_medicamentos.getColumnModel().getColumnCount() > 0) {
            tbl_medicamentos.getColumnModel().getColumn(0).setResizable(false);
            tbl_medicamentos.getColumnModel().getColumn(1).setResizable(false);
        }

        tbl_pastillas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Estado", "Laboratorio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pastillas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pastillasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_pastillas);
        if (tbl_pastillas.getColumnModel().getColumnCount() > 0) {
            tbl_pastillas.getColumnModel().getColumn(0).setResizable(false);
            tbl_pastillas.getColumnModel().getColumn(1).setResizable(false);
            tbl_pastillas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Medicamentos");

        jLabel2.setText("Pastillas");

        jLabel3.setText("Jarabe");

        btn_enviar.setText(">");
        btn_enviar.setEnabled(false);
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_regresar.setText("<");
        btn_regresar.setEnabled(false);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_regresar2.setText("<");
        btn_regresar2.setEnabled(false);
        btn_regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresar2ActionPerformed(evt);
            }
        });

        btn_recoger.setText("recoger");
        btn_recoger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recogerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_recoger)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_enviar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar2)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btn_enviar)
                    .addComponent(btn_regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btn_regresar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_recoger)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_medicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_medicamentosMouseClicked
        btn_enviar.setEnabled(true);
    }//GEN-LAST:event_tbl_medicamentosMouseClicked

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        System.out.println(tbl_medicamentos.getSelectedRow());
        int index = tbl_medicamentos.getSelectedRow();

        if (mc.get(index, list_med).getTipo().equals("pastilla")) {
            list_pas = mc.add(mc.get(index, list_med), list_pas);
            ListTipo((DefaultTableModel) tbl_pastillas.getModel(), list_pas);
            list_med = mc.remove(index, list_med);
            listar();
        } else if (mc.get(index, list_med).getTipo().equals("jarabe")) {
            list_jar = mc.add(mc.get(index, list_med), list_jar);
            ListTipo((DefaultTableModel) tbl_jarabes.getModel(), list_jar);
            list_med = mc.remove(index, list_med);
            listar();
        }
        btn_enviar.setEnabled(false);

    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        int index = tbl_pastillas.getSelectedRow();
        list_med = mc.add(mc.get(index, list_pas), list_med);
        list_pas = mc.remove(index, list_pas);
        listar();
        btn_regresar.setEnabled(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresar2ActionPerformed
        int index = tbl_jarabes.getSelectedRow();
        list_med = mc.add(mc.get(index, list_jar), list_med);
        list_jar = mc.remove(index, list_jar);
        listar();
        btn_regresar2.setEnabled(false);
    }//GEN-LAST:event_btn_regresar2ActionPerformed

    private void btn_recogerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recogerActionPerformed
        list_med = mc.clear(list_med);
        list_jar = mc.clear(list_jar);
        list_pas = mc.clear(list_pas);
        quemados();
        listar();
        btn_enviar.setEnabled(false);
        btn_regresar.setEnabled(false);
        btn_regresar2.setEnabled(false);
    }//GEN-LAST:event_btn_recogerActionPerformed

    private void tbl_pastillasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pastillasMouseClicked
        btn_regresar.setEnabled(true);
    }//GEN-LAST:event_tbl_pastillasMouseClicked

    private void tbl_jarabesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_jarabesMouseClicked
        btn_regresar2.setEnabled(true);
    }//GEN-LAST:event_tbl_jarabesMouseClicked

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
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_recoger;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_regresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_jarabes;
    private javax.swing.JTable tbl_medicamentos;
    private javax.swing.JTable tbl_pastillas;
    // End of variables declaration//GEN-END:variables
}
