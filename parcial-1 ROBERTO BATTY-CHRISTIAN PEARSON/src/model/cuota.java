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
public class cuota {
    
    private int Ncuota;
    private double valorCuota;
    private double valorPagar;
    private double saldo;
    private boolean pagada;
    private prestamo pres1;

    public cuota(int Ncuota, double valorCuota, double valorPagar, double saldo, boolean pagada, prestamo pres1) {
        this.Ncuota = Ncuota;
        this.valorCuota = valorCuota;
        this.valorPagar = valorPagar;
        this.saldo = saldo;
        this.pagada = pagada;
        this.pres1 = pres1;
    }

    public int getNcuota() {
        return Ncuota;
    }

    public void setNcuota(int Ncuota) {
        this.Ncuota = Ncuota;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public prestamo getPres1() {
        return pres1;
    }

    public void setPres1(prestamo pres1) {
        this.pres1 = pres1;
    }
    
    
    
    
}
