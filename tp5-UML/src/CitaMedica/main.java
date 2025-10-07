/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CitaMedica;

/**
 *
 * @author jessi
 */

import java.util.Date;

public class main {
    public static void main(String[] args) {
    
        Paciente paciente1 = new Paciente("Agustin Monardes", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Gomez", "Cardiología");
        
        CitaMedica cita = new CitaMedica(new Date(), "16:30", paciente1, profesional1);
        
        System.out.println("Hora de la cita: " + cita.getHora());
        System.out.println("Cobertura: " + cita.getPaciente().getObraSocial());
        System.out.println("\nProfesional asignado: " + cita.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita.getProfesional().getEspecialidad());
    }
}
