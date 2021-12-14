package clases;

public class Detective extends Rango {

    public Detective(){

        this.arrestos = 5;
        this.maximoArrestos = 10;
    }

    @Override
    public Rango siguienteRango() { return new Investigador();   }
    @Override
    public Pista visitar(Edificio unEdificio){ return unEdificio.serVisitado(this);}

    @Override
    public Pista pedirPistaLadron(Ladron ladron) {  return ladron.pedirPista(this);   }

    /*
    @Override
    public void viajar(int cantidadKms, Tiempo tiempo) {

    }

    @Override
    public void dormir(Tiempo tiempoTranscurrido) {

    }

    @Override
    public boolean rango() {
        return false;
    }

     */
}
