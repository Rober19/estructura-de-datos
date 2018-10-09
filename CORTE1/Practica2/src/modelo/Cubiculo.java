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
public class Cubiculo {
    private String codigo;
    private String estado;//Libre-Ocupado
    private Vehiculo vehiculo=new Vehiculo();

    public Cubiculo() {
    }

    public Cubiculo(String codigo, String estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

       public boolean estadoCubiculo(){
        if(this.estado.equals("Libre")){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
