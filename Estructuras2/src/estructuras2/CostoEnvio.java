/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras2;
import java.util.Scanner;
/**
 * Composición de funciones para calcular costo de envío y total de compra.
 * 
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
*   
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
* 
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
 *
 * @author jessi
 */
public class CostoEnvio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double costoEnvio, totalCompra;
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        
        System.out.println("Ingrese el peso del paquete (kilogramos): ");
        double peso = input.nextDouble();
        
        System.out.println("Ingrese la zona del envio: \n1-Nacional\n2-Internacional");
        int zona = input.nextInt();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        
        totalCompra = calcularTotalCompra(precio, costoEnvio);
        
        System.out.println("El costo del envio es de " + costoEnvio);
        System.out.println("El total a pagar es de " + totalCompra);
    }
    
    public static double calcularCostoEnvio(double peso, int zona){
        double costoEnvio;
        if(zona==1){
            costoEnvio = peso*5;
        }else{
            costoEnvio = peso*10;
        }
        return costoEnvio;
    }
    
    public static double calcularTotalCompra(double precio, double costoEnvio){
        double totalCompra = precio + costoEnvio;
        return totalCompra;
    }
}
