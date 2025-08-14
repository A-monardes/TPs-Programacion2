/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introjava1;

/**
 *
 * @author jessi
 */
import java.util.Scanner;
public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        //String nombre = scanner.nextInt(); // ERROR
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
        
        /*El problema es que la variable "nombre" esta declarada como un string, pero se le trata de asignar
        una entrada con un valor de tipo integral. La solución que se implemento es simplemente cambiar el
        tipo de dato de la entrada que se intenta asignar a uno que coincida con el tipo de dato declarado 
        de la variable.*/
    }
}
