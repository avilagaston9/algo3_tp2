package clases.rangos;

import clases.Ladron;
import clases.Tiempo;
import clases.edificios.Edificio;
import clases.pistas.Pista;
import clases.rangos.Rango;
import clases.rangos.Sargento;

public class Investigador extends Rango {

    public Investigador(){

        this.arrestos = 10;
        this.maximoArrestos = 20;
    }

    @Override
    public Rango siguienteRango() {  return new Sargento();   }

    @Override
    public Pista visitar(Edificio unEdificio, Tiempo tiempo){ return unEdificio.serVisitado(this, tiempo);}

    @Override
    public Pista pedirPistaLadron(Ladron ladron) {  return ladron.pedirPista(this);  }
}
