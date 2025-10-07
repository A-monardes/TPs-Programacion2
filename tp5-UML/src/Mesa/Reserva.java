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

public class Reserva {
    private Date fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
    public Reserva(Date fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;        
    }
    
    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
}
