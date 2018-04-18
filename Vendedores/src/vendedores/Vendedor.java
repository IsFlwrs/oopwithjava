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
public class Vendedor {
    String name;
    String[] mounth_name = {
        "Enero",
        "Febrero",
        "Marzo",
        "Abril",
        "Mayo",
        "Junio",
        "Julio",
        "Agosto",
        "Septiembre",
        "Octubre",
        "Noviembre",
        "Diciembre",
    };
    float[] sales = new float[12];
    float total_sales = 0;
    
    public Vendedor(){
        for (int i = 0; i < 11; i++)
            this.sales[i] = 0;
    }
    
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
    public float set_sales(){
        this.total_sales = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++){
            System.out.println("Ventas en el mes de " + this.mounth_name[i]);
            this.sales[i] = sc.nextFloat();
            this.total_sales += this.sales[i];
        }
        return this.total_sales;
    }
    public void get_sales(){
        System.out.println("Ventas del vendedor: " + this.name);
        for (int i = 0; i < 12; i++)
            System.out.println(this.mounth_name[i] + ": " + this.sales[i]);
        
        
        System.out.println("Ventas en el anio de " + this.name + ": " + this.total_sales);
    }
    public float get_total_Sales(){
        return this.total_sales;
    }
}
