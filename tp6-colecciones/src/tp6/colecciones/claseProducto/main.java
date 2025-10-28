/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6.colecciones.claseProducto;

/**
 *
 * @author jessi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P1", "Televisor X", 250000.00, 50, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P2", "Sábanas", 15000.50, 20, CategoriaProducto.HOGAR);
        Producto p3 = new Producto("P3", "Pantalón de Jean", 120000.99, 100, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P4", "Leche entera", 800.75, 500, CategoriaProducto.ALIMENTOS);
        Producto p5 = new Producto("P5", "Televisor LED 50 pulgadas", 400000.00, 15, CategoriaProducto.ELECTRONICA);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        inventario.listarProductos();

        System.out.println("\nBuscar por ID: ");
        Producto buscado = inventario.buscarProductoPorId("P3");
        if (buscado != null) {
            System.out.print("Producto encontrado: ");
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto con ID P3 no encontrado.");
        }

        System.out.println("\nFiltrar por categoria:");
        inventario.filtrarPorCategoria(CategoriaProducto.ROPA).forEach(Producto::mostrarInfo);

        System.out.println("\nEliminar producto con ID:");
        if (inventario.eliminarProducto("P4")) {
            System.out.println("Producto P4 eliminado.");
        } else {
            System.out.println("Error al eliminar el producto P4.");
        }
        inventario.listarProductos();

        System.out.println("\nActualizar stiock:");
        if (inventario.actualizarStock("P1", 10)) {
            System.out.println("Stock de P1 actualizado a 10.");
            inventario.buscarProductoPorId("P1").mostrarInfo();
        }

        System.out.println("\nStock disponible:");
        System.out.println("Stock total: " + inventario.obtenerTotalStock());

        System.out.println("\nProducto con mayor stock:");
        Producto mayor = inventario.obtenerMayorStock();
        if (mayor != null) {
            System.out.print("El producto con mayor stock es: ");
            mayor.mostrarInfo();
        }

        System.out.println("\nFiltrar por precio (100.000 - 300.000)");
        inventario.filtrarProductosPorPrecio(100000.00, 300000.00).forEach(Producto::mostrarInfo);

        inventario.mostrarCategoriasDisponibles();
    }
}
