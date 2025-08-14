/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava1;

import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class ScannerJava {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        int edad = input.nextInt();
        
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }
}
