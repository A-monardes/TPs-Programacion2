/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contribuyente;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {
        Contribuyente contribuyente1 = new Contribuyente("Agustin Monardes", "20-12345678-9");
        
        impuesto imp20porciento = new impuesto(1000.00, contribuyente1);

        Calculadora calc = new Calculadora();

        calc.calcular(imp20porciento);
    }
}
