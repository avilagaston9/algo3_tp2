package clases.OrdenDeArresto;

import clases.ladron.Ladron;

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
