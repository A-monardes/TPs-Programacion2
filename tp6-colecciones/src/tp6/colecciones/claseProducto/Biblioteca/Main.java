/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.colecciones.claseProducto.Biblioteca;

import java.util.List;

/**
 *
 * @author jessi
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Crear biblioteca:");
        Biblioteca biblio = new Biblioteca("Biblioteca central");
        System.out.println("Biblioteca '" + biblio.getNombre() + "' creada");

        System.out.println("\nCrear autores:");
        Autor a1 = new Autor("AUT001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("AUT002", "Agatha Christie", "Británica");
        Autor a3 = new Autor("AUT003", "Jorge Luis Borges", "Argentina");
        
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();
        
        System.out.println("\nAgregar libros:");
        biblio.agregarLibro("123-01", "Cien Años de Soledad", 1967, a1);
        biblio.agregarLibro("123-02", "Asesinato en el Orient Express", 1934, a2);
        biblio.agregarLibro("123-03", "Ficciones", 1944, a3);
        biblio.agregarLibro("123-04", "El Amor en Tiempos de Cólera", 1985, a1);
        biblio.agregarLibro("123-05", "Muerte en el Nilo", 1937, a2);

        biblio.listarLibros();

        System.out.println("\nBuscar por ISBNñ");
        Libro libroBuscado = biblio.buscarLibroPorIsbn("123-04");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado");
        }

        System.out.println("\nFiltrar libros por año (1934)");
        List<Libro> libros1934 = biblio.filtrarLibrosPorAnio(1934);
        if (!libros1934.isEmpty()) {
            System.out.println("Libros publicados en 1934:");
            libros1934.forEach(Libro::mostrarInfo);
        } else {
            System.out.println("No se encontraron libros publicados en 1934");
        }

        System.out.println("\nEliminar segun ISBN:");
        if (biblio.eliminarLibro("123-02")) {
            System.out.println("Libro con ISBN 123-02 eliminado");
        } else {
            System.out.println("No se encontró el libro para eliminar.");
        }
        biblio.listarLibros();

        System.out.println("\nTotal de libros:");
        System.out.println("Cantidad total de libros en la biblioteca: " + biblio.cantidadLibros());

        biblio.mostrarAutoresDisponibles();
    }
}
