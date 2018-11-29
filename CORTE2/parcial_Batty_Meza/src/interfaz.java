
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
import modelo.mercancias;

/**
 *
 * @author E304
 */
public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
        persitencia();
        listaderadetablas();
    }

    controlador elcontrolador = new controlador();

    public void persitencia() {
        File fichero = new File("datos.txt");

        if (fichero.exists()) {
            try {
                FileInputStream archivo = new FileInputStream("datos.txt");
                ObjectInputStream obj_archivo = new ObjectInputStream(archivo);
                elcontrolador.setMercanciasDelContainer((Stack<mercancias>) obj_archivo.readObject());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }

    }

    public void listaderadetablas() {
        elcontrolador.listar((DefaultTableModel) tablaDatos.getModel(), elcontrolador.toAlmacenados());
        elcontrolador.listar((DefaultTableModel) Nacionalizados.getModel(), elcontrolador.toImportados());
    }

    public void validarLetricas() {

        if (elcontrolador.getColaRevis().size() > 0) {
            codigo2.setText(elcontrolador.getColaRevis().element().getCodigo());
            nombre2.setText(elcontrolador.getColaRevis().element().getNombre());
            fechaInspeFis2.setText(elcontrolador.getColaRevis().element().getFechaInspeccionFisica() + "");
            peso2.setText(elcontrolador.getColaRevis().element().getPeso() + "");
        } else {
            codigo2.setText("codigo");
            nombre2.setText("nombre");
            fechaInspeFis2.setText("FechaInspeccionFisica");
            peso2.setText("peso");
        }

        if (elcontrolador.getColaInspec().size() > 0) {
            codigo1.setText(elcontrolador.getColaInspec().element().getCodigo());
            nombre1.setText(elcontrolador.getColaInspec().element().getNombre());
            fechaSalidConta1.setText(elcontrolador.getColaInspec().element().getFechaSalidaContainer() + "");
            peso1.setText(elcontrolador.getColaInspec().element().getPeso() + "");
        } else {
            codigo1.setText("codigo");
            nombre1.setText("nombre");
            fechaSalidConta1.setText("FechaSalidaContainer");
            peso1.setText("peso");
        }

        if (elcontrolador.getColaImpor().size() > 0) {
            codigo3.setText(elcontrolador.getColaImpor().element().getCodigo());
            nombre3.setText(elcontrolador.getColaImpor().element().getNombre());
            fechaSalidConta3.setText(elcontrolador.getColaImpor().element().getFechaRevisionLicenciaImportacion() + "");
            lb_peso_3.setText(elcontrolador.getColaImpor().element().getPeso() + "");
        } else {
            codigo3.setText("codigo");
            nombre3.setText("nombre");
            fechaSalidConta3.setText("FRevLicenciaImp");
            lb_peso_3.setText("peso");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        sacar1 = new javax.swing.JButton();
        inspeccion1 = new javax.swing.JButton();
        revision2 = new javax.swing.JButton();
        importacion3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Nacionalizados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        codigo1 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        fechaSalidConta1 = new javax.swing.JLabel();
        peso1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        codigo2 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        fechaInspeFis2 = new javax.swing.JLabel();
        peso2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        codigo3 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        fechaSalidConta3 = new javax.swing.JLabel();
        lb_peso_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaDatos);
        if (tablaDatos.getColumnModel().getColumnCount() > 0) {
            tablaDatos.getColumnModel().getColumn(0).setResizable(false);
            tablaDatos.getColumnModel().getColumn(1).setResizable(false);
            tablaDatos.getColumnModel().getColumn(2).setResizable(false);
            tablaDatos.getColumnModel().getColumn(3).setResizable(false);
            tablaDatos.getColumnModel().getColumn(4).setResizable(false);
        }

        sacar1.setText("Sacar");
        sacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacar1ActionPerformed(evt);
            }
        });

        inspeccion1.setText("Inspecciòn Fisica");
        inspeccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inspeccion1ActionPerformed(evt);
            }
        });

        revision2.setText("Revisiòn Licencia");
        revision2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revision2ActionPerformed(evt);
            }
        });

        importacion3.setText("Importaciòn");
        importacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importacion3ActionPerformed(evt);
            }
        });

        Nacionalizados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(Nacionalizados);
        if (Nacionalizados.getColumnModel().getColumnCount() > 0) {
            Nacionalizados.getColumnModel().getColumn(0).setResizable(false);
            Nacionalizados.getColumnModel().getColumn(1).setResizable(false);
            Nacionalizados.getColumnModel().getColumn(2).setResizable(false);
            Nacionalizados.getColumnModel().getColumn(3).setResizable(false);
            Nacionalizados.getColumnModel().getColumn(4).setResizable(false);
            Nacionalizados.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("Nacionalizadas");

        codigo1.setText("codigo");

        nombre1.setText("nombre");

        fechaSalidConta1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fechaSalidConta1.setText("SalidaCont");

        peso1.setText("peso");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo1)
                    .addComponent(nombre1)
                    .addComponent(fechaSalidConta1)
                    .addComponent(peso1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(fechaSalidConta1)
                .addContainerGap())
        );

        codigo2.setText("codigo");

        nombre2.setText("nombre");

        fechaInspeFis2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fechaInspeFis2.setText("InspeccionFisica");

        peso2.setText("peso");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo2)
                    .addComponent(nombre2)
                    .addComponent(fechaInspeFis2)
                    .addComponent(peso2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(fechaInspeFis2)
                .addContainerGap())
        );

        codigo3.setText("codigo");

        nombre3.setText("nombre");

        fechaSalidConta3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fechaSalidConta3.setText("RevisiónLicenciaImp");

        lb_peso_3.setText("peso");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo3)
                    .addComponent(nombre3)
                    .addComponent(fechaSalidConta3)
                    .addComponent(lb_peso_3))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codigo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_peso_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaSalidConta3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(importacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(revision2)
                                    .addComponent(inspeccion1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(sacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(inspeccion1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(revision2)
                                .addGap(83, 83, 83)
                                .addComponent(importacion3)
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sacar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacar1ActionPerformed

        if (elcontrolador.getMercanciasDelContainer().size() > 0) {
            mercancias pop = elcontrolador.getMercanciasDelContainer().pop();
            pop.setEstado("EnProceso");
            elcontrolador.getColaInspec().offer(pop);
        }

        validarLetricas();

        listaderadetablas();
    }//GEN-LAST:event_sacar1ActionPerformed

    private void inspeccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inspeccion1ActionPerformed

        if (elcontrolador.getColaInspec().size() > 0) {
            mercancias pop = elcontrolador.getColaInspec().poll();
            pop.setFechaInspeccionFisica(elcontrolador.TiempoEnGestion());
            pop.setEstado("RevisadaFisicamente");
            elcontrolador.getColaRevis().offer(pop);
        }

        validarLetricas();

        listaderadetablas();
    }//GEN-LAST:event_inspeccion1ActionPerformed

    private void importacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importacion3ActionPerformed
        if (elcontrolador.getColaImpor().size() > 0) {
            mercancias pop = elcontrolador.getColaImpor().poll();
            pop.setFechaImportacion(elcontrolador.TiempoEnGestion());
            pop.setEstado("LicenciaRevisada");
            elcontrolador.getListos_nacionalizados().add(pop);
        }

        validarLetricas();

        listaderadetablas();
    }//GEN-LAST:event_importacion3ActionPerformed

    private void revision2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revision2ActionPerformed
        if (elcontrolador.getColaRevis().size() > 0) {
            mercancias pop = elcontrolador.getColaRevis().poll();
            pop.setFechaRevisionLicenciaImportacion(elcontrolador.TiempoEnGestion());
            pop.setEstado("Importada");
            elcontrolador.getColaImpor().offer(pop);
        }

        validarLetricas();

        listaderadetablas();
    }//GEN-LAST:event_revision2ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Nacionalizados;
    private javax.swing.JLabel codigo1;
    private javax.swing.JLabel codigo2;
    private javax.swing.JLabel codigo3;
    private javax.swing.JLabel fechaInspeFis2;
    private javax.swing.JLabel fechaSalidConta1;
    private javax.swing.JLabel fechaSalidConta3;
    private javax.swing.JButton importacion3;
    private javax.swing.JButton inspeccion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_peso_3;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JLabel peso1;
    private javax.swing.JLabel peso2;
    private javax.swing.JButton revision2;
    private javax.swing.JButton sacar1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
