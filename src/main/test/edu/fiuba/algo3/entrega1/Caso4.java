package edu.fiuba.algo3.entrega1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import clases.Ciudad;
import clases.Coordenadas;
import clases.Policia;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.edificios.Aeropuerto;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.pistas.Pista;
import clases.pistas.PistaFacil;
import clases.rangos.Novato;

public class Caso4 {

	@Test
	public void NovatoVisitaUnAeropuertoTresVeces() {

		// arrange

		// se crea al ladrón
		LadronBuilder builder = new LadronBuilder();
		builder.setCabello(new CaracteristicaLadron("tiene el pelo rubio"));
		builder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
		builder.setSexo(new CaracteristicaLadron("es mujer"));
		builder.setSenia(new CaracteristicaLadron("tiene un tatuaje de un dragon"));
		builder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));
		builder.setNombre("Maria");
		Ladron maria = builder.getLadron();

		// se crea Montreal
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);
		// se crea policia novato en montreal
		Policia policia = new Policia(new Novato(), montreal);

		// se crea la pista
		PistaFacil pistaPrueba = new PistaFacil("Su bandera es blanca y celeste");

		// se crea aeropuerto y se guarda la pista
		Edificio aeropuerto = new Aeropuerto();
		aeropuerto.setPistaOtraCiudad(pistaPrueba);

		// policia visita aeropuerto 3 veces
		LinkedList<Pista> pistasDevueltas;
		for (int i = 0; i < 3; i++) {

			pistasDevueltas = policia.visitar(aeropuerto, maria);
			// Chequea que siempre sea la misma pista
			assertEquals(pistasDevueltas.get(0).revelar(), "Su bandera es blanca y celeste");
		}
		assertEquals(0, policia.tiempoTranscurridoEnHoras());
	}

	@Test
	public void NovatoVisitaUnAeropuerto55Veces() {

		// arrange

		// se crea al ladrón
		LadronBuilder builder = new LadronBuilder();
		builder.setCabello(new CaracteristicaLadron("tiene el pelo rubio"));
		builder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
		builder.setSexo(new CaracteristicaLadron("es mujer"));
		builder.setSenia(new CaracteristicaLadron("tiene un tatuaje de un dragon"));
		builder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));
		builder.setNombre("Maria");
		Ladron maria = builder.getLadron();

		// se crea Montreal
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);
		// se crea policia novato en montreal
		Policia policia = new Policia(new Novato(), montreal);

		// se crea la pista
		PistaFacil pistaPrueba = new PistaFacil("Su bandera es blanca y celeste");

		// se crea aeropuerto y se guarda la pista
		Edificio aeropuerto = new Aeropuerto();
		aeropuerto.setPistaOtraCiudad(pistaPrueba);

		// policia visita aeropuerto 3 veces
		LinkedList<Pista> pistasDevueltas;
		for (int i = 0; i < 55; i++) {

			pistasDevueltas = policia.visitar(aeropuerto, maria);
			// Chequea que siempre sea la misma pista
			assertEquals(pistasDevueltas.get(0).revelar(), "Su bandera es blanca y celeste");
		}
		assertEquals(0, policia.tiempoTranscurridoEnHoras());
	}
}
