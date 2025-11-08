/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosExcepciones;

/**
 *
 * @author jessi
 */
public class EdadException extends RuntimeException{
    public EdadException() {
    }

    public EdadException(String message) {
        super(message);
    }

    public EdadException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdadException(Throwable cause) {
        super(cause);
    }
}
