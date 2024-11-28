/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotcom.fabricamain;

/**
 *
 * @author Gabriel
 */
public class VehicleMaker implements IVehicleMaker {
    // Singleton: Garantindo uma única instância da fábrica
     private static VehicleMaker instance;

    @Override
    public IVehicle makeVehicle(String modelo) {
        System.out.println("modelo");
    }
   
}
