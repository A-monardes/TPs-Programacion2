/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorQr;

/**
 *
 * @author jessi
 */
public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        
        System.out.println("Código QR creado con valor: " + nuevoCodigo.getValor());
        return nuevoCodigo;
    }
}
