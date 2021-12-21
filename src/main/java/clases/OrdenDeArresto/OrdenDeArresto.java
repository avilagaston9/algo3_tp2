package clases.OrdenDeArresto;

import clases.ladron.Ladron;

public class OrdenDeArresto implements OrdenArresto {

	private Ladron ladron;

	public OrdenDeArresto(Ladron delincuente) {
		this.ladron = delincuente;
	}

	@Override
	public boolean comparar(Ladron ladron) {
		return this.ladron.equals(ladron);
	}

}
