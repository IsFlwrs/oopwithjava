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
public class DeviceFeature {
    protected Integer speed;
    protected String unit_speed;
    protected Integer cpu_units;
    protected Integer ram;
    protected String unit_ram;
    protected Integer storage;
    protected String unit_storage;
    
    public DeviceFeature(
            Integer speed,
            String unit_speed,
            Integer cpu_units,
            Integer ram,
            String unit_ram,
            Integer storage,
            String unit_storage
    ){
        this.speed = speed;
        this.unit_speed = unit_speed;
        this.cpu_units = cpu_units;
        this.ram = ram;
        this.unit_ram = unit_ram;
        this.storage = storage;
        this.unit_storage = unit_storage;
    }
    
    
}
