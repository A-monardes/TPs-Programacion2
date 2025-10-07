/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorQr;

/**
 *
 * @author jessi
 */
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Usuario cliente1 = new Usuario("Agustin Monardes", "agustin@mail.com");

        GeneradorQR generador1 = new GeneradorQR();
        
        CodigoQR qrGenerado = generador1.generar("enlace..." + cliente1.getNombre(), cliente1); 
        
        System.out.println("Valor del QR: " + qrGenerado.getValor().substring(0, 30));
        
        System.out.println("QR asociado a: " + qrGenerado.getUsuario().getNombre()); 
    }
}
