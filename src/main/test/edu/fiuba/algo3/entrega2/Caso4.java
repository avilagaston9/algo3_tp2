package edu.fiuba.algo3.entrega2;

import clases.Ciudad;
import clases.Coordenadas;
import clases.Policia;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.*;
import clases.rangos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso4 {
	@Test
	public void detectiveIntentaAtraparLadronSinOrdenDeArresto() {

		// se crea Montreal
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

		Rango rango = new Novato();
		// ahora policia tiene un atributo orden de arresto
		Policia policia = new Policia(rango, montreal);

		LadronBuilder builder = new LadronBuilder();
		builder.setCabello(new CaracteristicaLadron("tiene el pelo rubio"));
		builder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
		builder.setSexo(new CaracteristicaLadron("es mujer"));
		builder.setSenia(new CaracteristicaLadron("tiene un tatuaje de un dragon"));
		builder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));
		builder.setNombre("Maria");
		Ladron maria = builder.getLadron();

		policia.arrestarA(maria);

		assertEquals(policia.cantidadArrestos(), 0);

	}
}
