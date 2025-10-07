/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancaria;

/**
 *
 * @author jessi
 */
import java.util.List;
import java.util.ArrayList;

public class Titular {
    private String nombre;
    private String dni;
    private List<CuentaBancaria> cuentas;
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentas = new ArrayList<>();
    }
    
    public void agregarCuenta(CuentaBancaria cuenta) {
        this.cuentas.add(cuenta);
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}
