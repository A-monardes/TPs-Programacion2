/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8.excepciones;

/**
 *
 * @author jessi
 */
        public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Cliente uno");
        Cliente c2 = new Cliente("Cliente dos");

        Pedido pedido = new Pedido("Pendiente", c1);
        Pedido pedido2 = new Pedido("Pendiente", c2);

        Producto p1 = new Producto("Computadora", 6500000);
        Producto p2 = new Producto("Televisor", 1000000);
        Producto p3 = new Producto("Celular", 800000);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p3);

        pedido.notificarEstado("En proceso");

        double total = pedido.calcularTotal();

        PayPal pago = new PayPal();

        pago.procesarPago(total);

        pedido.notificarEstado("Pagado");

        pedido2.agregarProducto(p2);

        pedido2.notificarEstado("En proceso");

        double total2 = pedido2.calcularTotal();

        TarjetaDeCredito pago2 = new TarjetaDeCredito();

        pago2.procesarPago(total2);

        pedido2.notificarEstado("Pagado");
    }
}
    
    

