package clases;

import java.util.List;

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
    public abstract Pista visitar(Edificio unEdificio);

    public abstract Pista pedirPistaLadron(Ladron ladron);

    /*

    void viajar(int cantidadKms, Tiempo tiempo);

    void dormir(Tiempo tiempoTranscurrido);

    boolean rango();

    */
}
