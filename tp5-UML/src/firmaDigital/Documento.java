/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firmaDigital;

/**
 *
 * @author jessi
 */

import java.util.Date;

public class Documento {
    private String titulo;
    private String contenido;
    private firmaDigital firma; 
    
    public Documento(String titulo, String contenido, String hashFirma, Date fechaFirma, Usuario usuarioFirmante) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new firmaDigital(hashFirma, fechaFirma, usuarioFirmante); 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public firmaDigital getFirma() {
        return firma; 
    }
}
