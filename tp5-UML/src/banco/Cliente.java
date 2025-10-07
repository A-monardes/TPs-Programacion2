/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author jessi
 */
import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    
    private List<TarjetaDeCredito> tarjetas;
    
    public Cliente(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetas = new ArrayList<>();
    }
    
    public void agregarTarjeta(TarjetaDeCredito tarjeta){
        this.tarjetas.add(tarjeta);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDni(){
        return dni;
    }
    
    public List<TarjetaDeCredito> getTarjetas(){
        return tarjetas;
    }
}
