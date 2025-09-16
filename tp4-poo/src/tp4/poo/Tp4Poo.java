/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4.poo;

/**
 *
 * @author jessi
 */
public class Tp4Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(10001, "Agustin Monardes", "Programador", 5000);
        System.out.println("Mostrando la informacion del empleado 1:");
        System.out.println(e1.toString());
        
        Empleado e2 = new Empleado("Juan Perez", "Desarrollador senior", 9000);
        System.out.println("\nMostrando la informacion del empleado 2, con constructor con id automatico:");
        System.out.println(e2.toString());

        Empleado e3 = new Empleado("Eugenia Lopez", "Analista de sistemas", 10000);
        System.out.println("\nMostrando total de empleados: ");
        System.out.println("Total de empleados: " + Empleado.mostrarEmpleados());
        
        System.out.println("\nActualizando el salario de " + e1.getNombre() + " en un monto fijo: ");
        System.out.println("Salario de " + e1.getNombre() + " antes del aumento: " + e1.getSalario());
        e1.actualizarSalario(2000);
        System.out.println("Salario de " + e1.getNombre() + " despues del aumento " + e1.getSalario());
        
        System.out.println("\nActualizando el salario de " + e3.getNombre() + " en base a un porcentaje: ");
        System.out.println("Salario de " + e3.getNombre() + " antes del aumento: " + e3.getSalario());
        e3.actualizarSalario(12);
        System.out.println("Salario de " + e3.getNombre() + " despues del aumento porcentual: " + e3.getSalario());
        
        System.out.println("\nMostrando informacion final de todos los empleados: ");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println("\nTotal de empleados: " + Empleado.mostrarEmpleados());
    }   
}