/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras2;
import java.util.Scanner;

/**
 * Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
* 
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
* 
 * @author jessi
 */
public class ActualizarStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nuevoStock;
        
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();
        
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();
        
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es " + nuevoStock   );
    }
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int NuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return NuevoStock;
    }
}
