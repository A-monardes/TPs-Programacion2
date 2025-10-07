/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author jessi
 */

public class main {
        public static void main(String[] args) {
            Banco banco1 = new Banco("Banco Central","12-12345678-9");
            
            Cliente cliente1 = new Cliente("Agustin Monardes",12345678);
            
            TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9123-4567", "20-06-2031", cliente1, banco1);
            
            System.out.println("La tarjeta pertenece a: " + tarjeta1.getCliente().getNombre());
            System.out.println(cliente1.getNombre() + " tiene " + cliente1.getTarjetas().size() + " tarjeta/s");
            System.out.println("La tarjeta fue emitida por: " + tarjeta1.getBanco().getNombre());
        }
}
