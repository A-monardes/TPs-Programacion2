/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras2;
import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class RepeticionSuma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num = input.nextInt();
        int cont = 0;
        
        while(num!=0){
            if(num%2==0){
                cont+=num;
            }
            System.out.println("Ingrese otro número o ingrese 0 para terminar: ");
            num = input.nextInt();
        }
        System.out.println("La suma de los números pares es de " + cont);
    }
}
