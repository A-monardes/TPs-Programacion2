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

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; 
    private Titular titular; 
    
    public CuentaBancaria(String cbu, double saldo, String codigoClave, Date fechaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion); 
        titular.agregarCuenta(this);
    }
    
    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }
}
