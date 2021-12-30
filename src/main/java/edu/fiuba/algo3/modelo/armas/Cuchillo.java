package edu.fiuba.algo3.modelo.armas;

import edu.fiuba.algo3.modelo.Tiempo;

public class Cuchillo implements Arma {

	// Cambiará con el tiempo
	@Override
	public void Herir(Tiempo tiempoTranscurrido) {

		tiempoTranscurrido.herirCon(this);
	}
}
