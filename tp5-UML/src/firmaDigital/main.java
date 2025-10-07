/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firmaDigital;

/**
 *
 * @author jessi
 */
import java.util.Date;
public class main {
    public static void main(String[] args) {
    Usuario admin = new Usuario("Admin Principal", "admin@empresa.com");
    
    Documento documento1 = new Documento("Contrato", "Detalles", "a1b2c3", new Date(), admin );
    
    System.out.println("Documento: " + documento1.getTitulo());
    System.out.println("Codigo hash de la firma: " +  documento1.getFirma().getCodigoHash());
    System.out.println("Firmado por: " + documento1.getFirma().getUsuario().getNombre());
    System.out.println("Email: " + documento1.getFirma().getUsuario().getEmail());
    }
}
