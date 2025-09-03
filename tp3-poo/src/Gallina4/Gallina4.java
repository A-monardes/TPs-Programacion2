/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gallina4;

/**
 *
 * @author jessi
 */
public class Gallina4 {
            public static void main(String[] args) {
                
            Gallina gallina1 = new Gallina(00001, 5);
            Gallina gallina2 = new Gallina(00002, 3);
            
            System.out.println("Estado inicial de las gallinas: ");
            gallina1.mostrarEstado();
            gallina2.mostrarEstado();
            
            //Haciendo que gallina1 ponga huevos y envejezca
            gallina1.ponerHuevo();
            gallina1.envejecer();
            gallina1.ponerHuevo();
            
            //Haciendo que gallina2 ponga huevos y envejezca
            gallina2.envejecer();
            gallina2.ponerHuevo();
            
            System.out.println("\nEstado final de las gallinas: ");
            gallina1.mostrarEstado();
            gallina2.mostrarEstado();
    }
}
