/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.JugadorModel;
import java.util.Vector;
import javax.swing.JOptionPane;
import View.RegisterView;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orlando Castilla
 */
public class JugadorController {

   static JugadorModel j1 = new JugadorModel();
   static Vector<JugadorModel> lista_Jugador = new Vector<JugadorModel>();

    public void create(JugadorModel j1) {
        lista_Jugador.add(j1);
    }

    public void update(int index, JugadorModel j1, javax.swing.JTable tblShow_Player) {
        lista_Jugador.set(index, j1);
        admintabla(tblShow_Player, lista_Jugador);
        
    }

    public JugadorModel read(int index) {
        return lista_Jugador.get(index);

    }
    public Vector<JugadorModel> Read(String Filter) {
        Vector<JugadorModel> Get = new Vector<>();
        for (JugadorModel player : lista_Jugador) {
            if (player.getNombre().contains(Filter)) {
                Get.add(player);
            } else {
            }
        }
        return Get;
    }
    

    public void delete(int index, javax.swing.JTable tblShow_Player) {
        lista_Jugador.remove(index);
        admintabla(tblShow_Player,lista_Jugador);
       
    }

  

    public Vector<JugadorModel> getLista_Jugador() {
        return lista_Jugador;
    }

    public void setLista_Jugador(Vector<JugadorModel> lista_Jugador) {
        this.lista_Jugador = lista_Jugador;
    }

    public void listar_1(DefaultTableModel tabla, Vector vec){
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
        }
        
        for (int i = 0; i < vec.size(); i++) {
            JugadorModel j1 = (JugadorModel) vec.get(i);
            tabla.addRow(new Object[]{j1.getNombre(), j1.getEstatura(), j1.getFecha_Nacimiento(),j1.getPosicion()});
        }
    }
    

    public void admintabla(javax.swing.JTable tblShow_Player, Vector<JugadorModel> jugaco) {
        Object[][] matriz = new Object[jugaco.size()][4];
        for (int i = 0; i < jugaco.size(); i++) {
            matriz[i][0] = jugaco.get(i).getNombre();
            matriz[i][1] = jugaco.get(i).getEstatura();
            matriz[i][2] = jugaco.get(i).getFecha_Nacimiento();
            matriz[i][3] = jugaco.get(i).getPosicion();
            

        }       
        
        tblShow_Player.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Estatura", "Fecha_Nacimiento", "Posicion"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });        

        if (tblShow_Player.getColumnModel().getColumnCount() > 0) {
            tblShow_Player.getColumnModel().getColumn(0).setResizable(false);
            tblShow_Player.getColumnModel().getColumn(1).setResizable(false);
            tblShow_Player.getColumnModel().getColumn(2).setResizable(false);
            tblShow_Player.getColumnModel().getColumn(3).setResizable(false);
        }

    }

    public void admintabla1(JTable tblPorEstatura, Vector<JugadorModel> Lista_Orden) {
     Object[][] matriz = new Object[Lista_Orden.size()][4];
        for (int i = 0; i < Lista_Orden.size(); i++) {
            matriz[i][0] = Lista_Orden.get(i).getNombre();
            matriz[i][1] = Lista_Orden.get(i).getEstatura();
            matriz[i][2] = Lista_Orden.get(i).getFecha_Nacimiento();
            matriz[i][3] = Lista_Orden.get(i).getPosicion();
            

        }       
        
        tblPorEstatura.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Estatura", "Fecha_Nacimiento", "Posicion"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });        

        if (tblPorEstatura.getColumnModel().getColumnCount() > 0) {
            tblPorEstatura.getColumnModel().getColumn(0).setResizable(false);
            tblPorEstatura.getColumnModel().getColumn(1).setResizable(false);
            tblPorEstatura.getColumnModel().getColumn(2).setResizable(false);
            tblPorEstatura.getColumnModel().getColumn(3).setResizable(false);
        }

       
    
    }

   

    

   
    
    

}
