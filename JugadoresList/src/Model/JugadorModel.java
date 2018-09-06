/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.JugadorController;

/**
 *
 * @author Orlando Castilla
 */
public class JugadorModel {
    
    private String Nombre;
    private int Fecha_Nacimiento;
    private String Posicion;
    private double Estatura;

    public JugadorModel(String Nombre, int Fecha_Nacimiento, String Posicion, double Estatura) {
        this.Nombre = Nombre;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Posicion = Posicion;
        this.Estatura = Estatura;
    }

    public JugadorModel() {
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(int Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }
    
    
    
    
}
