/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerfeature;

/**
 *
 * @author jaciel
 */
public class Device extends DeviceFeature {
    
    private String type;
    private Integer cost;
    
    public Device(
            Integer speed,
            String unit_speed,
            Integer cpu_units,
            Integer ram,
            String unit_ram,
            Integer storage,
            String unit_storage,
            String type,
            Integer cost
    ){
         super(
                 speed,
                 unit_speed,
                 cpu_units,
                 ram,
                 unit_ram,
                 storage,
                 unit_storage
         );
         this.type = type;
         this.cost = cost;
    } 
    public void show_device_features(){
        System.out.println("\n\nDevice type: " + this.type);
        System.out.println("Device cost: " + this.cost);
        System.out.println("Device speed: " + this.speed + " " + this.unit_speed);
        System.out.println("Device CPUs: " + this.cpu_units);
        System.out.println("Device RAM: " + this.ram + " " + this.unit_ram);
        System.out.println("Device storage: " + this.storage + " " + this.unit_storage);
    }
}
