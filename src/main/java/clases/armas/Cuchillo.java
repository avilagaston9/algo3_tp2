package clases.armas;

import clases.Tiempo;

public class Cuchillo implements Arma {

	// Cambiará con el tiempo
	@Override
	public void Herir(Tiempo tiempoTranscurrido) {

		tiempoTranscurrido.herirCon(this);
	}
}
