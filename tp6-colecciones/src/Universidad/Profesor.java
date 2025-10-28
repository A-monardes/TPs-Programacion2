/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author jessi
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso c) {
        if (c != null && !this.cursos.contains(c)) {
            this.cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && this.cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.printf("El profesor %s (ID: %s) no dicta cursos actualmente.\n", nombre, id);
            return;
        }
        System.out.printf("Cursos dictados por %s (Total: %d) ---\n", nombre, cursos.size());
        for (Curso c : cursos) {
            System.out.printf("  - [%s] %s\n", c.getCodigo(), c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.printf("Profesor ID: %s | Nombre: %s | Especialidad: %s | Cursos asignados: %d\n", id, nombre, especialidad, cursos.size());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
