package clases.rangos;

import clases.ladron.Ladron;
import clases.Tiempo;
import clases.edificios.Edificio;
import clases.pistas.Pista;

public abstract class Rango {

    protected int arrestos;
    protected int maximoArrestos;

    public Rango sumarArresto(){

        this.arrestos++;
        if(this.arrestos == this.maximoArrestos){

            return this.siguienteRango();
        }
        return this;
    }

    public abstract Rango siguienteRango();

    public abstract Pista visitar(Edificio unEdificio, Tiempo tiempo);

    public abstract Pista pedirPistaLadron(Ladron ladron);

    public abstract void viajar(Tiempo tiempo, int kilometros);

    public int arrestos() {
        return this.arrestos;
    }

    /*

    void viajar(int cantidadKms, Tiempo tiempo);

    void dormir(Tiempo tiempoTranscurrido);

    boolean rango();

    */
}
