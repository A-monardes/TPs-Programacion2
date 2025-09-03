/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NaveEspacial5;

/**
 *
 * @author jessi
 */
public class NaveEspacial5 {
            public static void main(String[] args) {
                
                NaveEspacial nave1 = new NaveEspacial("Nautilo", 50);
                
                //Estado incial
                nave1.mostrarEstado();
                
                //Despegando
                nave1.despegar();
                nave1.mostrarEstado();
                
                //Avanzar sin haber recargado
                nave1.avanzar(1000);
                
                //Recargando combustible
                //Recargando por encima del limite
                nave1.recargarCombustible(100);
                //Recargando correctamente
                nave1.recargarCombustible(40);
                
                //Avanzar correctamente
                nave1.avanzar(1000);
                
                //Mostrando estado final
                nave1.mostrarEstado();
            }
}
