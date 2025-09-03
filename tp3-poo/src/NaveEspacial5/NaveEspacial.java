/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NaveEspacial5;

/**
 *
 * @author jessi
 */
public class NaveEspacial {
    
    private final int CAPACIDAD_MAXIMA = 100;
    private String nombre;
    private int combustible;
    
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible=combustible;
    }
    
    public void despegar(){
        if(combustible >=5){
            combustible-=5;
            System.out.println("\nLa nave " + nombre + " despego. Combustible restante: " + combustible);
        }else{
            System.out.println("Combustible insuficiente para despegar.");
        }
    }
    
    public void avanzar(int distancia){
        int combustibleNecesario = distancia/20;
        if(combustible >= combustibleNecesario){
            combustible -= combustibleNecesario;
            System.out.println("\nLa nave " + nombre + " avanzo " + distancia + " kilometros. Combustible restante: " + combustible + " unidades");
        }else{
            System.out.println("\nCombustible insuficiente, se necesita " + combustibleNecesario + " unidades para avanzar " + distancia + " kilometros.");
        }
    }
    
    public void recargarCombustible(int cantidad){
        int combustibleActual = combustible + cantidad;
        if(combustibleActual <= CAPACIDAD_MAXIMA){
            combustible = combustibleActual;
            System.out.println("\nCombustible recargado. La nave " + nombre + " ahora tiene " + combustible + " unidades de combustible");
        }else{
            System.out.println("\nNo puede recargarse el combustible, se superaria la cantidad maxima.\nCombustible actual: " + combustible + ".\n Limite maximo: " + CAPACIDAD_MAXIMA);
        }
    }
    
    public void mostrarEstado(){
        System.out.println("\nNombre de la nave: " + nombre);
        System.out.println("Combustible: " + combustible + " de " + CAPACIDAD_MAXIMA);
    }
}
