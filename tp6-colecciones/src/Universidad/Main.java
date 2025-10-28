/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author jessi
 */
public class Main {
    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN");

        Profesor p1 = new Profesor("P001", "Juan Lopez", "Algoritmos");
        Profesor p2 = new Profesor("P002", "Maria Suarez", "Estructuras de Datos");
        Profesor p3 = new Profesor("P003", "Grace Hopper", "Bases de Datos");

        Curso c1 = new Curso("C001", "Programación I");
        Curso c2 = new Curso("C002", "Bases de Datos I");
        Curso c3 = new Curso("C003", "Sistemas Operativos");
        Curso c4 = new Curso("C004", "Teoría de la Computación");
        Curso c5 = new Curso("C005", "Redes y Comunicación");

        System.out.println("Agregar profesores y cursos:");
        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        System.out.println("\nAsignar profesores:");
        utn.asignarProfesor("C001", "P001");
        utn.asignarProfesor("C002", "P003");
        utn.asignarProfesor("C003", "P001");
        utn.asignarProfesor("C004", "P002");
        

        System.out.println("\nListar cruzado:");
        utn.listarCursos();
        p1.listarCursos();
        p3.listarCursos();

        System.out.println("\nCambio de profesor:");
        utn.asignarProfesor("C003", "P002");
        
        p1.listarCursos();
        p2.listarCursos();
        utn.buscarCursoPorCodigo("C003").mostrarInfo();

        System.out.println("\nRemover curso (C004)");
        utn.eliminarCurso("C004");

        p2.listarCursos(); 
        utn.listarCursos(); 
        
        System.out.println("\nRemover profesor:");
        utn.eliminarProfesor("P003");

        utn.buscarCursoPorCodigo("C002").mostrarInfo(); 
        utn.listarProfesores();

        System.out.println("\nCursos por profesor:");
        utn.listarProfesores();
    }
}