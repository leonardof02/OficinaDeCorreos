
package oficinadecorreos;

public abstract class Correspondencia {
    
    String nombre;
    String direccionDestinatario;
    String nombreRemitente;
    
    public Correspondencia(String nombre, String direccionDestinatario, String nombreRemitente) {
        this.nombre = nombre;
        this.direccionDestinatario = direccionDestinatario;
        this.nombreRemitente = nombreRemitente;
    }
    
    
    
}
