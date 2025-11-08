/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosExcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jessi
 */
public class TryWithResources {
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\jessi\\Desktop\\UTN\\Programacion II\\Tps-programacion2\\tp8-excepciones\\src\\ejerciciosExcepciones\\hola.txt");
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            System.out.println(br.readLine());
        } catch (IOException ex) {
            System.out.println("Error de E/S: " + ex.getMessage());
        }
    }
}
