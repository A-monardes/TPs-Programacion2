/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro3;

/**
 *
 * @author jessi
 */
public class Libro3 {
        public static void main(String[] args) {
            Libro libro1 = new Libro("Neuromancer", "William Gibson", 1994);
            
            libro1.mostrarInfo();
            
            System.out.println("\nIntentando modificar el año: ");
            libro1.setAnioPublicacion(1850);
            
            System.out.println("\nIntentando modificar el año: ");
            libro1.setAnioPublicacion(2300);
            
            System.out.println("\nIntentando modificar el año de una manera valida: ");
            libro1.setAnioPublicacion(1984);
            
            System.out.println("\nMostrando información modificada: ");
            libro1.mostrarInfo();
        }
}
