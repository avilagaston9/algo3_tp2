package clases;

public class Cuchillo implements Arma {

    //Cambiará con el tiempo
    @Override
    public void Herir(Tiempo tiempoTranscurrido) {

        tiempoTranscurrido.sumarHoras(2);
    }
}
