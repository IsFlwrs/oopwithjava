/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtables;
import java.util.Scanner;

/**
 *
 * @author jaciel
 */
public class Multiplicationtables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define scanner
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();
        
        // instance Object
        TableProduct object = new TableProduct();
        // Set number attribute
        object.number = n;
        // Call product method
        object.product();
    }
    
}
