/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas2;

/**
 *
 * @author jessi
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public Mascota (String nombre, String especie, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios(){
        this.edad+=1;
        System.out.println("Ahora " + nombre + " tiene " + edad + "años");        
    }
}
