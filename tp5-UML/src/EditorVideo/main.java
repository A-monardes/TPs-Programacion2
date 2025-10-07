/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditorVideo;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Proyecto_2025", 2.5);
        EditorVideo editor1 = new EditorVideo();
        
        Render render1 = editor1.exportar("mp4", proyecto1); 
                
        System.out.println("Render en formato: " + render1.getFormato());
        System.out.println("Proyecto: " + render1.getProyecto().getNombre()); 
        System.out.println("Duración original: " + render1.getProyecto().getDuracionMin() + " minutos");
    }
}
