/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Vehiculo;

/**
 *
 * @author docente
 */
public class ControlVehiculo {
   private static Vehiculo[] vehiculos=new Vehiculo[6];

    public ControlVehiculo() {
        vehiculos[0]=new Vehiculo("AGB-123", "FORD", "Habilitado");
         vehiculos[1]=new Vehiculo("SRF-432", "KIA", "Deshabilitado");
          vehiculos[2]=new Vehiculo("TYY-423", "MAZDA", "Habilitado"); 
          vehiculos[3]=new Vehiculo("JJD-777", "BMW", "Deshabilitado");
           vehiculos[4]=new Vehiculo("IJS-727", "FORD", "Habilitado");
            vehiculos[5]=new Vehiculo("JQW-838", "AUDI", "Habilitado");
          
    }

   public Vehiculo consultarV(String p){
       Vehiculo v=new Vehiculo();
       for(int i=0;i<getVehiculos().length;i++){              
            if(getVehiculos()[i].getPlaca().equals(p)){
                v=getVehiculos()[i];break;
            }           
        }
       return v;
   }
   
   
    /**
     * @return the vehiculos
     */
    public static Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    /**
     * @param aVehiculos the vehiculos to set
     */
    public static void setVehiculos(Vehiculo[] aVehiculos) {
        vehiculos = aVehiculos;
    }
    
    
}
