package clases;

public class Sargento extends Rango {

    public Sargento(){

        this.arrestos = 20;
        this.maximoArrestos = 0;
    }
    @Override
    public Rango siguienteRango() { return this; }

    @Override
    public Pista visitar(Edificio unEdificio){ return unEdificio.serVisitado(this);}

    @Override
    public Pista pedirPistaLadron(Ladron ladron) {  return ladron.pedirPista(this);
    }
}
