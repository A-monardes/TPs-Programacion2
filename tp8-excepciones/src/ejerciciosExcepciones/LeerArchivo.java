/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosExcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class LeerArchivo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del archivo txt: ");
        String nombre = scan.nextLine();
        
        try {
            File archivo = new File(nombre);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida");
            System.out.println(ex.getMessage());
        }
    }
}
