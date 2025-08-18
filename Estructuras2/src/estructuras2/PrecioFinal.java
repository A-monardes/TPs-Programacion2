/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras2;
import java.util.Scanner;

/**
 * Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
 *
 * @author jessi
 */
public class PrecioFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioBase, impuesto, descuento, precioFinal;
        
        System.out.println("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();
        System.out.println("Ingrese el impuesto aplicado: ");
        impuesto = input.nextDouble();
        System.out.println("Ingrese el descuento: ");
        descuento = input.nextDouble();
        
        precioFinal = PrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es " + precioFinal);
    }
    
    public static double PrecioFinal(double precioBase, double impuesto, double descuento){
        double PrecioFinal = precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
        return PrecioFinal;
    }
}