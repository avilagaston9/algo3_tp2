package clases;

import java.util.LinkedList;
import java.util.List;

public class Novato extends Rango {
    //private int velocidad;

    public Novato(){

        this.maximoArrestos = 5;
        this.arrestos = 0;
        //this.velocidad=900;
    }

    @Override
    public Rango siguienteRango() { return new Detective()}



    /*
    @Override
    public void viajar(int cantidadKms, Tiempo tiempo){
        tiempo.sumarHoras(cantidadKms*1/this.velocidad);
    }

    @Override
    public void dormir(Tiempo tiempoTranscurrido) {

        tiempoTranscurrido.sumarHoras(8);
    }

    @Override
    public boolean rango() {
        return this.velocidad == 900;
    }

     */


}
