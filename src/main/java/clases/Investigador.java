package clases;

public class Investigador extends Rango {

    public Investigador(){

        this.arrestos = 10;
        this.maximoArrestos = 20;
    }

    @Override
    public Rango siguienteRango() {  return new Sargento();   }

    @Override
    public Pista visitar(Edificio unEdificio){ return unEdificio.serVisitado(this);}

    @Override
    public Pista pedirPistaLadron(Ladron ladron) {  return ladron.pedirPista(this);  }
}
