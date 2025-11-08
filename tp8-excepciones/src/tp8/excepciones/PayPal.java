/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.excepciones;

/**
 *
 * @author jessi
 */
public class PayPal implements pagoConDescuento{

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.15);
    }

    @Override
    public void procesarPago(double monto) {
        double total = aplicarDescuento(monto);
        System.out.println("Total con descuento: " + total);
        System.out.println("Pago realizado con exito");
    }
    
}
