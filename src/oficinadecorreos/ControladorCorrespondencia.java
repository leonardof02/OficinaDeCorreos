package oficinadecorreos;

import java.util.ArrayList;

public class ControladorCorrespondencia {
    
    private ArrayList<Correspondencia> listaCorrespondencia;

    public ControladorCorrespondencia() {
        this.listaCorrespondencia = new ArrayList<>();
    }
    
    public ControladorCorrespondencia( ArrayList listaCorrespondencia ) {
        this.listaCorrespondencia = new ArrayList<>();
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
                break;
            }
        }
        listaCorrespondencia.remove(telegramaRemovido);
        return telegramaRemovido;
    }
    
    public Carta removerCarta() {
        Carta cartaRemovida = null;
        for( Correspondencia c : listaCorrespondencia ) {
            if ( c instanceof Carta ) {
                cartaRemovida = (Carta) c;
                break;
            }
        }
        listaCorrespondencia.remove(cartaRemovida);
        return cartaRemovida;
        
    }
    
    public BultoPostal removerBultoPostal() {
        BultoPostal bultoRemovido = null;
        for( Correspondencia c : listaCorrespondencia ) {
            if ( c instanceof BultoPostal ) {
                bultoRemovido = (BultoPostal) c;
            }
        }
        listaCorrespondencia.remove(bultoRemovido);
        return bultoRemovido;
    }
    
    public int entregarCorrespondenciaADestinatario(String nombre, String direccionDestinatario) {
        Correspondencia correspondenciaARemover = null;
        int indice = -1;
        for( Correspondencia c : listaCorrespondencia ) {
            if( c.nombreRemitente.equals(nombre) && c.direccionDestinatario.equals(direccionDestinatario)) {
                correspondenciaARemover = c;
                indice = listaCorrespondencia.indexOf(c);
            }
        }
        if( correspondenciaARemover != null ) {
            listaCorrespondencia.remove(correspondenciaARemover);
            return indice;
        }
        return indice;
    }
    
    public double calcularGananciaTotal() {
        double gananciaTotal = 0;
        for( Correspondencia c : listaCorrespondencia )
            gananciaTotal += c.calcularPrecio();
        return gananciaTotal;
    }
}
