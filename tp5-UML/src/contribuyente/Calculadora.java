/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contribuyente;

/**
 *
 * @author jessi
 */
public class Calculadora {
    public void calcular(impuesto impuesto) {
        double montoFinal = impuesto.getMonto() * 1.20;
        
        System.out.println("Monto original: " + impuesto.getMonto());
        System.out.println("Monto final: " + montoFinal);
        System.out.println("Nombre del contribuyente: " + impuesto.getContribuyente().getNombre());
    }
}
