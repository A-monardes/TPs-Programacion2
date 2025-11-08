/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8.excepciones;

/**
 *
 * @author jessi
 */
public class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambioDeEstado(String nuevoEstado) {
        System.out.println(nombre + " tu pedido ahora esta " + nuevoEstado);
    }
}
