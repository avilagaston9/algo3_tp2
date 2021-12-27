package edu.fiuba.algo3.entrega2;

import clases.Ciudad;
import clases.Computadora;
import clases.Coordenadas;
import clases.Policia;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.edificios.*;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.pistas.*;
import clases.rangos.Detective;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso5 {

	@Test
	public void detectiveHaceSeisArrestosYAsciendeAInvestigadorLuegoRealizaInvestigacionYAtrapaAlSospechoso() {

		// Creo ciudad
		Coordenadas coordenadasMexico = new Coordenadas(23.634501, -102.552784);
		Ciudad mexico = new Ciudad("Mexico", coordenadasMexico);

		// Creo un policia de rango Detective...
		Policia policia = new Policia(new Detective(), mexico);

		// HACE 6 ARRESTOS
		for (int i = 0; i < 6; i++) {
			policia.agregarArresto();
		}

		// Instancio Ciudad en la que se encuentra el ladron
		Coordenadas coordenadasBsas = new Coordenadas(-34.6131500, -58.3772300);
		Ciudad bsas = new Ciudad("Buenos Aires", coordenadasBsas);

		LadronBuilder ladronBuilder = new LadronBuilder();
		ladronBuilder.setSexo(new CaracteristicaLadron("es hombre"));
		ladronBuilder.setHobby(new CaracteristicaLadron("le gusta jugar al tenis"));
		ladronBuilder.setCabello(new CaracteristicaLadron("tiene el pelo negro"));
		ladronBuilder.setSenia(new CaracteristicaLadron("tiene puesto un anillo"));
		ladronBuilder.setVehiculo(new CaracteristicaLadron("manejaba una moto"));
		ladronBuilder.setNombre("Jose");

		Ladron jose = ladronBuilder.getLadron();
		jose.setCiudad(bsas);
		// Lista de ladrones...
		ArrayList<Ladron> sospechosos = new ArrayList<>();
		sospechosos.add(jose);


		// ==================================================================================================
		// 1

		// PROXIMA CIUDAD, MONTREAL
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

		// BANCO
		PistaFacil pistaFacil1 = new PistaFacil("Dolares canadieses");
		PistaMedia pistaMedia1 = new PistaMedia("Dolares similares a canadieses");
		PistaDificil pistaDificil1 = new PistaDificil("Dolares norteamericanos");

		Edificio banco = new Banco();
		banco.setPistaOtraCiudad(pistaFacil1);
		banco.setPistaOtraCiudad(pistaMedia1);
		banco.setPistaOtraCiudad(pistaDificil1);

		// AEROPUERTO
		PistaFacil pistaFacil2 = new PistaFacil("Bandera canadiese");
		PistaMedia pistaMedia2 = new PistaMedia("Bandera similar a la canadiese");
		PistaDificil pistaDificil2 = new PistaDificil("bandera con una hoja");

		Edificio aeropuerto = new Aeropuerto();
		aeropuerto.setPistaOtraCiudad(pistaFacil2);
		aeropuerto.setPistaOtraCiudad(pistaMedia2);
		aeropuerto.setPistaOtraCiudad(pistaDificil2);


		// BIBLIOTECA
		PistaFacil pistaFacil3 = new PistaFacil("facil");
		PistaMedia pistaMedia3 = new PistaMedia("media");
		PistaDificil pistaDificil3 = new PistaDificil("Limita con usa");

		Edificio biblioteca = new Biblioteca();
		biblioteca.setPistaOtraCiudad(pistaFacil3);
		biblioteca.setPistaOtraCiudad(pistaMedia3);
		biblioteca.setPistaOtraCiudad(pistaDificil3);


		// PISTAS
		LinkedList<Pista> pistasDevueltasBanco = policia.visitar(banco, jose); // primera visita
		LinkedList<Pista> pistasDevueltasAeropuerto = policia.visitar(aeropuerto, jose);// segunda visita
		LinkedList<Pista> pistasDevueltasBiblioteca = policia.visitar(biblioteca, jose);// tercer visita

		assertEquals(3, policia.tiempoTranscurridoEnHoras());

		assert (pistasDevueltasBanco.contains(pistaDificil1));
		assert (pistasDevueltasAeropuerto.contains(pistaDificil2));
		assert (pistasDevueltasBiblioteca.contains(pistaDificil3));

		policia.viajarA(montreal);
		assertEquals(5, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 2

		// PROXIMA CIUDAD, ROMA
		Coordenadas coordenadasRoma = new Coordenadas(41.8905, 12.4942);
		Ciudad roma = new Ciudad("Roma", coordenadasRoma);

		// BANCO
		PistaFacil pistaFacil4 = new PistaFacil("facil");
		PistaMedia pistaMedia4 = new PistaMedia("media");
		PistaDificil pistaDificil4 = new PistaDificil("Euros");

		Edificio bancoRoma = new Banco();
		bancoRoma.setPistaOtraCiudad(pistaFacil4);
		bancoRoma.setPistaOtraCiudad(pistaMedia4);
		bancoRoma.setPistaOtraCiudad(pistaDificil4);

		// AEROPUERTO
		PistaFacil pistaFacil5 = new PistaFacil("facil");
		PistaMedia pistaMedia5 = new PistaMedia("media");
		PistaDificil pistaDificil5 = new PistaDificil("Avion con bandera de italia");

		Edificio aeropuertoRoma = new Aeropuerto();
		aeropuertoRoma.setPistaOtraCiudad(pistaFacil5);
		aeropuertoRoma.setPistaOtraCiudad(pistaMedia5);
		aeropuertoRoma.setPistaOtraCiudad(pistaDificil5);

		// BIBLIOTECA
		PistaFacil pistaFacil6 = new PistaFacil("facil");
		PistaMedia pistaMedia6 = new PistaMedia("media");
		PistaDificil pistaDificil6 = new PistaDificil("Limita con usa");

		Edificio bibliotecaPistaRoma = new Biblioteca();
		bibliotecaPistaRoma.setPistaOtraCiudad(pistaFacil6);
		bibliotecaPistaRoma.setPistaOtraCiudad(pistaMedia6);
		bibliotecaPistaRoma.setPistaOtraCiudad(pistaDificil6);

		// PISTAS
		LinkedList<Pista> pistasDevueltasBancoRoma = policia.visitar(bancoRoma, jose);
		LinkedList<Pista> pistasDevueltasAeropuertoRoma = policia.visitar(aeropuertoRoma, jose);

		assert (pistasDevueltasBancoRoma.contains(pistaDificil4));
		assert (pistasDevueltasAeropuertoRoma.contains(pistaDificil5));
		assertEquals(6, policia.tiempoTranscurridoEnHoras());

		// Se crea la computadora para registrar datos
		Computadora computadora = new Computadora(sospechosos);

		// todo mockear el ladron y que devuelva cierta pista
		computadora.cargarCaracteristica(new CaracteristicaLadron("tiene el pelo negro"));

		policia.viajarA(roma);
		assertEquals(11, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 3

		// PROXIMA CIUDAD, PARIS
		Coordenadas coordenadasParis = new Coordenadas(48.8032, 2.3511);
		Ciudad paris = new Ciudad("Roma", coordenadasParis);

		// BANCO
		PistaFacil pistaFacil7 = new PistaFacil("facil");
		PistaMedia pistaMedia7 = new PistaMedia("media");
		PistaDificil pistaDificil7 = new PistaDificil("Euros");

		Edificio bancoPistasParis = new Banco();
		bancoPistasParis.setPistaOtraCiudad(pistaFacil7);
		bancoPistasParis.setPistaOtraCiudad(pistaMedia7);
		bancoPistasParis.setPistaOtraCiudad(pistaDificil7);

		// AEROPUERTO
		PistaFacil pistaFacil8 = new PistaFacil("facil");
		PistaMedia pistaMedia8 = new PistaMedia("media");
		PistaDificil pistaDificil8 = new PistaDificil("bandera de francia");

		Edificio aeropuertoPistasParis = new Aeropuerto();
		aeropuertoPistasParis.setPistaOtraCiudad(pistaFacil8);
		aeropuertoPistasParis.setPistaOtraCiudad(pistaMedia8);
		aeropuertoPistasParis.setPistaOtraCiudad(pistaDificil8);

		// BIBLIOTECA
		PistaFacil pistaFacil9 = new PistaFacil("facil");
		PistaMedia pistaMedia9 = new PistaMedia("media");
		PistaDificil pistaDificil9 = new PistaDificil("dificil");

		Edificio bibliotecaPistaParis = new Biblioteca();
		bibliotecaPistaParis.setPistaOtraCiudad(pistaFacil9);
		bibliotecaPistaParis.setPistaOtraCiudad(pistaMedia9);
		bibliotecaPistaParis.setPistaOtraCiudad(pistaDificil9);

		// PISTAS
		LinkedList<Pista> pistasDevueltasBancoParis = policia.visitar(bancoPistasParis, jose);
		LinkedList<Pista> pistasDevueltasAeropuertoParis = policia.visitar(aeropuertoPistasParis, jose);

		assert (pistasDevueltasBancoParis.contains(pistaDificil7));
		assert (pistasDevueltasAeropuertoParis.contains(pistaDificil8));
		assertEquals(12, policia.tiempoTranscurridoEnHoras());

		// todo mockear el ladron y que devuelva cierta pista
		computadora.cargarCaracteristica(new CaracteristicaLadron("tiene puesto un anillo"));

		policia.viajarA(paris);
		assertEquals(12, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 4

		// PROXIMA CIUDAD, BUENOS ARIES
		// Instanciada al principio


		// BANCO
		PistaFacil pistaFacil10 = new PistaFacil("facil");
		PistaMedia pistaMedia10 = new PistaMedia("media");
		PistaDificil pistaDificil10 = new PistaDificil("Pesos argentinos");

		Edificio bancoPistasBsas = new Banco();
		bancoPistasBsas.setPistaOtraCiudad(pistaFacil10);
		bancoPistasBsas.setPistaOtraCiudad(pistaMedia10);
		bancoPistasBsas.setPistaOtraCiudad(pistaDificil10);

		// BIBLIOTECA
		PistaFacil pistaFacil11 = new PistaFacil("facil");
		PistaMedia pistaMedia11 = new PistaMedia("media");
		PistaDificil pistaDificil11 = new PistaDificil("Rio de la plata");

		Edificio bibliotecaPistasBsas = new Biblioteca();
		bibliotecaPistasBsas.setPistaOtraCiudad(pistaFacil11);
		bibliotecaPistasBsas.setPistaOtraCiudad(pistaMedia11);
		bibliotecaPistasBsas.setPistaOtraCiudad(pistaDificil11);

		// PISTAS
		LinkedList<Pista> pistasDevueltasBancoBsas = policia.visitar(bancoPistasBsas, jose); // primera visita
		LinkedList<Pista> pistasDevueltasBibliotecaBsas = policia.visitar(bibliotecaPistasBsas, jose);// segunda visita


		assert (pistasDevueltasBancoBsas.contains(pistaDificil10));
		assert (pistasDevueltasBibliotecaBsas.contains(pistaDificil11));
		assertEquals(15, policia.tiempoTranscurridoEnHoras());

		// todo mockear el ladron y que devuelva cierta pista
		computadora.cargarCaracteristica(new CaracteristicaLadron("es hombre"));

		policia.emitirOrdenDeArresto(computadora.emitirOrdenDeArresto(jose));
		assertEquals(26, policia.tiempoTranscurridoEnHoras());

		policia.viajarA(bsas);

		assertEquals(34, policia.tiempoTranscurridoEnHoras());

		// ==================================================================================================
		// 5

		policia.arrestarA(jose);
		assertEquals(12, policia.cantidadArrestos());
	}
}