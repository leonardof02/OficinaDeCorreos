package oficinadecorreos;

import java.time.LocalDate;

public class Carta extends Correspondencia {
    
    private LocalDate fechaEnvio;
    private boolean esDelExterior;

    public Carta(LocalDate fechaEnvio, boolean esDelExterior, String nombre, String direccionDestinatario, String nombreRemitente) {
        super(nombre, direccionDestinatario, nombreRemitente);
        this.fechaEnvio = fechaEnvio;
        this.esDelExterior = esDelExterior;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public boolean esDelExterior() {
        return esDelExterior;
    }

    public void setEsDelExterior(boolean esDelExterior) {
        this.esDelExterior = esDelExterior;
    }
    
    @Override
    public double calcularPrecio() {
           
        LocalDate hoy = LocalDate.now();
        double precio = 5;
        if( fechaEnvio.isBefore(hoy.minusDays(10)) )
            precio = 8;
        if( esDelExterior() ) precio += 3;
        return precio;
    }
    
    @Override
    public String toString() {
        return "Carta{" + "fechaEnvio=" + fechaEnvio + ", esDelExterior=" + esDelExterior + '}';
    }
}
