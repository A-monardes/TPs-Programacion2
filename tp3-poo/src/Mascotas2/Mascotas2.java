/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mascotas2;

/**
 *
 * @author jessi
 */
public class Mascotas2 {
        public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Choco", "Perro", 5);
    
        System.out.println("Informacion inicial: ");
        mascota1.mostrarInfo();
        
        mascota1.cumplirAnios();
        
        System.out.println("Informacion actualizada: ");
        mascota1.mostrarInfo();
        }
}
