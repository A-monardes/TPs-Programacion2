/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EditorVideo;

/**
 *
 * @author jessi
 */
public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        Render nuevoRender = new Render(formato, proyecto);
        
        System.out.println("Exportando archivo: " + proyecto.getNombre() + " - " + formato);
        return nuevoRender;
    }
}