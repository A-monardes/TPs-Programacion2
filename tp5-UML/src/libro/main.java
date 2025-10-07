/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Jose Hernandez","Argentino");
        Editorial editorial1 = new Editorial("Clasicos Argentinos","Av. San Martin 123");
        
        Libro martinFierro = new Libro(
            "Martin Fierro", 
            "123-3-11-222222-0", 
            autor1,
            editorial1
        );
        
        System.out.println(martinFierro);
        System.out.println("\nLa editorial existe: " + editorial1.getNombre());
    }
}
