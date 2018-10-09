/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import model.ingreso;
import model.persona;

/**
 *
 * @author E304
 */
public class ascensor_add {
    static ArrayList<persona> listapresona= new ArrayList<>();
    static ArrayList<ingreso> listaingreso = new ArrayList<>();
    static Stack pila = new Stack();
    static Queue cola = new LinkedList();

    public ArrayList<persona> getListapresona() {
        return listapresona;
    }

    public void setListapresona(ArrayList<persona> listapresona) {
        this.listapresona = listapresona;
    }

    public ArrayList<ingreso> getListaingreso() {
        return listaingreso;
    }

    public void setListaingreso(ArrayList<ingreso> listaingreso) {
        this.listaingreso = listaingreso;
    }

    public Stack getPila() {
        return pila;
    }

    public void setPila(Stack pila) {
        this.pila = pila;
    }

    public Queue getCola() {
        return cola;
    }

    public void setCola(Queue cola) {
        this.cola = cola;
    }
    
    public void add_person(persona p1){
        listapresona.add(p1);
        
    }
    
    public ArrayList<String[]> Read(){
        ArrayList<String[]> get = new ArrayList();
        for (int i = 0; i < listapresona.size(); i++) {
            get.add(new String[]{
                listapresona.get(i).getNombre(),
                listapresona.get(i).getCodigo(),
                String.valueOf(listapresona.get(i).getPeso())
            });
        }
        return get;
    }
    
    
}
