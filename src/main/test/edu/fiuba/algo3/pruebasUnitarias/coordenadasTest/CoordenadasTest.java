package edu.fiuba.algo3.pruebasUnitarias.coordenadasTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Coordenadas;

public class CoordenadasTest {

	@Test
	public void coordenadasIgualesDistanciaCero() {

		Coordenadas unasCoordenadas = new Coordenadas(1, 1);
		Coordenadas otrasCoordenadas = new Coordenadas(1, 1);

		assertEquals(0, unasCoordenadas.calcularDistancia(otrasCoordenadas));
	}

	@Test
	public void distanciaDesdeMontrealAMexicoEs3562() {

		Coordenadas unasCoordenadas = new Coordenadas(45.50884, -73.58781);
		Coordenadas otrasCoordenadas = new Coordenadas(23.634501, -102.552784);

		assertEquals(3562, (int) unasCoordenadas.calcularDistancia(otrasCoordenadas));
	}
	@Test
	public void distanciaDesdeMexicoAMontrealEs3562() {

		Coordenadas unasCoordenadas = new Coordenadas(45.50884, -73.58781);
		Coordenadas otrasCoordenadas = new Coordenadas(23.634501, -102.552784);

		assertEquals(3562, (int) otrasCoordenadas.calcularDistancia(unasCoordenadas));
	}
}
