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
public class Division {
        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Ingrese el primer número: ");
            int num1 = input.nextInt();
            
            System.out.println("Ingrese el segundo número: ");
            int num2 = input.nextInt();
            
            int resultado1 = num1/num2;
            
             System.out.println("Resultado entero: " + resultado1);
             
             double dnum1 = num1;
             double dnum2 = num2;
             
             double resultado2 = dnum1/dnum2;
            
             System.out.println("Resultado doble: " + resultado2);
             
        }
}
