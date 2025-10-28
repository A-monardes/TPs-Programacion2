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

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Métodos de registro y búsqueda
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }
    
    public boolean asignarProfesor(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            System.out.printf("Curso %s asignado a profesor %s.\n", codigoCurso, idProfesor);
            return true;
        }
        System.out.printf("Curso o Profesor no encontrado.\n");
        return false;
    }

    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            Profesor profesor = curso.getProfesor();
            if (profesor != null) {
                profesor.getCursos().remove(curso); 
                curso.setProfesor(null);
            }
            cursos.remove(curso);
            System.out.printf("Curso %s eliminado de la Universidad.\n", codigo);
            return true;
        }
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.printf("Profesor %s eliminado de la universidad.\n", id);
            return true;
        }
        return false;
    }
    
    public void listarProfesores() {
        System.out.println("\nListar profesores:");
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        System.out.println("\nListar cursos:");
        cursos.forEach(Curso::mostrarInfo);
    }
}
