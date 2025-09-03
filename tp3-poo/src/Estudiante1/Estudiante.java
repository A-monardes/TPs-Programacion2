package Estudiante1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jessi
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.curso=curso;
        this.calificacion=calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Curso: " + this.curso);
        System.out.println("Calificación: " + this.calificacion);
    }
    
    public void subirCalificacion(double calificacion){
        if(this.calificacion + calificacion >10){
            this.calificacion=10;
            System.out.println("Calificacion maxima, tu calificacion es " + this.calificacion);
        }else{
            this.calificacion+=calificacion;
            System.out.println("Tu nueva calificacion es " + this.calificacion);
        }
    }
    
    public void bajarCalificacion(double calificacion){
        if(this.calificacion - calificacion < 0){
            this.calificacion=0;
            System.out.println("Calificacion minima, tu calificacion es " + this.calificacion);
        }else{
            this.calificacion -= calificacion;
            System.out.println("Tu nueva calificacion es " + this.calificacion);
        }
    }
}
