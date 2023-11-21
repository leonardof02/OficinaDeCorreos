
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }
    
    public abstract double calcularPrecio();
    
    @Override
    public String toString() {
        return "Correspondencia{" + "nombre=" + nombre + ", direccionDestinatario=" + direccionDestinatario + ", nombreRemitente=" + nombreRemitente + '}';
    }
    
}
