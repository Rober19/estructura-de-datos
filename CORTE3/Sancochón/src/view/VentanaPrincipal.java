package view;

import model.Tree;
import model.Draw;
import model.Dijkstra;
import model.Prim;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

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

    public void LeftClickNode(int xxx, int yyy) {
        for (int j = 0; j < maximun; j++) {
            if ((xxx + 2) > tree1.getCordeX(j) && xxx < (tree1.getCordeX(j) + 13) && (yyy + 2) > tree1.getCordeY(j) && yyy < (tree1.getCordeY(j) + 13)) {
                if (nn == 0) {
                    perm = j;
                    R_repaint(maximun, tree1);
                } else {
                    EndNode = j;
                }
                nn++;
                n = 0;
                id = -1;
                Draw.clickSobreNodo(PanelGeneral.getGraphics(), tree1.getCordeX(j), tree1.getCordeY(j), null, Color.GREEN);
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
            JOptionPane.showMessageDialog(null, prop("failLoadImage"));
        }
    }

    public VentanaPrincipal() {
        initComponents();       
        jDialog1.setLocationRelativeTo(null);
    }

    Draw draw_all = new Draw();
    Tree tree1 = new Tree();

    private int maximun = 0;// lleva el # de nodos creado 
    private int EndNode;
    private int perm;
    int n = 0, nn = 0, id, id2;// permite controlar que se halla dado click sobre un nodo
    private int MaxRoad;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        PanelGeneral = new javax.swing.JPanel();
        jmapa = new javax.swing.JLabel();
        BarMenu = new javax.swing.JMenuBar();
        MenuGeneral = new javax.swing.JMenu();
        Item2 = new javax.swing.JMenuItem();
        Item3 = new javax.swing.JMenuItem();
        Item4 = new javax.swing.JMenuItem();
        Item5 = new javax.swing.JMenuItem();
        Item6 = new javax.swing.JMenuItem();
        Sep3 = new javax.swing.JPopupMenu.Separator();
        Item = new javax.swing.JMenuItem();
        Item8 = new javax.swing.JMenuItem();
        Item9 = new javax.swing.JMenuItem();
        Sep4 = new javax.swing.JPopupMenu.Separator();
        Item10 = new javax.swing.JMenuItem();

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

        PanelGeneral.setBackground(new java.awt.Color(0, 102, 102));
        PanelGeneral.setMinimumSize(new java.awt.Dimension(770, 522));
        PanelGeneral.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelGeneralMouseMoved(evt);
            }
        });
        PanelGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelGeneralMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelGeneralMousePressed(evt);
            }
        });
        PanelGeneral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelGeneralKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PanelGeneralKeyReleased(evt);
            }
        });
        PanelGeneral.setLayout(null);
        PanelGeneral.add(jmapa);
        jmapa.setBounds(10, 10, 750, 520);

        getContentPane().add(PanelGeneral);
        PanelGeneral.setBounds(10, 10, 770, 540);

        MenuGeneral.setText("Revisar");

        Item2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Item2.setText("Recubrir");
        Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item2ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item2);

        Item3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        Item3.setText("Nuevo Camino");
        Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item3ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item3);

        Item4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        Item4.setText("Borrar Punto");
        Item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item4ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item4);

        Item5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Item5.setText("Borrar Camino");
        Item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item5ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item5);

        Item6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Item6.setText("Borrar todos los Caminos");
        Item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item6ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item6);
        MenuGeneral.add(Sep3);

        Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Item.setText("Ruta mas Corta");
        Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item);

        Item8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Item8.setText("Cargar Imagen de fondo");
        Item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item8ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item8);

        Item9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        Item9.setText("Nuevo Proyecto");
        Item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item9ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item9);
        MenuGeneral.add(Sep4);

        Item10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Item10.setText("Salir");
        Item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item10ActionPerformed(evt);
            }
        });
        MenuGeneral.add(Item10);

        BarMenu.add(MenuGeneral);

        setJMenuBar(BarMenu);

        setSize(new java.awt.Dimension(807, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PanelGeneralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGeneralMousePressed
        int xxx, yyy;
        xxx = evt.getX();
        yyy = evt.getY();
        if (evt.isMetaDown()) {
            LeftClickNode(xxx, yyy);
            if (nn == 2) {
                nn = 0;
                Dijkstra Dijkstra = new Dijkstra(tree1, maximun, perm, EndNode);
                Dijkstra.dijkstra();
                //jtacumulado.setText("" + Dijkstra.getAcumulado());

            }
        } else {
            if (!RightClickNode(xxx, yyy)) {// si  clik sobre  nodo es falso entra
                if (maximun < 50) {
                    tree1.setCordeX(maximun, xxx);
                    tree1.setCordeY(maximun, yyy);
                    tree1.setNombre(maximun, maximun);
                    Draw.pintarCirculo(PanelGeneral.getGraphics(), tree1.getCordeX(maximun), tree1.getCordeY(maximun), String.valueOf(tree1.getNombre(maximun)));
                    maximun++;
                } else {
                    JOptionPane.showMessageDialog(null, prop("maxNode"));
                }
            }
            if (n == 2) {
                n = 0;
                int ta = ingresarTamano(prop("inpSize"));
                if (MaxRoad < ta) {
                    MaxRoad = ta;
                }
                tree1.setmAdyacencia(id2, id, 1);
                tree1.setmAdyacencia(id, id2, 1);
                tree1.setmCoeficiente(id2, id, ta);
                tree1.setmCoeficiente(id, id2, ta);
                Draw.pintarLinea(PanelGeneral.getGraphics(), tree1.getCordeX(id), tree1.getCordeY(id), tree1.getCordeX(id2), tree1.getCordeY(id2), ta);
                Draw.pintarCirculo(PanelGeneral.getGraphics(), tree1.getCordeX(id), tree1.getCordeY(id), String.valueOf(tree1.getNombre(id)));
                Draw.pintarCirculo(PanelGeneral.getGraphics(), tree1.getCordeX(id2), tree1.getCordeY(id2), String.valueOf(tree1.getNombre(id2)));
                id = -1;
                id2 = -1;
            }
        }
    }//GEN-LAST:event_PanelGeneralMousePressed

    private void Item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item2ActionPerformed
        if (maximun < 1) {
            JOptionPane.showMessageDialog(null, prop("NodesVoid"));
        } else {
            Prim Prim = new Prim(tree1, maximun, MaxRoad);
            Prim.prim();
            //jtacumulado.setText("" + Prim.getCumulado());
        }
    }//GEN-LAST:event_Item2ActionPerformed

    private void Item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item3ActionPerformed
        if (maximun <= 1) {
            JOptionPane.showMessageDialog(null, prop("creatNewNode"));
        } else {
            this.setEnabled(false);
            new Dialog_crearCamino(tree1, draw_all, maximun, this).setVisible(true);
            PanelGeneral.paint(PanelGeneral.getGraphics());
            R_repaint(maximun, tree1);
        }
    }//GEN-LAST:event_Item3ActionPerformed

    private void PanelGeneralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelGeneralKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_PanelGeneralKeyPressed

    private void PanelGeneralKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelGeneralKeyReleased

    }//GEN-LAST:event_PanelGeneralKeyReleased

    private void Item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Item10ActionPerformed

    private void Item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item9ActionPerformed

        for (int j = 0; j < maximun; j++) {
            tree1.setCordeX(j, 0);
            tree1.setCordeY(j, 0);
            tree1.setNombre(j, 0);
        }
        for (int j = 0; j < maximun; j++) {
            for (int k = 0; k < maximun; k++) {
                tree1.setmAdyacencia(j, k, 0);
                tree1.setmCoeficiente(j, k, 0);
            }
        }
        maximun = 00;
        PanelGeneral.repaint();

    }//GEN-LAST:event_Item9ActionPerformed

    private void PanelGeneralMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGeneralMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelGeneralMouseMoved

    private void Item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item5ActionPerformed
        if (maximun >= 2) {
            this.setEnabled(false);
            new Dialog_borrarCaminos(draw_all, tree1, maximun, this).setVisible(true);
            PanelGeneral.paint(PanelGeneral.getGraphics());
            R_repaint(maximun, tree1);
        } else {
            JOptionPane.showMessageDialog(null, prop("noLinksNodes"));
        }

    }//GEN-LAST:event_Item5ActionPerformed

    private void Item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item4ActionPerformed
        int Eliminar = ingresarNodoOrigen(prop("inpNodeToDel"), prop("nodeNoExist"), maximun);
        if (Eliminar <= maximun && Eliminar >= 0 && maximun > 0) {
            for (int j = 0; j < maximun; j++) {
                for (int k = 0; k < maximun; k++) {
                    if (j == Eliminar || k == Eliminar) {
                        tree1.setmAdyacencia(j, k, -1);
                    }
                }
            }
            for (int l = 0; l < maximun - 1; l++) {
                for (int m = 0; m < maximun; m++) {
                    if (tree1.getmAdyacencia(l, m) == -1) {
                        tree1.setmAdyacencia(l, m, tree1.getmAdyacencia(l + 1, m));
                        tree1.setmAdyacencia(l + 1, m, -1);
                        tree1.setmCoeficiente(l, m, tree1.getmCoeficiente(l + 1, m));
                    }
                }
            }
            for (int l = 0; l < maximun; l++) {
                for (int m = 0; m < maximun - 1; m++) {

                    if (tree1.getmAdyacencia(l, m) == -1) {
                        tree1.setmAdyacencia(l, m, tree1.getmAdyacencia(l, m + 1));
                        tree1.setmAdyacencia(l, m + 1, -1);
                        tree1.setmCoeficiente(l, m, tree1.getmCoeficiente(l, m + 1));

                    }
                }
            }

            tree1.setCordeX(Eliminar, -10);
            tree1.setCordeY(Eliminar, -10);
            tree1.setNombre(Eliminar, -10);
            for (int j = 0; j < maximun; j++) {
                for (int k = 0; k < maximun - 1; k++) {
                    if (tree1.getCordeX(k) == -10) {
                        tree1.setCordeX(k, tree1.getCordeX(k + 1));
                        tree1.setCordeX(k + 1, -10);
                        tree1.setCordeY(k, tree1.getCordeY(k + 1));
                        tree1.setCordeY(k + 1, -10);
                        tree1.setNombre(k, tree1.getNombre(k + 1));
                        tree1.setNombre(k + 1, -10);
                    }
                }
            }
            for (int j = 0; j < maximun; j++) {
                tree1.setNombre(j, j);// renombramos             
            }
            // eliminamos los -1 y  los -10 
            for (int j = 0; j < maximun + 1; j++) {
                for (int k = 0; k < maximun + 1; k++) {
                    if (tree1.getmAdyacencia(j, k) != -1) {
                        tree1.setmAdyacencia(j, k, tree1.getmAdyacencia(j, k));
                    } else {
                        tree1.setmAdyacencia(j, k, 0);
                    }
                    if (tree1.getmCoeficiente(j, k) != -10) {
                        tree1.setmCoeficiente(j, k, tree1.getmCoeficiente(j, k));
                    } else {
                        tree1.setmCoeficiente(j, k, 0);
                    }
                }
            }
            maximun--;
            PanelGeneral.paint(PanelGeneral.getGraphics());
            R_repaint(maximun, tree1);
        }
    }//GEN-LAST:event_Item4ActionPerformed

    private void Item6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item6ActionPerformed
        for (int j = 0; j < maximun; j++) {
            for (int k = 0; k < maximun; k++) {
                tree1.setmAdyacencia(j, k, 0);
                tree1.setmAdyacencia(k, j, 0);
                tree1.setmCoeficiente(j, k, 0);
                tree1.setmCoeficiente(k, j, 0);
            }
        }
        PanelGeneral.paint(PanelGeneral.getGraphics());
        R_repaint(maximun, tree1);
    }//GEN-LAST:event_Item6ActionPerformed

    private void ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemActionPerformed
        if (maximun >= 2) {
            perm = ingresarNodoOrigen(prop("inpNodeOrigin"), prop("originNodeNoExist"), maximun);// hacemos el llamano de la funcion         
            EndNode = ingresarNodoOrigen(prop("inpEndNode"), prop("EndNodeNoExist"), maximun);
            Dijkstra Dijkstra = new Dijkstra(tree1, maximun, perm, EndNode);
            Dijkstra.dijkstra();
            // jtacumulado.setText("" + Dijkstra.getAcumulado());
        } else {
            JOptionPane.showMessageDialog(null, prop("reqCreatNodes"));
        }
    }//GEN-LAST:event_ItemActionPerformed

    private void PanelGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelGeneralMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelGeneralMouseClicked

    private void Item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item8ActionPerformed
        jDialog1.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_Item8ActionPerformed

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

    public static void R_repaint(int tope, Tree arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    Draw.pintarLinea(PanelGeneral.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            Draw.pintarCirculo(PanelGeneral.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), String.valueOf(arboles.getNombre(j)));
        }

    }

    public static int ingresarNodoOrigen(String nodoOrige, String noExiste, int tope) {
        int nodoOrigen = 0;
        VentanaPrincipal v1 = new VentanaPrincipal();
        String val = JOptionPane.showInputDialog("" + nodoOrige);
        try {
            nodoOrigen = Integer.parseInt(val);
            if (nodoOrigen >= tope) {
                JOptionPane.showMessageDialog(null, "" + noExiste + "\n"+ v1.prop("reqNodeExist"));
                nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
            }
        } catch (Exception ex) {
            System.out.println(val);
            if (val != null) {
                nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
            }
        }
        return nodoOrigen;
    }

    public int ingresarTamano(String tama) {
        int tamano = 0;
        try {
            tamano = Integer.parseInt(JOptionPane.showInputDialog("" + tama));
            if (tamano < 1) {
                JOptionPane.showMessageDialog(null, prop("reqSizeAllowed"));
                tamano = ingresarTamano(tama);//no es nesario hacer esto
            }
        } catch (Exception ex) {
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }

    public boolean RightClickNode(int xxx, int yyy) {
        for (int j = 0; j < maximun; j++) {// consultamos si se ha sado  click sobre algun nodo 
            if ((xxx + 2) > tree1.getCordeX(j) && xxx < (tree1.getCordeX(j) + 13) && (yyy + 2) > tree1.getCordeY(j) && yyy < (tree1.getCordeY(j) + 13)) {

                if (n == 0) {
                    id = j;
                    R_repaint(maximun, tree1);
                    Draw.clickSobreNodo(PanelGeneral.getGraphics(), tree1.getCordeX(j), tree1.getCordeY(j), null, Color.orange);
                    n++;
                } else {
                    id2 = j;
                    n++;
                    Draw.clickSobreNodo(PanelGeneral.getGraphics(), tree1.getCordeX(j), tree1.getCordeY(j), null, Color.orange);
                    if (id == id2) {// si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                        n = 0;
                        Draw.pintarCirculo(PanelGeneral.getGraphics(), tree1.getCordeX(id), tree1.getCordeY(id), String.valueOf(tree1.getNombre(id)));
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
            java.util.logging.Logger.getLogger(Dialog_crearCamino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_crearCamino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_crearCamino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_crearCamino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu;
    private javax.swing.JMenuItem Item;
    private javax.swing.JMenuItem Item10;
    private javax.swing.JMenuItem Item2;
    private javax.swing.JMenuItem Item3;
    private javax.swing.JMenuItem Item4;
    private javax.swing.JMenuItem Item5;
    private javax.swing.JMenuItem Item6;
    private javax.swing.JMenuItem Item8;
    private javax.swing.JMenuItem Item9;
    private javax.swing.JMenu MenuGeneral;
    public static javax.swing.JPanel PanelGeneral;
    private javax.swing.JPopupMenu.Separator Sep3;
    private javax.swing.JPopupMenu.Separator Sep4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jmapa;
    // End of variables declaration//GEN-END:variables
}
