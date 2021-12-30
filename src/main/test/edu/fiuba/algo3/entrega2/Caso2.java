package edu.fiuba.algo3.entrega2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.modelo.Coordenadas;
import edu.fiuba.algo3.modelo.Policia;
import edu.fiuba.algo3.modelo.rangos.Investigador;

public class Caso2 {

	@Test
	public void detectiveConRangoInvestigadorTomaCasoDeUnRoboViajaDeMontrealAMexico() {

		// se crea Montreal
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

		// se crea mexico
		Coordenadas coordenadasMexico = new Coordenadas(23.634501, -102.552784);
		Ciudad mexico = new Ciudad("Mexico", coordenadasMexico);

		// se crea policia novato en montreal
		Policia policia = new Policia(new Investigador(), montreal);

		policia.viajarA(mexico);

		assertEquals(2, policia.tiempoTranscurridoEnHoras());
		assert (policia.esCiudadActual(mexico));
		assertFalse(policia.esCiudadActual(montreal));
	}
}
