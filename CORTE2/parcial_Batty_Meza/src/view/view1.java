
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.mercanciaController;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Date;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.mercancia;

/**
 *
 * @author E304
 */
public class view1 extends javax.swing.JFrame {

    /**
     * Creates new form view1
     */
    mercanciaController mcon = new mercanciaController();

    public view1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        cargar_datos();
        listar();

    }

    public void cargar_datos() {
        File fichero = new File("PersistenciaPila.dat");

        if (fichero.exists()) {
            try {
                FileInputStream archivo = new FileInputStream("PersistenciaPila.dat");
                ObjectInputStream obj_archivo = new ObjectInputStream(archivo);
                mcon.setMerca_list((Stack<mercancia>) obj_archivo.readObject());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo");
                quemados();
            }
        }

    }

    //en caso de error
    public void quemados() {

        mcon.getMerca_list().add(new mercancia(
                "Ford Mustang",
                920,
                1,
                2.5,
                "Rojo",
                "",
                "",
                ""
        ));
        mcon.getMerca_list().add(new mercancia(
                "Lamborigini Aventador",
                900,
                1.05,
                2.5,
                "Verde",
                "",
                "",
                ""
        ));
        mcon.getMerca_list().add(new mercancia(
                "Chevrolet Camaro",
                1100,
                1.1,
                2.5,
                "Rojo",
                "",
                "",
                ""
        ));
        mcon.getMerca_list().add(new mercancia(
                "Koenigsegg Agera",
                950,
                0.9,
                2.5,
                "Azul",
                "",
                "",
                ""
        ));
        mcon.getMerca_list().add(new mercancia(
                "Aston Martin Vulcan",
                850,
                0.7,
                2.5,
                "Silver",
                "",
                "",
                ""
        ));
    }

    public void listar() {
        mcon.listar((DefaultTableModel) tbl_1.getModel(), mcon.convertAlmacenados());
        mcon.listar((DefaultTableModel) tbl_2.getModel(), mcon.convertImportados());
    }

    public void validPanel() {
        if (mcon.getInspec_list().size() > 0) {
            lb_codigo_1.setText(mcon.getInspec_list().element().getCodigo());
            lb_nombre_1.setText(mcon.getInspec_list().element().getNombre());
            lb_fechaSalidConta_1.setText(mcon.getInspec_list().element().getFechaSalidaContainer() + "");
            lb_peso_1.setText(mcon.getInspec_list().element().getPeso() + "");
        } else {
            lb_codigo_1.setText("codigo");
            lb_nombre_1.setText("nombre");
            lb_fechaSalidConta_1.setText("FechaSalidaContainer");
            lb_peso_1.setText("peso");
        }

        if (mcon.getRevis_list().size() > 0) {
            lb_codigo_2.setText(mcon.getRevis_list().element().getCodigo());
            lb_nombre_2.setText(mcon.getRevis_list().element().getNombre());
            lb_fechaInspeccionFisica_2.setText(mcon.getRevis_list().element().getFechaInspeccionFisica() + "");
            lb_peso_2.setText(mcon.getRevis_list().element().getPeso() + "");
        } else {
            lb_codigo_2.setText("codigo");
            lb_nombre_2.setText("nombre");
            lb_fechaInspeccionFisica_2.setText("FechaInspeccionFisica");
            lb_peso_2.setText("peso");
        }

        if (mcon.getImport_list().size() > 0) {
            lb_codigo_3.setText(mcon.getImport_list().element().getCodigo());
            lb_nombre_3.setText(mcon.getImport_list().element().getNombre());
            lb_fechaSalidConta_3.setText(mcon.getImport_list().element().getFechaRevisionLicenciaImportacion() + "");
            lb_peso_3.setText(mcon.getImport_list().element().getPeso() + "");
        } else {
            lb_codigo_3.setText("codigo");
            lb_nombre_3.setText("nombre");
            lb_fechaSalidConta_3.setText("FRevLicenciaImp");
            lb_peso_3.setText("peso");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_1 = new javax.swing.JTable();
        btn_sacar = new javax.swing.JButton();
        btn_inspec = new javax.swing.JButton();
        btn_revision = new javax.swing.JButton();
        btn_import = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        lb_codigo_1 = new javax.swing.JLabel();
        lb_nombre_1 = new javax.swing.JLabel();
        lb_fechaSalidConta_1 = new javax.swing.JLabel();
        lb_peso_1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lb_codigo_2 = new javax.swing.JLabel();
        lb_nombre_2 = new javax.swing.JLabel();
        lb_fechaInspeccionFisica_2 = new javax.swing.JLabel();
        lb_peso_2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        lb_codigo_3 = new javax.swing.JLabel();
        lb_nombre_3 = new javax.swing.JLabel();
        lb_fechaSalidConta_3 = new javax.swing.JLabel();
        lb_peso_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Peso", "Altura", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_1);
        if (tbl_1.getColumnModel().getColumnCount() > 0) {
            tbl_1.getColumnModel().getColumn(0).setResizable(false);
            tbl_1.getColumnModel().getColumn(1).setResizable(false);
            tbl_1.getColumnModel().getColumn(2).setResizable(false);
            tbl_1.getColumnModel().getColumn(3).setResizable(false);
            tbl_1.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_sacar.setText("Sacar");
        btn_sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sacarActionPerformed(evt);
            }
        });

        btn_inspec.setText("Inspecciòn Fisica");
        btn_inspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inspecActionPerformed(evt);
            }
        });

        btn_revision.setText("Revisiòn Licencia");
        btn_revision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_revisionActionPerformed(evt);
            }
        });

        btn_import.setText("Importaciòn");
        btn_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_importActionPerformed(evt);
            }
        });

        tbl_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "FSalidaCont", "FInstpeccFisica", "FRevisionLic", "Fimportacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_2);
        if (tbl_2.getColumnModel().getColumnCount() > 0) {
            tbl_2.getColumnModel().getColumn(0).setResizable(false);
            tbl_2.getColumnModel().getColumn(1).setResizable(false);
            tbl_2.getColumnModel().getColumn(2).setResizable(false);
            tbl_2.getColumnModel().getColumn(3).setResizable(false);
            tbl_2.getColumnModel().getColumn(4).setResizable(false);
            tbl_2.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("Mercancias Nacionalizadas");

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 102)));

        lb_codigo_1.setText("codigo");

        lb_nombre_1.setText("nombre");

        lb_fechaSalidConta_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_fechaSalidConta_1.setText("FechaSalidaContainer");

        lb_peso_1.setText("peso");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(lb_codigo_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_peso_1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre_1)
                            .addComponent(lb_fechaSalidConta_1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo_1)
                    .addComponent(lb_peso_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nombre_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_fechaSalidConta_1)
                .addContainerGap())
        );

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 102)));

        lb_codigo_2.setText("codigo");

        lb_nombre_2.setText("nombre");

        lb_fechaInspeccionFisica_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_fechaInspeccionFisica_2.setText("FechaInspeccionFisica");

        lb_peso_2.setText("peso");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(lb_codigo_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_peso_2))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre_2)
                            .addComponent(lb_fechaInspeccionFisica_2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo_2)
                    .addComponent(lb_peso_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nombre_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_fechaInspeccionFisica_2)
                .addContainerGap())
        );

        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 102)));

        lb_codigo_3.setText("codigo");

        lb_nombre_3.setText("nombre");

        lb_fechaSalidConta_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_fechaSalidConta_3.setText("FRevLicenciaImp");

        lb_peso_3.setText("peso");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(lb_codigo_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_peso_3))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre_3)
                            .addComponent(lb_fechaSalidConta_3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_codigo_3)
                    .addComponent(lb_peso_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nombre_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_fechaSalidConta_3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btn_sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_import, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_revision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_inspec, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sacar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_inspec)
                        .addGap(18, 18, 18)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btn_revision)
                        .addGap(18, 18, 18)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_import)
                        .addGap(18, 18, 18)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sacarActionPerformed

        if (mcon.getMerca_list().size() > 0) {
            mercancia pop = mcon.getMerca_list().pop();
            pop.setEstado("EnProceso");
            mcon.getInspec_list().offer(pop);
        }

        validPanel();

        listar();
    }//GEN-LAST:event_btn_sacarActionPerformed

    private void btn_inspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inspecActionPerformed

        if (mcon.getInspec_list().size() > 0) {
            mercancia pop = mcon.getInspec_list().poll();
            pop.setFechaInspeccionFisica(mcon.getTime());
            pop.setEstado("RevisadaFisicamente");
            mcon.getRevis_list().offer(pop);
        }

        validPanel();

        listar();
    }//GEN-LAST:event_btn_inspecActionPerformed

    private void btn_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_importActionPerformed
        if (mcon.getImport_list().size() > 0) {
            mercancia pop = mcon.getImport_list().poll();
            pop.setFechaImportacion(mcon.getTime());
            pop.setEstado("LicenciaRevisada");
            mcon.getNacionalized().add(pop);
        }

        validPanel();

        listar();
    }//GEN-LAST:event_btn_importActionPerformed

    private void btn_revisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_revisionActionPerformed
        if (mcon.getRevis_list().size() > 0) {
            mercancia pop = mcon.getRevis_list().poll();
            pop.setFechaRevisionLicenciaImportacion(mcon.getTime());
            pop.setEstado("Importada");
            mcon.getImport_list().offer(pop);
        }

        validPanel();

        listar();
    }//GEN-LAST:event_btn_revisionActionPerformed

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
    private javax.swing.JButton btn_import;
    private javax.swing.JButton btn_inspec;
    private javax.swing.JButton btn_revision;
    private javax.swing.JButton btn_sacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_codigo_1;
    private javax.swing.JLabel lb_codigo_2;
    private javax.swing.JLabel lb_codigo_3;
    private javax.swing.JLabel lb_fechaInspeccionFisica_2;
    private javax.swing.JLabel lb_fechaSalidConta_1;
    private javax.swing.JLabel lb_fechaSalidConta_3;
    private javax.swing.JLabel lb_nombre_1;
    private javax.swing.JLabel lb_nombre_2;
    private javax.swing.JLabel lb_nombre_3;
    private javax.swing.JLabel lb_peso_1;
    private javax.swing.JLabel lb_peso_2;
    private javax.swing.JLabel lb_peso_3;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JTable tbl_1;
    private javax.swing.JTable tbl_2;
    // End of variables declaration//GEN-END:variables
}
