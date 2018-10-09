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
public class ingreso {
    private persona persona;
    private piso piso;
    private int momento;

    public ingreso(persona persona, piso piso, int momento) {
        this.persona = persona;
        this.piso = piso;
        this.momento = momento;
    }

    public ingreso() {
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

    public piso getPiso() {
        return piso;
    }

    public void setPiso(piso piso) {
        this.piso = piso;
    }

    public int getMomento() {
        return momento;
    }

    public void setMomento(int momento) {
        this.momento = momento;
    }
    
    
}
