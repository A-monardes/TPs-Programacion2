/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.colecciones.claseProducto.Biblioteca;

/**
 *
 * @author jessi
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    public void mostrarInfo() {
        System.out.printf("   [Autor] ID: %s | Nombre: %s | Nacionalidad: %s\n", 
            id, nombre, nacionalidad);
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o){ 
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
                return false;
         }
        Autor autor = (Autor) o;
        return id.equals(autor.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
