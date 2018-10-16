/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;
import model.mercancia;

/**
 *
 * @author E304
 */
public class mercanciaController {

    Stack<mercancia> merca_list = new Stack();
    List<mercancia> Nacionalized = new ArrayList();
    Queue<mercancia> inspec_list = new LinkedList();
    Queue<mercancia> revis_list = new LinkedList();
    Queue<mercancia> import_list = new LinkedList();

    public Stack<String[]> convertAlmacenados() {
        Stack<String[]> a = new Stack();
        merca_list.forEach(it -> {
            a.add(new String[]{it.getCodigo(), it.getNombre(), it.getPeso() + "", it.getAltura() + "", it.getColor()});
        });
        return a;
    }

    public Stack<String[]> convertImportados() {
        Stack<String[]> a = new Stack();
        Nacionalized.forEach(it -> {
            a.add(new String[]{
                it.getCodigo(),
                it.getNombre(),
                it.getFechaSalidaContainer(),
                it.getFechaInspeccionFisica(),
                it.getFechaRevisionLicenciaImportacion(),
                it.getFechaImportacion()
            });
        });
        return a;
    }

    public String getTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        return formatter.format(date);
    }

    public void listar(DefaultTableModel t, Stack<String[]> arr) {
        t.setNumRows(0);
        arr.forEach(t::addRow);
    }

    public List<mercancia> getNacionalized() {
        return Nacionalized;
    }

    public void setNacionalized(List<mercancia> Nacionalized) {
        this.Nacionalized = Nacionalized;
    }

    public Stack<mercancia> getMerca_list() {
        return merca_list;
    }

    public void setMerca_list(Stack<mercancia> merca_list) {
        this.merca_list = merca_list;
    }

    public Queue<mercancia> getInspec_list() {
        return inspec_list;
    }

    public void setInspec_list(Queue<mercancia> inspec_list) {
        this.inspec_list = inspec_list;
    }

    public Queue<mercancia> getRevis_list() {
        return revis_list;
    }

    public void setRevis_list(Queue<mercancia> revis_list) {
        this.revis_list = revis_list;
    }

    public Queue<mercancia> getImport_list() {
        return import_list;
    }

    public void setImport_list(Queue<mercancia> import_list) {
        this.import_list = import_list;
    }

}
