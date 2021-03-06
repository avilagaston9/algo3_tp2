package edu.fiuba.algo3.entrega1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.modelo.ciudades.Coordenadas;
import edu.fiuba.algo3.modelo.Policia.Policia;
import edu.fiuba.algo3.modelo.armas.Arma;
import edu.fiuba.algo3.modelo.armas.Cuchillo;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Rango;

public class Caso5 {

	@Test
	public void DetectiveDuerme() {

		// arrange
		// se crea Montreal
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);
		Rango rango = new Novato();
		Policia policia = new Policia(rango, montreal); // crea tiempo y rango
		// act
		policia.dormir();
		// assert
		assertEquals(8, policia.tiempoTranscurridoEnHoras());
	}

	@Test
	public void DetectiveRecibeHeridaDeCuchillo() {

		// arrange
		// se crea Montreal
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

		Arma cuchillo = new Cuchillo();
		Rango rango = new Novato();
		Policia policia = new Policia(rango, montreal); // crea tiempo y rango
		// act
		policia.herirCon(cuchillo);
		// assert
		assertEquals(2, policia.tiempoTranscurridoEnHoras());
	}
}
