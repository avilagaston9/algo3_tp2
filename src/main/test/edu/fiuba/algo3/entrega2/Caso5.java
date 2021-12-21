package edu.fiuba.algo3.entrega2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import clases.Ciudad;
import clases.Computadora;
import clases.Coordenadas;
import clases.Policia;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.edificios.Aeropuerto;
import clases.edificios.Banco;
import clases.edificios.Biblioteca;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.pistas.Pista;
import clases.pistas.PistaDificil;
import clases.rangos.Detective;

public class Caso5 {

	@Test
	public void detectiveHaceSeisArrestosYTomaUnCaso() { // todo nombre mas apto para la prueba

		// Creo ciudad
		Coordenadas coordenadasMexico = new Coordenadas(23.634501, -102.552784);
		Ciudad mexico = new Ciudad("Mexico", coordenadasMexico);

		// Creo un policia de rango Detective...
		Policia policia = new Policia(new Detective(), mexico);

		// assert (policia.esDetective());

		// HACE 6 ARRESTOS

		policia.agregarArresto();
		policia.agregarArresto();
		policia.agregarArresto();
		policia.agregarArresto();
		policia.agregarArresto();
		policia.agregarArresto();

		// assert (policia.esInvestigador());

		LadronBuilder ladronBuilder = new LadronBuilder();
		ladronBuilder.setSexo(new CaracteristicaLadron("es hombre"));
		ladronBuilder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
		ladronBuilder.setCabello(new CaracteristicaLadron("tiene el pelo negro"));
		ladronBuilder.setSenia(new CaracteristicaLadron("tiene puesto un anillo"));
		ladronBuilder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));

		Ladron jose = ladronBuilder.getLadron();

		// Lista de ladrones...
		ArrayList<Ladron> sospechosos = new ArrayList<>();
		sospechosos.add(jose);

		// ==================================================================================================
		// 1

		// PROXIMA CIUDAD, MONTREAL
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

		// BANCO
		PistaDificil pistaDificil = new PistaDificil("Dolares canadieses");
		Edificio banco = new Banco();
		banco.setPista(pistaDificil); // builder
		// todo investigar factory

		// AEROPUERTO
		PistaDificil pistaDificil1 = new PistaDificil("bandera con una hoja");
		Edificio aeropuerto = new Aeropuerto();
		aeropuerto.setPista(pistaDificil1);

		// BIBLIOTECA
		PistaDificil pistaDificil2 = new PistaDificil("Limita con usa");
		Edificio biblioteca = new Biblioteca();

		biblioteca.setPista(pistaDificil2);

		// PISTAS
		LinkedList<Pista> pistasDevueltasBanco = policia.visitar(banco, jose); // primera visita
		LinkedList<Pista> pistasDevueltasAeropuero = policia.visitar(aeropuerto, jose);// segunda visita
		LinkedList<Pista> pistasDevueltasBiblioteca = policia.visitar(biblioteca, jose);// tercer visita

		assertEquals(3, policia.tiempoTranscurridoEnHoras());
		assert (pistasDevueltasBanco.get(0).revelar().equals("Dolares canadieses")); // todo iterar lista de pistas y
																						// con el equals ver si
																						// pertenece a la coleccion
																						// correcta...
		assert (pistasDevueltasAeropuero.get(0).revelar().equals("bandera con una hoja"));
		assert (pistasDevueltasBiblioteca.get(0).revelar().equals("Limita con usa"));

		policia.viajarA(montreal);
		assertEquals(5, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 2

		// PROXIMA CIUDAD, ROMA
		Coordenadas coordenadasRoma = new Coordenadas(41.8905, 12.4942);
		Ciudad roma = new Ciudad("Roma", coordenadasRoma);

		// BANCO
		PistaDificil pistaDificilRoma = new PistaDificil("Euros");
		Edificio banco2 = new Banco();
		banco2.setPista(pistaDificilRoma);

		// AEROPUERTO
		PistaDificil pistaDificilRoma2 = new PistaDificil("Avion con bandera de italia");
		Edificio aeropuerto2 = new Aeropuerto();
		aeropuerto2.setPista(pistaDificilRoma2);

		// BIBLIOTECA
		PistaDificil pistaDificilRoma3 = new PistaDificil("Dijo que iba a un lugar donde hay un coliseo romano");
		Edificio biblioteca2 = new Biblioteca();
		biblioteca2.setPista(pistaDificilRoma3);

		// PISTAS
		LinkedList<Pista> pistasDevueltasBanco2 = policia.visitar(banco2, jose); // primera visita
		LinkedList<Pista> pistasDevueltasAeropuerto2 = policia.visitar(aeropuerto2, jose);// segunda visita

		assert (pistasDevueltasBanco2.get(0).revelar().equals("Euros"));
		assert (pistasDevueltasAeropuerto2.get(0).revelar().equals("Avion con bandera de italia"));
		assertEquals(6, policia.tiempoTranscurridoEnHoras());

		// Se crea la computadora para registrar datos...
		Computadora computadora = new Computadora(sospechosos);

		// computadora.cargarCaracteristica(new Negro()); //todo esto lo tiene que
		// devolver el edificio
		computadora.cargarCaracteristica(new CaracteristicaLadron("tiene el pelo negro"));

		policia.viajarA(roma);
		assertEquals(11, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 3

		// PROXIMA CIUDAD, PARIS
		Coordenadas coordenadasParis = new Coordenadas(48.8032, 2.3511);
		Ciudad paris = new Ciudad("Roma", coordenadasParis);

		// BANCO
		Edificio bancoParis = new Banco();
		PistaDificil pistaDificilParisBanco = new PistaDificil("Euros");
		bancoParis.setPista(pistaDificilParisBanco);

		// AEROPUERTO
		Edificio aeropuertoParis = new Aeropuerto();
		PistaDificil pistaDificilParisAeropuerto = new PistaDificil("bandera de francia");
		aeropuertoParis.setPista(pistaDificilParisAeropuerto);

		// BIBLIOTECA
		Edificio bibliotecaParis = new Biblioteca();
		PistaDificil pistaDificilParisBiblioteca = new PistaDificil("Pais que limita con Portugal");
		bibliotecaParis.setPista(pistaDificilParisBiblioteca);

		// PISTAS
		LinkedList<Pista> pistasDevueltasbancoParis = policia.visitar(bancoParis, jose); // primera visita
		LinkedList<Pista> pistasDevueltasAeropuertoParis = policia.visitar(aeropuertoParis, jose);// segunda visita

		assert (pistasDevueltasbancoParis.get(0).revelar().equals("Euros"));
		assert (pistasDevueltasAeropuertoParis.get(0).revelar().equals("bandera de francia"));
		assertEquals(12, policia.tiempoTranscurridoEnHoras());

		computadora.cargarCaracteristica(new CaracteristicaLadron("tiene puesto un anillo"));

		policia.viajarA(paris);
		assertEquals(12, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 4

		// PROXIMA CIUDAD, BUENOS ARIES
		Coordenadas coordenadasBsas = new Coordenadas(-34.6131500, -58.3772300);
		Ciudad bsas = new Ciudad("Buenos Aires", coordenadasBsas);

		jose.setCiudad(bsas); // todo pasar esto al ladron builder

		// BANCO
		Edificio bancoBsas = new Banco();
		PistaDificil pistaDificilBsasBanco = new PistaDificil("Pesos argentinos");
		bancoBsas.setPista(pistaDificilBsasBanco);

		// BIBLIOTECA
		Biblioteca bibliotecaBsas = new Biblioteca();
		PistaDificil pistaDificilBiblioteca = new PistaDificil("Rio de la plata");
		bibliotecaBsas.setPista(pistaDificilBiblioteca);

		// PISTAS
		LinkedList<Pista> pistasDevueltasBancoBsas = policia.visitar(bancoBsas, jose); // primera visita
		LinkedList<Pista> pistasDevueltasBibliotecaBsas = policia.visitar(bibliotecaBsas, jose);// segunda visita

		assert (pistasDevueltasBancoBsas.get(0).revelar().equals("Pesos argentinos"));
		assert (pistasDevueltasBibliotecaBsas.get(0).revelar().equals("Rio de la plata"));
		assertEquals(15, policia.tiempoTranscurridoEnHoras());

		computadora.cargarCaracteristica(new CaracteristicaLadron("es hombre"));

		policia.emitirOrdenDeArresto(computadora.emitirOrdenDeArresto(jose));
		assertEquals(18, policia.tiempoTranscurridoEnHoras());

		policia.viajarA(bsas);
		assertEquals(26, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 5

		policia.arrestarA(jose);
		assertEquals(12, policia.cantidadArrestos());

	}
}