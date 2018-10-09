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
public class ExamenEstudiante {
    
    private String NombreEstudiante;
    private String Codigo;
    private int PreguntaBuenas;
    private String Estado; 

    public ExamenEstudiante(String NombreEstudiante, String Codigo, int PreguntaBuenas, String Estado) {
        this.NombreEstudiante = NombreEstudiante;
        this.Codigo = Codigo;
        this.PreguntaBuenas = PreguntaBuenas;
        this.Estado = Estado;
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String NombreEstudiante) {
        this.NombreEstudiante = NombreEstudiante;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getPreguntaBuenas() {
        return PreguntaBuenas;
    }

    public void setPreguntaBuenas(int PreguntaBuenas) {
        this.PreguntaBuenas = PreguntaBuenas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}
