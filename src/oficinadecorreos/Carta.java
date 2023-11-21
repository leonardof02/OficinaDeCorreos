package oficinadecorreos;

public class Carta extends Correspondencia {
    
    String fechaEnvio;
    boolean esDelExterior;

    public Carta(String fechaEnvio, boolean esDelExterior, String nombre, String direccionDestinatario, String nombreRemitente) {
        super(nombre, direccionDestinatario, nombreRemitente);
        this.fechaEnvio = fechaEnvio;
        this.esDelExterior = esDelExterior;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public boolean isEsDelExterior() {
        return esDelExterior;
    }

    public void setEsDelExterior(boolean esDelExterior) {
        this.esDelExterior = esDelExterior;
    }
    
    @Override
    public double cacularPrecio() {
        
        return 0;
    }

    @Override
    public String toString() {
        return "Carta{" + "fechaEnvio=" + fechaEnvio + ", esDelExterior=" + esDelExterior + '}';
    }
}
