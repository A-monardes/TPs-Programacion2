/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular;

/**
 *
 * @author jessi
 */
public class main {
    public static void main(String[] args) {
        Bateria bateria1 = new Bateria("AA-BG566JPT", 4000);
        
        Usuario agustin = new Usuario("Agustin", "42899132");
        
        Celular celular1 = new Celular("111100009988","Motorola","Motorokr E8", bateria1);
        
        celular1.setUsuario(agustin);
        agustin.setCelular(celular1);
        
        System.out.println(agustin);
    }
}
