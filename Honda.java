/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.fabricamain;

/**
 *
 * @author Gabriel
 */
public class Honda implements IVehicleMaker{

    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals("Civic")){
            return new Civic();
        }else if(modelo.equals("City")){
            return new City();
        }else if( modelo.equals("Fit")){
            return new Fit();
        }
    }
    
}
