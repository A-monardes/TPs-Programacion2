/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosExcepciones;

import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class MainEdadExcepcion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una edad: ");
        int edad = Integer.parseInt(scan.nextLine());
        
        if (edad <= 0 || edad >= 120) {
            throw new EdadException("Edad invalida");
        }
    }
}
