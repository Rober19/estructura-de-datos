/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Vector;
import javax.swing.JOptionPane;
import model.asociado;
import model.prestamo;
import model.cuota;

/**
 *
 * @author E304
 */
public class totalController {

    static Vector<cuota> list_prestamos = new Vector();
    static Vector<asociado> list_asociados = new Vector();

    public void add(cuota p1) {
        list_prestamos.add(p1);
    }

    public void remove(int i) {
        list_prestamos.remove(i);
    }

    public void cuotas(int limit, int i, double valorPagar, double valorCuota, double valorTotal, prestamo p1, Vector<cuota> arr) {

        if (i > 0) {
            valorPagar -= valorCuota;
        }

        arr.add(new cuota(
                (i + 1),
                valorCuota,
                valorTotal,
                (i == 0) ? valorTotal : ( valorPagar < 0) ? valorPagar*-1 : valorPagar,
                false,
                p1
        ));

        i++;
        if (i < limit) {
            cuotas(limit, i, valorPagar, valorCuota, valorTotal, p1, arr);
        }

    }

    public void borrarCuotas(int i, asociado a1) {
        if (getList_prestamos().get(i).getPres1().getA1().getCodigo().equals(a1.getCodigo())) {
            getList_prestamos().remove(i);
            i = -1;
        }
        i++;        
        if (i < getList_prestamos().size()) {
            borrarCuotas(i, a1);
        }
    }
    
     public void igualar(int i, Vector<cuota> arr1, Vector<cuota> arr2){
        arr1.add(arr2.get(i));
        
        i++;
        if (i < arr2.size()) {
            igualar(i, arr1, arr2);
        }             
    }
    
    public void cambiarEst_prestamo(int i, asociado a1, String estado){
        if(getList_asociados().get(i).getCodigo().equals(a1.getCodigo())){
            getList_asociados().get(i).setEstado(estado);
            i = getList_asociados().size();
        }
        i++;
        if (i < getList_asociados().size()) {
            cambiarEst_prestamo(i, a1, estado);
        }
    }
    
    public void ultimaCuota(int i, asociado a1, int indexM) {
        
        cuota actual = getList_prestamos().get(i);
        cuota mayor = getList_prestamos().get(indexM);
        asociado pagando = actual.getPres1().getA1();
        
        if (actual.getNcuota() > mayor.getNcuota() && pagando.getCodigo().equals(a1.getCodigo())) {
            indexM = i;
            i = -1;
        }
        i++;
        if (i < getList_prestamos().size()) {
            ultimaCuota(i, a1, indexM);
        } else {
            if (mayor.isPagada() && mayor.getPres1().getA1().getCodigo().equals(a1.getCodigo())) {
                JOptionPane.showMessageDialog(null,
                        "La ultima cuota de " + mayor.getPres1().getA1().getNombre()
                        + " #" + mayor.getNcuota() + " ha sido PAGADA - PRESTAMOS ELIMINADO"
                );
                borrarCuotas(0, a1);
                cambiarEst_prestamo(0, a1, "sinPrestamo");                
            }
        }
    }
    
    public static Vector<cuota> getList_prestamos() {
        return list_prestamos;
    }

    public static void setList_prestamos(Vector<cuota> list_prestamos) {
        totalController.list_prestamos = list_prestamos;
    }

    public static Vector<asociado> getList_asociados() {
        return list_asociados;
    }

    public static void setList_asociados(Vector<asociado> list_asociados) {
        totalController.list_asociados = list_asociados;
    }

}
