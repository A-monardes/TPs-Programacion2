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
public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto para convertir a entero");
        String textoAConvertir = scan.nextLine();

        try {
            int textoConvertido = Integer.parseInt(textoAConvertir);
            System.out.println("El número convertido es: " + textoConvertido);
        } catch (NumberFormatException ex) {
            System.out.println("Error: no es un número entero válido.");
        }
    }
}
