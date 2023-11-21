package oficinadecorreos;

import java.util.ArrayList;

public class ControladorCorrespondencia {
    
    ArrayList<Correspondencia> listaCorrespondencia = new ArrayList<>();

    public ControladorCorrespondencia() {
        this.listaCorrespondencia = new ArrayList<>();
    }
    
    public ControladorCorrespondencia( ArrayList listaCorrespondencia ) {
        this.listaCorrespondencia = new ArrayList<>(listaCorrespondencia);
    }

    public ArrayList<Correspondencia> getListaCorrespondencia() {
        return listaCorrespondencia;
    }
    
    public void recibirCorrespondencia(Correspondencia correspondencia) {
        listaCorrespondencia.add(correspondencia);
    }
    
    public void despacharCorrespondenciaPorIndice(int indice) {
        listaCorrespondencia.remove(indice);
    }
    
    public void despacharCorrespondencia() {
        
        // Si esta vacia no retorna nada
        if( listaCorrespondencia.isEmpty() )
            return;
        
        // Despachar por prioridad
        if( removerTelegrama() != null )
            return;
        if( removerCarta() != null )
            return;
        
        removerBultoPostal();
    }
    
    public Telegrama removerTelegrama() {
        Telegrama telegramaRemovido = null;
        for( Correspondencia c : listaCorrespondencia ) {
            if ( c instanceof Telegrama ) {
                telegramaRemovido = (Telegrama) c;
                listaCorrespondencia.remove(c);
            }
        }
        return telegramaRemovido;
    }
    
    public Carta removerCarta() {
        Carta cartaRemovida = null;
        for( Correspondencia c : listaCorrespondencia ) {
            if ( c instanceof Carta ) {
                cartaRemovida = (Carta) c;
                listaCorrespondencia.remove(c);
            }
        }
        return cartaRemovida;
        
    }
    
    public BultoPostal removerBultoPostal() {
        BultoPostal bultoRemovido = null;
        for( Correspondencia c : listaCorrespondencia ) {
            if ( c instanceof BultoPostal ) {
                bultoRemovido = (BultoPostal) c;
                listaCorrespondencia.remove(c);
            }
        }
        return bultoRemovido;
    }
    
    public void entregarCorrespondenciaADestinatario(String nombre, String direccionDestinatario) {
        this.listaCorrespondencia.removeIf(
            correspondencia -> 
                correspondencia.nombre.equals(nombre) &&
                correspondencia.direccionDestinatario.equals(direccionDestinatario)
        );
    }
    
    public double calcularGananciaTotal() {
        double gananciaTotal = 0;
        for( Correspondencia c : listaCorrespondencia )
            gananciaTotal += c.calcularPrecio();
        return gananciaTotal;
    }
}
