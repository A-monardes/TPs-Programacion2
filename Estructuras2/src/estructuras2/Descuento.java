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
public class Descuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precioFinal;
        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        input.nextLine();
        
        System.out.println("Ingrese la categoria del producto: ");
        char categoria = input.nextLine().toLowerCase().charAt(0);
        
        switch (categoria){
            case 'a':
                precioFinal = precio * 0.9;
                System.out.println("El precio original es de " + precio + ".\nEl descuento aplicado es de 10% (" + (precio*0.1) + ") y el precio final es de " + precioFinal);
                break;
            case 'b':
                precioFinal = precio * 0.85;
                System.out.println("El precio original es de " + precio + ".\nEl descuento aplicado es de 15% (" + (precio*0.15) + ") y el precio final es de " + precioFinal);
                break;
            case 'c':
                precioFinal = precio * 0.8;
                System.out.println("El precio original es de " + precio + ".\nEl descuento aplicado es de 20% (" + (precio*0.2) + ") y el precio final es de " + precioFinal);
                break;
            default:
                    
                System.out.println("Ingrese una categoria valida");
        }
    }
}
