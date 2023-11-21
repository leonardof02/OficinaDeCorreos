package oficinadecorreos;

public class Telegrama extends Correspondencia {
    int cantidadPalabras;
    double impuestoAplicado;

    public Telegrama(int cantidadPalabras, double impuestoAplicado, String nombre, String direccionDestinatario, String nombreRemitente) {
        super(nombre, direccionDestinatario, nombreRemitente);
        this.cantidadPalabras = cantidadPalabras;
        this.impuestoAplicado = impuestoAplicado;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    public double getImpuestoAplicado() {
        return impuestoAplicado;
    }

    public void setImpuestoAplicado(double impuestoAplicado) {
        this.impuestoAplicado = impuestoAplicado;
    }    

    @Override
    public double calcularPrecio() {
        double precio = cantidadPalabras * 0.10 + impuestoAplicado;
        return precio;
    }
}
