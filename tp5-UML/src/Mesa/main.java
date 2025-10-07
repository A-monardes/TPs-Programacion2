/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mesa;

/**
 *
 * @author jessi
 */
import java.util.Date; 

public class main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Agustin Monardes", "11-1234-5678");
        Mesa mesa1 = new Mesa(01, 01);
        
        Reserva reserva1 = new Reserva(new Date(), "20:00", cliente1, mesa1);
        
        System.out.println("Fecha/hora: " + reserva1.getFecha() + "/" + reserva1.getHora());
        System.out.println("Reserva a nombre de " + reserva1.getCliente().getNombre());
        System.out.println("Contacto: " + reserva1.getCliente().getTelefono());
        System.out.println("Mesa asignada: " + reserva1.getMesa().getNumero() + " - " + "Capacidad: " + reserva1.getMesa().getCapacidad());
    }
}
