/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerfeature;

import java.util.Scanner;

/**
 *
 * @author jaciel
 */
public class ComputerFeature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size;
        System.out.print("Ingresa cuantos dispositivos deseas capturar: ");
        array_size = sc.nextInt();
        Device[] device_instances = new Device[array_size];
        
        Integer speed;
        String unit_speed;
        Integer cpu_units;
        Integer ram;
        String unit_ram;
        Integer storage;
        String unit_storage;
        String type;
        Integer cost;
        
        for (int i = 0; i < array_size; i++){
            System.out.print("\n\nIngresa costo del dispositivo: ");
            cost = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingresa tipo de dispositivo (celular, tablet, laptop, desktop): ");
            type = sc.nextLine();
            
            System.out.print("Ingresa velocidad del dispositivo: ");
            speed = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingresa unidad de medida de la velocidad (MHz, GHz): ");
            unit_speed = sc.nextLine();
            
            System.out.print("Ingresa numero de unidades CPUs: ");
            cpu_units = sc.nextInt();
            
            System.out.print("Ingresa cantidad de RAM: ");
            ram = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingresa unidad de medida de la RAM (MB, GB): ");
            unit_ram = sc.nextLine();
            
            System.out.print("Ingresa cantidad de almacenamiento: ");
            storage = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingresa unidad de medida del almacenamiento (MG, GB, TB): ");
            unit_storage = sc.nextLine();
            
            device_instances[i] = new Device(
                    speed,
                    unit_speed,
                    cpu_units,
                    ram,
                    unit_ram,
                    storage,
                    unit_storage,
                    type,
                    cost
            );
        }
        
        for (int i = 0; i < array_size; i++)
            device_instances[i].show_device_features();
    }
    
}
