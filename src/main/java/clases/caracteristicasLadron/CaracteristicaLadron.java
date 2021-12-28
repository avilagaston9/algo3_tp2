package clases.caracteristicasLadron;

import clases.pistas.Pista;
import clases.pistas.PistaConInformacion;

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
