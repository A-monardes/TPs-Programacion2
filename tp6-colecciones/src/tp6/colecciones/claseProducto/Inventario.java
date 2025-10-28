/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.colecciones.claseProducto;

/**
 *
 * @author jessi
 */
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            this.productos.add(p);
            System.out.println("Producto " + p.getId() + " agregado.");
        } else {
            System.out.println("Error: El ID " + p.getId() + " ya existe.");
        }
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("\n--- Listado Completo de Productos ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

public Producto obtenerMayorStock() {
    if (productos.isEmpty()) {
        return null;
    }
    Producto  mayorStock = productos.get(0);
    for (int i = 1; i < productos.size(); i++) {
        Producto actual = productos.get(i);
        if (actual.getCantidad() > mayorStock.getCantidad()) {
            mayorStock = actual;
        }
    }
    return mayorStock;
}

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- Categorías Disponibles ---");
        for (CategoriaProducto cate : CategoriaProducto.values()) {
            System.out.printf("- %s: %s\n", cate.name(), cate.getDescripcion());
        }
    }
}
