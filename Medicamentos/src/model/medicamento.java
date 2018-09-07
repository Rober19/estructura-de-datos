/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author E304
 */
public class medicamento {
    private String nombre;
    private String tipo;
    private String laboratorio;
    private boolean estado;

    public medicamento(String nombre, String tipo, String laboratorio, boolean estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.laboratorio = laboratorio;
        this.estado = estado;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getEstado() {
        String est;
        if (this.estado) {
            est = "Activo";
        } else {
            est = "Inactivo";
        }
        return est;
    }

    public boolean isEstado() {
        return estado;
    }
    
    

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    
}
