package edu.fiuba.algo3.modelo.OrdenDeArresto;

import edu.fiuba.algo3.modelo.ladron.Ladron;

public class OrdenDeArresto implements OrdenArresto {

	private Ladron ladron;

	public OrdenDeArresto(Ladron delincuente) {
		this.ladron = delincuente;
	}

	@Override
	public boolean comparar(Ladron ladron) {
		return this.ladron.equals(ladron);
	}

	@Override
	public String nombreLadronEnLaOrden() {
		return ladron.getNombre();
	}

}
