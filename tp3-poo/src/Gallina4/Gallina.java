/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gallina4;

/**
 *
 * @author jessi
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int idGallina, int edad){
        this.idGallina=idGallina;
        this.edad=edad;
        this.huevosPuestos=0;
    }
    
    public void ponerHuevo(){
        this.huevosPuestos++;
        System.out.println("\nLa gallina " + idGallina + " puso un huevo. El total ha puesto " + this.huevosPuestos);
    }
    
    public void envejecer(){
        this.edad++;
        System.out.println("\nLa gallina " + idGallina + " cumplio años. En total tiene " + this.edad + " años");
    }
    
    public void mostrarEstado(){
        System.out.println("\nGallina " + idGallina + ": ");
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos puestos: " + this.huevosPuestos);
    }
}
