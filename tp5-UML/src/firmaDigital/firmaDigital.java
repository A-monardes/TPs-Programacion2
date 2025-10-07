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

public class firmaDigital {
    private String codigoHash;
    private Date fecha;
    private Usuario usuario; 
    
    public firmaDigital(String codigoHash, Date fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
   public String getCodigoHash() {
        return codigoHash;
    }

    public Date getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
