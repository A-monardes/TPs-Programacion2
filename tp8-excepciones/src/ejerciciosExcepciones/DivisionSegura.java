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
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;

        System.out.println("Ingrese dos numeros");
        System.out.println("Numero uno: ");
        num1 = scan.nextDouble();

        System.out.println("Numero dos:");
        num2 = scan.nextDouble();

        try {
            if (num2 == 0) {
                throw new ArithmeticException("No se puede dividir por 0");
            }
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
