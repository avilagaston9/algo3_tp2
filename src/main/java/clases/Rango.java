package clases;

import java.util.List;

public interface Rango {

    List<Pista> pedirPista(Pistas pistasEdificio, Ladron ladron);

    void viajar(int cantidadKms, Tiempo tiempo);

    void dormir(Tiempo tiempoTranscurrido);
}
