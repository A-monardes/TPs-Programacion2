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
public class Validacion {
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             
             System.out.println("Ingrese una nota entre 0-10: ");
             int num;
             
             do {
                  num = input.nextInt();
                  if (num>10 ||  num<0) {
                    System.out.println("Nota inválida. Ingrese una nota entre 0 y 10");     
                 }
             } while (num>10 ||  num<0);
             
             System.out.println("Nota guardada correctamente");
         }
}
