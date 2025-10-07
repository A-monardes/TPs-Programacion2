/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Perez", "ABC123456");

        Pasaporte pasaporte = new Pasaporte("123456789", "01/02/2020", "foto.jpg", "JPEG");

        pasaporte.setTitular(titular);
        titular.setPasaporte(pasaporte);

        System.out.println(titular);
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());

        System.out.println("\nInformación del Pasaporte:");
        System.out.println(pasaporte);
        System.out.println("Pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Información de la foto: " + pasaporte.getFoto());
    }
}
