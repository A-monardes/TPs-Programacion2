/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {
        Propietario propietario1 = new Propietario("Agustin Monardes", "12345678");
        
        Computadora computadora1 = new Computadora("Commodore", "PC-1234", "1234-56", "Intel 123", propietario1);
        
        System.out.println("Marca de PC: " + computadora1.getMarca());
        System.out.println("Modelo de Placa Madre: " + computadora1.getPlacaMadre().getModelo()); 
        System.out.println("Propietario de la PC: " + computadora1.getPropietario().getNombre()); 
        System.out.println(propietario1.getNombre() + " tiene " +  propietario1.getComputadoras().size() + " computadora/s registrada/s."); 
    }
}
