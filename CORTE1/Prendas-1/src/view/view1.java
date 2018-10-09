package view;

import controller.prendaController;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.prenda;

public class view1 extends javax.swing.JFrame {

    private static DefaultTableModel tblModel_Sucia, tblModel_Jabonada, tblModel_Enjuagada, tblModel_Limpia;
    private static prendaController predasco = new prendaController();

    public view1() {
        initComponents();
        this.setLocationRelativeTo(null);
        tblModel_Sucia = (DefaultTableModel) (tbl_Sucia.getModel());
        tblModel_Jabonada = (DefaultTableModel) (tbl_Jabonadas.getModel());
        tblModel_Enjuagada = (DefaultTableModel) (tbl_Enjuagadas.getModel());
        tblModel_Limpia = (DefaultTableModel) (tbl_Limpias.getModel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Sucia = new javax.swing.JTable();
        btn_Add = new javax.swing.JButton();
        btn_jabSuc = new javax.swing.JButton();
        btn_EnjSuc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Jabonadas = new javax.swing.JTable();
        btn_perJab = new javax.swing.JButton();
        btn_enjJab = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Enjuagadas = new javax.swing.JTable();
        btn_secEnj = new javax.swing.JButton();
        btn_perEnj = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Limpias = new javax.swing.JTable();
        btn_usarLim = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tbl_Sucia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Sucia.getTableHeader().setReorderingAllowed(false);
        tbl_Sucia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SuciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Sucia);
        if (tbl_Sucia.getColumnModel().getColumnCount() > 0) {
            tbl_Sucia.getColumnModel().getColumn(0).setResizable(false);
            tbl_Sucia.getColumnModel().getColumn(1).setResizable(false);
            tbl_Sucia.getColumnModel().getColumn(2).setResizable(false);
            tbl_Sucia.getColumnModel().getColumn(3).setResizable(false);
            tbl_Sucia.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_Add.setText("+");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_jabSuc.setText("Jab");
        btn_jabSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jabSucActionPerformed(evt);
            }
        });

        btn_EnjSuc.setText("Enj");
        btn_EnjSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnjSucnjSucActionPerformed(evt);
            }
        });

        tbl_Jabonadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Jabonadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_Jabonadas);
        if (tbl_Jabonadas.getColumnModel().getColumnCount() > 0) {
            tbl_Jabonadas.getColumnModel().getColumn(0).setResizable(false);
            tbl_Jabonadas.getColumnModel().getColumn(1).setResizable(false);
            tbl_Jabonadas.getColumnModel().getColumn(2).setResizable(false);
            tbl_Jabonadas.getColumnModel().getColumn(3).setResizable(false);
            tbl_Jabonadas.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_perJab.setText("Per");
        btn_perJab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perJabActionPerformed(evt);
            }
        });

        btn_enjJab.setText("Enj");
        btn_enjJab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enjJabActionPerformed(evt);
            }
        });

        tbl_Enjuagadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Enjuagadas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl_Enjuagadas);
        if (tbl_Enjuagadas.getColumnModel().getColumnCount() > 0) {
            tbl_Enjuagadas.getColumnModel().getColumn(0).setResizable(false);
            tbl_Enjuagadas.getColumnModel().getColumn(1).setResizable(false);
            tbl_Enjuagadas.getColumnModel().getColumn(2).setResizable(false);
            tbl_Enjuagadas.getColumnModel().getColumn(3).setResizable(false);
            tbl_Enjuagadas.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_secEnj.setText("Sec");
        btn_secEnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_secEnjActionPerformed(evt);
            }
        });

        btn_perEnj.setText("Per");
        btn_perEnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perEnjActionPerformed(evt);
            }
        });

        tbl_Limpias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Color", "Estado", "Talla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Limpias.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl_Limpias);
        if (tbl_Limpias.getColumnModel().getColumnCount() > 0) {
            tbl_Limpias.getColumnModel().getColumn(0).setResizable(false);
            tbl_Limpias.getColumnModel().getColumn(1).setResizable(false);
            tbl_Limpias.getColumnModel().getColumn(2).setResizable(false);
            tbl_Limpias.getColumnModel().getColumn(3).setResizable(false);
            tbl_Limpias.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_usarLim.setText("Usar");
        btn_usarLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usarLimActionPerformed(evt);
            }
        });

        jLabel1.setText("Sucias");

        jLabel2.setText("Jabonadas");

        jLabel3.setText("Limpias");

        jLabel4.setText("Enjuagadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_jabSuc)
                            .addComponent(btn_EnjSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_usarLim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_secEnj, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_enjJab, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_perJab, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btn_perEnj, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_perJab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_enjJab))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_perEnj)
                        .addGap(60, 60, 60)
                        .addComponent(btn_secEnj))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_usarLim)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_jabSuc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_EnjSuc)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        new register(this, false);
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_jabSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jabSucActionPerformed
        try {
            predasco.change_Estado("JABONADA", tblModel_Sucia.getValueAt(tbl_Sucia.getSelectedRow(), 0).toString());
            List_All();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una prenda en la tabla correspondiente");
        }
    }//GEN-LAST:event_btn_jabSucActionPerformed

    private void btn_EnjSucnjSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnjSucnjSucActionPerformed
        try {
            predasco.change_Estado("ENJUAGADA", tblModel_Sucia.getValueAt(tbl_Sucia.getSelectedRow(), 0).toString());
            List_All();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una prenda en la tabla correspondiente");
        }
    }//GEN-LAST:event_btn_EnjSucnjSucActionPerformed

    private void btn_perJabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perJabActionPerformed
        try {
            predasco.change_Estado("SUCIA", tblModel_Jabonada.getValueAt(tbl_Jabonadas.getSelectedRow(), 0).toString());
            List_All();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una prenda en la tabla correspondiente");
        }
    }//GEN-LAST:event_btn_perJabActionPerformed

    private void btn_enjJabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enjJabActionPerformed
        try {
            predasco.change_Estado("ENJUAGADA", tblModel_Jabonada.getValueAt(tbl_Jabonadas.getSelectedRow(), 0).toString());
            List_All();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una prenda en la tabla correspondiente");
        }
    }//GEN-LAST:event_btn_enjJabActionPerformed

    private void btn_perEnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perEnjActionPerformed
        try {
            predasco.change_Estado("SUCIA", tblModel_Enjuagada.getValueAt(tbl_Enjuagadas.getSelectedRow(), 0).toString());
            List_All();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una prenda en la tabla correspondiente");
        }
    }//GEN-LAST:event_btn_perEnjActionPerformed

    private void btn_secEnjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_secEnjActionPerformed
        try {
            predasco.change_Estado("LIMPIA", tblModel_Enjuagada.getValueAt(tbl_Enjuagadas.getSelectedRow(), 0).toString());
            List_All();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una prenda en la tabla correspondiente");
        }
    }//GEN-LAST:event_btn_secEnjActionPerformed

    private void btn_usarLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usarLimActionPerformed
        try {
            predasco.change_Estado("SUCIA", tblModel_Limpia.getValueAt(tbl_Limpias.getSelectedRow(), 0).toString());
            List_All();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una prenda en la tabla correspondiente");
        }
    }//GEN-LAST:event_btn_usarLimActionPerformed

    private void tbl_SuciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SuciaMouseClicked

    }//GEN-LAST:event_tbl_SuciaMouseClicked

    public static void List_All() {
        Listar(tblModel_Sucia, "SUCIA");
        Listar(tblModel_Jabonada, "JABONADA");
        Listar(tblModel_Enjuagada, "ENJUAGADA");
        Listar(tblModel_Limpia, "LIMPIA");
    }

    private static void Listar(DefaultTableModel tbl, String Estado) {
        Vector<prenda> dataEstado = predasco.getList_byEstado(Estado);
        tbl.setNumRows(0);
        dataEstado.forEach(row -> {
            tbl.addRow(new Object[]{
                row.getCodigo(),
                row.getTipo(),
                row.getColor(),
                row.getEstado(),
                row.getTalla()
            });
        });

    }

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_EnjSuc;
    private javax.swing.JButton btn_enjJab;
    private javax.swing.JButton btn_jabSuc;
    private javax.swing.JButton btn_perEnj;
    private javax.swing.JButton btn_perJab;
    private javax.swing.JButton btn_secEnj;
    private javax.swing.JButton btn_usarLim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbl_Enjuagadas;
    private javax.swing.JTable tbl_Jabonadas;
    private javax.swing.JTable tbl_Limpias;
    private javax.swing.JTable tbl_Sucia;
    // End of variables declaration//GEN-END:variables
}
