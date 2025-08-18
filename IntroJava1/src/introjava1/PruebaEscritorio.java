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
public class PruebaEscritorio {
        public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double resultado = a / b;
        System.out.println("Resultado: " + resultado);
        
            Scanner scan = new Scanner (System.in);
            int contador = 0;
            int total = 5;
            int i = 0;
            int num;
            
            while  (i<total){
                System.out.println("Ingrese: ");
                num = scan.nextInt();
                    if(num>0){
                        contador++;
                    }
                    i++;
                }
            System.out.println("Cantiad de números positivos:  " + contador);
            }
        
        }
    


