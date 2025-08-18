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
public class Contador {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num,contp=0, contn=0, cero=0;
            
            for (int i = 0; i < 10; i++) {
                System.out.println("Ingrese un número entero: ");
                num = input.nextInt();
                
                if(num>0){
                    contp++;
                }else if(num<0){
                    contn++;
                }else{
                    cero++;
                }
            }
            
            System.out.println("Resultados:\nPositivos: " + contp + "\nNegativos: " + contn + "\nCeros: " + cero);
        }
}
