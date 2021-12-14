package clases.armas;

import clases.Tiempo;
import clases.armas.Arma;

public class Cuchillo implements Arma {

    //Cambiará con el tiempo
    @Override
    public void Herir(Tiempo tiempoTranscurrido) {

        tiempoTranscurrido.heridaDeCuchillo();
    }
}
