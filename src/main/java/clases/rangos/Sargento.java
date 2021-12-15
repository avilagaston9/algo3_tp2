package clases.rangos;

import clases.ladron.Ladron;
import clases.Tiempo;
import clases.edificios.Edificio;
import clases.pistas.Pista;

public class Sargento extends Rango {

    public Sargento(){

        this.arrestos = 20;
        this.maximoArrestos = 0;
    }
    @Override
    public Rango siguienteRango() { return this; }

    @Override
    public Pista visitar(Edificio unEdificio, Tiempo tiempo){ return unEdificio.serVisitado(this, tiempo);}

    @Override
    public Pista pedirPistaLadron(Ladron ladron) {  return ladron.pedirPista(this);
    }

    @Override
    public int tiempoConsumidoPorViaje(int cantidadKms){
        return (cantidadKms/1500);
    }
}
