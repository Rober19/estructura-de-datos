/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author docente
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String estado;//habilitado-deshabilitado

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String estado) {
        this.placa = placa;
        this.marca = marca;
        this.estado = estado;
    }

    public boolean estadoVehiculo(){
        if(this.estado.equals("Habilitado")){
            return true;
        }else{
            return false;
        }
    }
    
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
