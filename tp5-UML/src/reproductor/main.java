/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {  
        Artista artista = new Artista("Soda Stereo", "Rock");
        
        Cancion bohemian = new Cancion("Persiana americana", artista);

        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(bohemian); 
    }
}
