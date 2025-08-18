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
public class Operaciones {
        public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero: ");
        int num1 = input.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        int num2 = input.nextInt();
        
        int suma = num1+num2;
        int resta = num1-num2;
        int mult = num1*num2;
        int div = num1/num2;
        
        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + mult + "\nDivisión: " + div);
        }
}
