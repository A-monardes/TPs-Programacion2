/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro3;

import java.time.LocalDate;

/**
 *
 * @author jessi
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.setAnioPublicacion(anioPublicacion);
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    
    public void setAnioPublicacion(int anio){
        if(anio >=1925 && anio <=2025){
            this.anioPublicacion = anio;
            System.out.println("Se actualizo el año de publicación. El nuevo año es: " + anio);
        }else{
            System.out.println("Error, el año de publicación esta por fuera de las leyes de derecho de autor. Debe ser entre 1925 y 2025.");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Año de publicación: " + this.getAnioPublicacion());
    }
}

