/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import modelo.Cubiculo;
import modelo.Vehiculo;
import practica2.VCubiculo;

/**
 *
 * @author docente
 */
public class ControlCubiculo {
   private static VCubiculo[][] cubiculos=new VCubiculo[2][3];

    /**
     * @return the cubiculos
     */
    public static VCubiculo[][] getCubiculos() {
        return cubiculos;
    }

    /**
     * @param aCubiculos the cubiculos to set
     */
    public static void setCubiculos(VCubiculo[][] aCubiculos) {
        cubiculos = aCubiculos;
    }

    public ControlCubiculo() {
    Cubiculo c=new Cubiculo("C001", "Libre");  
    VCubiculo vc=new VCubiculo();
    vc.setCubiculo(c);    
    cubiculos[0][0]=vc;
    
    Cubiculo c1=new Cubiculo("C002", "Libre");
    VCubiculo vc1=new VCubiculo();
    vc1.setCubiculo(c1);    
    cubiculos[0][1]=vc1;
    
    Cubiculo c2=new Cubiculo("C003", "Libre");
    VCubiculo vc2=new VCubiculo();
    vc2.setCubiculo(c2);    
    cubiculos[0][2]=vc2;
    
    Cubiculo c3=new Cubiculo("C004", "Libre");
    VCubiculo vc3=new VCubiculo();
    vc3.setCubiculo(c3);    
    cubiculos[1][0]=vc3;
       
    Cubiculo c4=new Cubiculo("C005", "Libre");
    VCubiculo vc4=new VCubiculo();
    vc4.setCubiculo(c4);    
    cubiculos[1][1]=vc4;
    
    Cubiculo c5=new Cubiculo("C006", "Libre");
    VCubiculo vc5=new VCubiculo();
    vc5.setCubiculo(c5);    
    cubiculos[1][2]=vc5;
       
    }

    public void quitar(Cubiculo c){
        if(c.estadoCubiculo()){
            JOptionPane.showMessageDialog(null, "Hey el cubiculo esta libre");              
          }else{
              c.setVehiculo(new Vehiculo());
              c.setEstado("Libre");
          } 
    }
    
   public void agregarV(Vehiculo v,Cubiculo c){
      if(v.estadoVehiculo()){
          if(c.estadoCubiculo()){
              c.setVehiculo(v);
              c.setEstado("Ocupado");
          }else{
              JOptionPane.showMessageDialog(null, "Hey el cubiculo esta ocupado");
          }          
      } else{
          JOptionPane.showMessageDialog(null, "Hey el vehiculo no esta habilitado");
      }
   }
   

}
