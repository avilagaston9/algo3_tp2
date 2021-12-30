package edu.fiuba.algo3.modelo.caracteristicasLadron;

import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaConInformacion;

public class CaracteristicaLadron {
	private Pista pista;

	public CaracteristicaLadron(String caracteristica) {
		this.pista = new PistaConInformacion(caracteristica);
	}

	public Pista darPista() {
		return pista;
	}

	public boolean equals(CaracteristicaLadron caracteristica) {
		return this.pista.equals(caracteristica.darPista());
	}

	public Pista getPista() {
		return this.pista;
	}
}
