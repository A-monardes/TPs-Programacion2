/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.excepciones;

/**
 *
 * @author jessi
 */

import java.util.ArrayList;

public class Pedido implements Pagable{
    
    ArrayList<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(String estado, Cliente cliente) {
        this.estado = estado;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
            for (Producto p : productos) {
            total += p.getPrecio();
            }
            return total;    
    }
    
    public void notificarEstado(String nuevoestado) {
        this.estado = nuevoestado;
        cliente.notificarCambioDeEstado(nuevoestado);
    }
}
