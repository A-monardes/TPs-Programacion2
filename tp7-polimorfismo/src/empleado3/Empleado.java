/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado3;

/**
 *
 * @author jessi
 */
public class Empleado {
    public double calcularSueldo(Empleado e){
        if(e instanceof EmpleadoPlanta){
            return 1000000;
        }else if (e instanceof EmpleadoTemporal){
            return 800000;
        }else{
            return 0;
        }
    }
}
