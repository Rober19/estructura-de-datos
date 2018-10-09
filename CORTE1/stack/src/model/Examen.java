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
public class Examen {
    private String Codigo;
    private int NumeroPreguntas;

    public Examen(String Codigo, int NumeroPreguntas) {
        this.Codigo = Codigo;
        this.NumeroPreguntas = NumeroPreguntas;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumeroPreguntas() {
        return NumeroPreguntas;
    }

    public void setNumeroPreguntas(int NumeroPreguntas) {
        this.NumeroPreguntas = NumeroPreguntas;
    }
    
    
}
