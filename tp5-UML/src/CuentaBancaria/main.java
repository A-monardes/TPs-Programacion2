/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancaria;

/**
 *
 * @author jessi
 */
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Agustin Monardes", "12345678");
        
        CuentaBancaria cajaAhorro = new CuentaBancaria("1234567890123456789012",10000.50, "123A", new Date(), titular1);
        
        System.out.println("CBU: " + cajaAhorro.getCbu());
        System.out.println("Codigo de seguridad: " + cajaAhorro.getClave().getCodigo());
        System.out.println("\nTitular de la cuenta: " + cajaAhorro.getTitular().getNombre());
        System.out.println(titular1.getNombre() + " tiene " + titular1.getCuentas().size() + " cuenta/s registrada/s");
    }
}
