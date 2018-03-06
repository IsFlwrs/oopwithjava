/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtables;

/**
 *
 * @author jaciel
 */
public class TableProduct {
    public int number = 0;
    
    public void product(){
        for(int i = 1; i <= 10; i++){
            System.out.println(this.number + " * " + i + " = " + this.number * i);
        }
    }
}
