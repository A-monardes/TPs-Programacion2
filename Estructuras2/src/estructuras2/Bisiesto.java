/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras2;

import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio = input.nextInt();
        
        if (anio%4==0 && (anio%100!=0 || anio%400==0)) {
            System.out.println("Es año bisiesto");
        }else{
            System.out.println("No es año bisiesto");
        }
         
    }
    
}
