/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.excepciones;

/**
 *
 * @author jessi
 */
public class TarjetaDeCredito implements Pago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Total: " + monto);
        System.out.println("Pago realizado con exito");
    }
    
}
