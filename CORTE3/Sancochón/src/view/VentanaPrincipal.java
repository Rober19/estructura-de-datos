/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Arbol;
import model.Pintar;
import model.Dijkstra;
import model.Prim;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author fredy_000
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPincipal
     */
    Pintar pintar = new Pintar();
    Arbol arboles = new Arbol();

    public static void R_repaint(int tope, Arbol arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    Pintar.pintarLinea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), String.valueOf(arboles.getNombre(j)));
        }

    }

    public static int ingresarNodoOrigen(String nodoOrige, String noExiste, int tope) {
        int nodoOrigen = 0;
        try {
            nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog("" + nodoOrige));
            if (nodoOrigen >= tope) {
                JOptionPane.showMessageDialog(null, "" + noExiste + "\nDebe de ingresar  un Nodo existente");
                nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
            }
        } catch (Exception ex) {
            nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
        }
        return nodoOrigen;
    }

    public int ingresarTamano(String tama) {
        int tamano = 0;
        try {
            tamano = Integer.parseInt(JOptionPane.showInputDialog("" + tama));
            if (tamano < 1) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar un Tamaño Aceptado..");
                tamano = ingresarTamano(tama);//no es nesario hacer esto
            }
        } catch (Exception ex) {
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }

    public boolean cicDerechoSobreNodo(int xxx, int yyy) {
        for (int j = 0; j < tope; j++) {// consultamos si se ha sado  click sobre algun nodo 
            if ((xxx + 2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j) + 13) && (yyy + 2) > arboles.getCordeY(j) && yyy < (arboles.getCordeY(j) + 13)) {

                if (n == 0) {
                    id = j;
                    R_repaint(tope, arboles);
                    Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.orange);
                    n++;
                } else {
                    id2 = j;
                    n++;
                    Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.orange);
                    if (id == id2) {// si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                        n = 0;
                        Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), String.valueOf(arboles.getNombre(id)));
                        id = -1;
                        id2 = -1;
                    }
                }
                nn = 0;
                return true;
            }
        }
        return false;
    }

    public void clicIzqSobreNodo(int xxx, int yyy) {
        for (int j = 0; j < tope; j++) {
            if ((xxx + 2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j) + 13) && (yyy + 2) > arboles.getCordeY(j) && yyy < (arboles.getCordeY(j) + 13)) {
                if (nn == 0) {
                    permanente = j;
                    R_repaint(tope, arboles);
                } else {
                    nodoFin = j;
                }
                nn++;
                n = 0;
                id = -1;
                Pintar.clickSobreNodo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.GREEN);
                break;
            }

        }

    }

    public void adactarImagen(File file) {
        try {

            BufferedImage read = ImageIO.read(file);
            Image scaledInstance = read.getScaledInstance(jmapa.getWidth(), jmapa.getHeight(), Image.SCALE_DEFAULT);

            jmapa.setIcon(new ImageIcon(scaledInstance));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la imagen");
        }
    }

    public VentanaPrincipal() {
        initComponents();      
        jDialog1.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jmapa = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();

        jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jFileChooser2.setMaximumSize(new java.awt.Dimension(21475, 21474));
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);
        jFileChooser2.setBounds(10, 20, 670, 390);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(":::::::::Grafos::::::::::");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 522));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(null);
        jPanel1.add(jmapa);
        jmapa.setBounds(10, 10, 750, 520);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 770, 540);

        jMenu1.setText("Revisar");
        jMenu1.add(jSeparator1);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Camino Más Corto");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Recubrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Nueva Arista");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Eliminar Nodo");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Eliminar Arista");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Eliminar Todas Las Arsitas ");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);
        jMenu1.add(jSeparator2);
        jMenu1.add(jSeparator4);

        jMenuItem4.setText("Muestra ");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Cargar Mapa");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Nuevo Proyecto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(807, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        int xxx, yyy;
        xxx = evt.getX();
        yyy = evt.getY();
        if (evt.isMetaDown()) {
            clicIzqSobreNodo(xxx, yyy);
            if (nn == 2) {
                nn = 0;
                Dijkstra Dijkstra = new Dijkstra(arboles, tope, permanente, nodoFin);
                Dijkstra.dijkstra();
                //jtacumulado.setText("" + Dijkstra.getAcumulado());

            }
        } else {
            if (!cicDerechoSobreNodo(xxx, yyy)) {// si  clik sobre  nodo es falso entra
                if (tope < 50) {
                    arboles.setCordeX(tope, xxx);
                    arboles.setCordeY(tope, yyy);
                    arboles.setNombre(tope, tope);
                    Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(tope), arboles.getCordeY(tope), String.valueOf(arboles.getNombre(tope)));
                    tope++;
                } else {
                    JOptionPane.showMessageDialog(null, "Se ha llegado al Maximo de nodos..");
                }
            }
            if (n == 2) {
                n = 0;
                int ta = ingresarTamano("Ingrese Tamaño");
                if (aristaMayor < ta) {
                    aristaMayor = ta;
                }
                arboles.setmAdyacencia(id2, id, 1);
                arboles.setmAdyacencia(id, id2, 1);
                arboles.setmCoeficiente(id2, id, ta);
                arboles.setmCoeficiente(id, id2, ta);
                Pintar.pintarLinea(jPanel1.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), arboles.getCordeX(id2), arboles.getCordeY(id2), ta);
                Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), String.valueOf(arboles.getNombre(id)));
                Pintar.pintarCirculo(jPanel1.getGraphics(), arboles.getCordeX(id2), arboles.getCordeY(id2), String.valueOf(arboles.getNombre(id2)));
                id = -1;
                id2 = -1;
            }
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed

    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //jMenuItem2.setEnabled(false);
        jPanel1.paint(jPanel1.getGraphics());
        n = 0;
        id = -1;
        id2 = -1;
        int Matriz[][] = {{0, 1, 0, 1, 1, 0, 0, 1},
        {1, 0, 1, 0, 0, 0, 0, 0},
        {0, 1, 0, 1, 1, 0, 0, 0},
        {1, 0, 1, 0, 0, 0, 0, 0},
        {1, 0, 1, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 1, 0, 1, 1},
        {0, 0, 0, 0, 0, 1, 0, 0},
        {1, 0, 0, 0, 0, 1, 0, 0}
        };
        int coe[][] = {{0, 50, 0, 46, 216, 0, 0, 578},
        {50, 0, 59, 0, 0, 0, 0, 0},
        {0, 59, 0, 89, 174, 0, 0, 0},
        {46, 0, 89, 0, 0, 0, 0, 0},
        {216, 0, 174, 0, 0, 471, 0, 0},
        {0, 0, 0, 0, 471, 0, 194, 398},
        {0, 0, 0, 0, 0, 194, 0, 0},
        {578, 0, 0, 0, 0, 398, 0, 0},};
        int xx1[] = {202, 102, 8, 198, 248, 352, 481, 416};
        int yy1[] = {12, 74, 165, 113, 233, 300, 368, 177};
        int nom[] = {0, 1, 2, 3, 4, 5, 6, 7};
        aristaMayor = 600;
        for (int j = 0; j < 8; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        tope = 8;
        R_repaint(tope, arboles);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (tope < 1) {
            JOptionPane.showMessageDialog(null, "Aun no se ha creado Un nodo");
        } else {
            Prim Prim = new Prim(arboles, tope, aristaMayor);
            Prim.prim();
            //jtacumulado.setText("" + Prim.getCumulado());
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (tope <= 1) {
            JOptionPane.showMessageDialog(null, "Cree nuevo nodo : ");
        } else {
            this.setEnabled(false);
            new VentanaArista(arboles, pintar, tope, this).setVisible(true);
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope, arboles);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased

    }//GEN-LAST:event_jPanel1KeyReleased

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        for (int j = 0; j < tope; j++) {
            arboles.setCordeX(j, 0);
            arboles.setCordeY(j, 0);
            arboles.setNombre(j, 0);
        }
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                arboles.setmAdyacencia(j, k, 0);
                arboles.setmCoeficiente(j, k, 0);
            }
        }
        tope = 00;
        jPanel1.repaint();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if (tope >= 2) {
            this.setEnabled(false);
            new EliminarAristas(pintar, arboles, tope, this).setVisible(true);
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope, arboles);
        } else {
            JOptionPane.showMessageDialog(null, "No Hay Nodos Enlazados... ");
        }

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        int Eliminar = ingresarNodoOrigen("Ingrese Nodo a Eliminar ", "Nodo No existe", tope);
        if (Eliminar <= tope && Eliminar >= 0 && tope > 0) {
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope; k++) {
                    if (j == Eliminar || k == Eliminar) {
                        arboles.setmAdyacencia(j, k, -1);
                    }
                }
            }
            for (int l = 0; l < tope - 1; l++) {
                for (int m = 0; m < tope; m++) {
                    if (arboles.getmAdyacencia(l, m) == -1) {
                        arboles.setmAdyacencia(l, m, arboles.getmAdyacencia(l + 1, m));
                        arboles.setmAdyacencia(l + 1, m, -1);
                        arboles.setmCoeficiente(l, m, arboles.getmCoeficiente(l + 1, m));
                    }
                }
            }
            for (int l = 0; l < tope; l++) {
                for (int m = 0; m < tope - 1; m++) {

                    if (arboles.getmAdyacencia(l, m) == -1) {
                        arboles.setmAdyacencia(l, m, arboles.getmAdyacencia(l, m + 1));
                        arboles.setmAdyacencia(l, m + 1, -1);
                        arboles.setmCoeficiente(l, m, arboles.getmCoeficiente(l, m + 1));

                    }
                }
            }

            arboles.setCordeX(Eliminar, -10);
            arboles.setCordeY(Eliminar, -10);
            arboles.setNombre(Eliminar, -10);
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope - 1; k++) {
                    if (arboles.getCordeX(k) == -10) {
                        arboles.setCordeX(k, arboles.getCordeX(k + 1));
                        arboles.setCordeX(k + 1, -10);
                        arboles.setCordeY(k, arboles.getCordeY(k + 1));
                        arboles.setCordeY(k + 1, -10);
                        arboles.setNombre(k, arboles.getNombre(k + 1));
                        arboles.setNombre(k + 1, -10);
                    }
                }
            }
            for (int j = 0; j < tope; j++) {
                arboles.setNombre(j, j);// renombramos             
            }
            // eliminamos los -1 y  los -10 
            for (int j = 0; j < tope + 1; j++) {
                for (int k = 0; k < tope + 1; k++) {
                    if (arboles.getmAdyacencia(j, k) != -1) {
                        arboles.setmAdyacencia(j, k, arboles.getmAdyacencia(j, k));
                    } else {
                        arboles.setmAdyacencia(j, k, 0);
                    }
                    if (arboles.getmCoeficiente(j, k) != -10) {
                        arboles.setmCoeficiente(j, k, arboles.getmCoeficiente(j, k));
                    } else {
                        arboles.setmCoeficiente(j, k, 0);
                    }
                }
            }
            tope--;
            jPanel1.paint(jPanel1.getGraphics());
            R_repaint(tope, arboles);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                arboles.setmAdyacencia(j, k, 0);
                arboles.setmAdyacencia(k, j, 0);
                arboles.setmCoeficiente(j, k, 0);
                arboles.setmCoeficiente(k, j, 0);
            }
        }
        jPanel1.paint(jPanel1.getGraphics());
        R_repaint(tope, arboles);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        if (tope >= 2) {
            permanente = ingresarNodoOrigen("Ingrese Nodo Origen..", "nodo Origen No existe", tope);// hacemos el llamano de la funcion         
            nodoFin = ingresarNodoOrigen("Ingrese Nodo Fin..", "nodo fin No existe", tope);
            Dijkstra Dijkstra = new Dijkstra(arboles, tope, permanente, nodoFin);
            Dijkstra.dijkstra();
           // jtacumulado.setText("" + Dijkstra.getAcumulado());
        } else {
            JOptionPane.showMessageDialog(null, "Se deben de crear mas nodos ... ");
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jDialog1.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed

        JFileChooser selectorArchios = (JFileChooser) evt.getSource();
        String comando = evt.getActionCommand();
        if (comando.equals(JFileChooser.APPROVE_SELECTION)) {
            File archiSeleccionado = selectorArchios.getSelectedFile();
            adactarImagen(archiSeleccionado);
            jDialog1.setVisible(false);
            //JOptionPane.showMessageDialog(null, ""+archiSeleccionado+"  nOMBRE"+archiSeleccionado.getName());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    private int tope = 0;// lleva el # de nodos creado 
    private int nodoFin;
    private int permanente;
    int n = 0, nn = 0, id, id2;// permite controlar que se halla dado click sobre un nodo
    private int aristaMayor;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel jmapa;
    // End of variables declaration//GEN-END:variables
}
