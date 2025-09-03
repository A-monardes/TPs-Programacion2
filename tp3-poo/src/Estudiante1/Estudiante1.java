package Estudiante1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones
 *
 * @author jessi
 */
public class Estudiante1 {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Agustin", "Monardes","Programacion 2",10);
        
        estudiante1.mostrarInfo();
        
        estudiante1.bajarCalificacion(2.5);
        
        estudiante1.subirCalificacion(2);
        
        estudiante1.mostrarInfo();
    }
}

