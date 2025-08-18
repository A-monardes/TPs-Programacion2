/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras2;

import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class Mayor {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int mayor, n1, n2;
        
        System.out.println("Ingrese el primer numero: ");
        mayor = input.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        n1=input.nextInt();
        if(n1>mayor){
            mayor=n1;
        }
        
        System.out.println("Ingrese el tercer numero: ");
        n2=input.nextInt();
        if(n2>mayor){
            mayor=n2;
        }
        
        System.out.println("El mayor número es " + mayor);
    }
}
