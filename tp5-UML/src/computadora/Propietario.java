/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora;

/**
 *
 * @author jessi
 */
import java.util.List;
import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private String dni;
    
    private List<Computadora> computadoras;
    
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.computadoras = new ArrayList<>();
    }
    
    public void agregarComputadora(Computadora computadora) {
        this.computadoras.add(computadora);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }
}
