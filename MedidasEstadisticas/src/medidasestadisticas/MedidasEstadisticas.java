/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidasestadisticas;

import java.util.Scanner;

/**
 *
 * @author jaciel
 */
public class MedidasEstadisticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size;
        System.out.print("Ingresa cuantos elementos deseas capturar: ");
        array_size = sc.nextInt();
        
        // TODO code application logic here
        Arreglo array_instance = new Arreglo(array_size);
        array_instance.set_arreglo();
        System.out.println("Promedio: " + array_instance.process_average());
        System.out.println("Moda: " + array_instance.process_mode());
        System.out.println("Varianza: " + array_instance.process_variance());
        
    }
    
}
