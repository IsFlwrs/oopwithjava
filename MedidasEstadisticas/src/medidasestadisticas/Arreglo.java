/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidasestadisticas;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author jaciel
 */
public class Arreglo {
    
    private int array_size;
    private float[] arreglo;
    
    private float average = 0;
    private float variance = 0;
    private float mode = 0;

    
    
    
    public Arreglo(int array_size){
        this.array_size = array_size;
        this.arreglo = new float[this.array_size];
    }
    
    
    public void set_arreglo(){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < this.array_size; i++){
            System.out.print("Introduzca una cantidad para la posicion " + (i+1) + ": ");
            this.arreglo[i] = sc.nextFloat();
        }
    }
    
    public float process_average(){
        this.average = 0;
        for(int i = 0; i < this.array_size; i++){
            this.average += this.arreglo[i];         
        } 
        this.average = this.average / this.array_size;
        return this.average;
    }
    
    public float process_variance(){
        this.variance = 0;
        this.process_average();
        
        
        for (int i = 0; i < this.array_size; i++){
            this.variance += Math.pow(this.arreglo[i] - this.average, 2);
        }
        this.variance = this.variance / (this.array_size - 1);
        
        return this.variance;
    }
    
    public float process_mode(){
        this.mode = 0;
        
        Hashtable<Float, Integer> obtain_mode= new Hashtable<Float, Integer>();
        
        int major_number = 0;
        float major_number_pointer = this.arreglo[0];
        
        for(int i = 0; i < this.array_size; i++){
            if (obtain_mode.get(this.arreglo[i]) != null){
                obtain_mode.put(this.arreglo[i], obtain_mode.get(this.arreglo[i]) + 1);
            }else{
                obtain_mode.put(this.arreglo[i], 0);
            }         
        }
        
        for(Float key : obtain_mode.keySet()){
            if (obtain_mode.get(key) > major_number){
                major_number = obtain_mode.get(key);
                major_number_pointer = key;
            }
        }
        
        this.mode = major_number_pointer;
        
        return this.mode;
    }
    
    public void print_array(){
        System.out.println("Datos almacenados en un arreglo de tamanio " + this.array_size);
        for (int i = 0; i < this.array_size; i++)
            System.out.print(this.arreglo[i] + " ");
    }
}
