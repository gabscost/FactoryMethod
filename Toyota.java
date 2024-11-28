/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.fabricamain;

/**
 *
 * @author Gabriel
 */
public class Toyota implements IVehicleMaker{

    @Override
    public IVehicle makeVehicle(String modelo) {
       if(modelo.equals("Corolla")){
            return new Corolla();
        }else if(modelo.equals("Hilux")){
            return new Hilux();
        }else if( modelo.equals("Etios")){
            return new Etios();
        }
    }
    
}
