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
public class prestamo {
    
    private double valor;
    private double interes;
    private double plazo;
    private asociado a1;

    public prestamo(double valor, double interes, double plazo, asociado a1) {
        this.valor = valor;
        this.interes = interes;
        this.plazo = plazo;
        this.a1 = a1;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public asociado getA1() {
        return a1;
    }

    public void setA1(asociado a1) {
        this.a1 = a1;
    }
    
    
}
