package edu.fiuba.algo3.pruebasUnitarias.CaracterisiticasLadronTest;

import org.junit.jupiter.api.Test;

import clases.caracteristicasLadron.CaracteristicaLadron;

public class ComparacionEntreCaracterisiticasIgualesDevuelveTrue {
	@Test
	public void miPrueba() {
		CaracteristicaLadron caracteristica1 = new CaracteristicaLadron("tiene el pelo negro");
		CaracteristicaLadron caracteristica2 = new CaracteristicaLadron("tiene el pelo negro");

		assert (caracteristica1.equals(caracteristica2));
	}
}
