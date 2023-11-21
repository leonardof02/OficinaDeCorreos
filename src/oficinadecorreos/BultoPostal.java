package oficinadecorreos;


public class BultoPostal extends Correspondencia {
    
    double peso;
    Urgencia urgencia;

    public BultoPostal(double peso, Urgencia urgencia, String nombre, String direccionDestinatario, String nombreRemitente) {
        super(nombre, direccionDestinatario, nombreRemitente);
        this.peso = peso;
        this.urgencia = urgencia;
    }
    

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(Urgencia urgencia) {
        this.urgencia = urgencia;
    }

    @Override
    public double calcularPrecio() {
        double precio = peso * 4;
        if(urgencia == Urgencia.URGENTE) precio += 10;
        if(urgencia == Urgencia.MEDIO) precio += 8;
        return precio;
    }
}
