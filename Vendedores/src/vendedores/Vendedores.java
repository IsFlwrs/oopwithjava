/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedores;

import java.util.Scanner;

/**
 *
 * @author jaciel
 */
public class Vendedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int array_size;
        float total_sales = 0;
        String name;
        System.out.print("Ingresa cuantos vendedores deseas capturar: ");
        array_size = sc.nextInt();
        Vendedor[] vendedores_instance = new Vendedor[array_size];

        for (int i = 0; i < array_size; i++){
            vendedores_instance[i] = new Vendedor();
            System.out.print("Ingresa nombre del vendedor " + (i + 1) + ": ");
            if (i == 0)
                sc.nextLine();
            name = sc.nextLine();
            vendedores_instance[i].set_name(name);
            total_sales += vendedores_instance[i].set_sales();
        }
        
        System.out.println("***   VENTAS TOTALES   ***");
        for (int i  = 0; i < array_size; i++)
            vendedores_instance[i].get_sales();
        
        System.out.println("***   VENTAS TOTALES: " + total_sales);
    }
    
}
