/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.fabricamain;

/**
 *
 * @author Gabriel
 */
public class makeVehicle {
    private Toyota toyota;
    private Honda honda;
     public IVehicleMaker getInstace(String fabricante){
         if(fabricante.equals("honda")){
          if(honda==null){
              honda = new Honda();
          }
          return (IVehicleMaker) honda;
      }
      else{
          if(toyota==null){
              toyota = new Toyota();
          }
          return (IVehicleMaker) toyota;
      }
     }
}
