/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras2;
import java.util.Scanner;

/**Cálculo de descuento especial usando variable global.
 * 
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
* 
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0
 *
 * @author jessi
 */
public class variableGlobal {
    public static final double DESCUENTO_ESPECIAL = 0.10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = input.nextDouble();
        
        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio){
       double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
       double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento aplicado es de " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
