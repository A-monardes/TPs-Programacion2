/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo1;

/**
 *
 * @author jessi
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo){
        this.marca=marca;
        this.marca=modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + "\n Marca: " + marca);
    }
}
