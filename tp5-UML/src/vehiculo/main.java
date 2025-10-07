/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Diesel V8", "MOTOR-1234");
        Conductor conductor1 = new Conductor("Agustin Monardes", "ABC-A123");
        
        Vehiculo vehiculo1 = new Vehiculo("ABC-123", "Ford 2025", motor1, conductor1);
        
        System.out.println("Vehiculo: " + vehiculo1.getModelo() + " (" + vehiculo1.getPatente() + ")");
        System.out.println("Tipo de Motor: " + vehiculo1.getMotor().getTipo());
        
        System.out.println("\nConductor: " + vehiculo1.getConductor().getNombre());
        
        System.out.println(conductor1.getNombre() + " tiene " + conductor1.getVehiculos().size() + " vehículo/s registrado/s");
        System.out.println("Patente registrada en Conductor: " + conductor1.getVehiculos().get(0).getPatente());
    }
}
