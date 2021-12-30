package edu.fiuba.algo3.modelo.OrdenDeArresto;

import edu.fiuba.algo3.modelo.ladron.Ladron;

public class SinOrdenDeArresto extends Throwable implements OrdenArresto {

	@Override
	public boolean comparar(Ladron ladron) {
		return false;
	}

	@Override
	public String nombreLadronEnLaOrden() {
		return "Sin orden de Arresto";
	}

}
