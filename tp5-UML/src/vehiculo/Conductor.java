/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author jessi
 */
import java.util.List;
import java.util.ArrayList;

public class Conductor {
    private String nombre;
    private String licencia;
    private List<Vehiculo> vehiculos; 
    
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
