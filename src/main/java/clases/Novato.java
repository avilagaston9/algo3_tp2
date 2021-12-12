package clases;

import java.util.LinkedList;
import java.util.List;

public class Novato implements Rango {
    private int velocidad;

    public Novato(){
        this.velocidad=900;
    }

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


}
