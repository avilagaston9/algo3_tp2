package edu.fiuba.algo3.entrega2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import clases.Ciudad;
import clases.Computadora;
import clases.Coordenadas;
import clases.Policia;
import clases.FabricaEdificios.FabricaAeropuerto;
import clases.FabricaEdificios.FabricaBancos;
import clases.FabricaEdificios.FabricaBiblioteca;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.ladron.LadronBuilder;
import clases.pistas.Pista;
import clases.pistas.PistaDificil;
import clases.pistas.PistaFacil;
import clases.pistas.PistaMedia;
import clases.rangos.Detective;

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
		ladronBuilder.setCiudad(bsas);

		Ladron jose = ladronBuilder.getLadron();

		// Lista de ladrones...
		ArrayList<Ladron> sospechosos = new ArrayList<>();
		sospechosos.add(jose);

		// ==================================================================================================
		// CREO FABRICAS DE EDIFICIOS

		FabricaBancos fabricaBancos = new FabricaBancos();
		FabricaAeropuerto fabricaAeropuerto = new FabricaAeropuerto();
		FabricaBiblioteca fabricaBiblioteca = new FabricaBiblioteca();

		// ==================================================================================================
		// 1

		// PROXIMA CIUDAD, MONTREAL
		Coordenadas coordenadasMontreal = new Coordenadas(45.50884, -73.58781);
		Ciudad montreal = new Ciudad("Montreal", coordenadasMontreal);

		// BANCO
		PistaFacil pistaFacil1 = new PistaFacil("Dolares canadieses");
		PistaMedia pistaMedia1 = new PistaMedia("Dolares similares a canadieses");
		PistaDificil pistaDificil1 = new PistaDificil("Dolares norteamericanos");
		Edificio banco = fabricaBancos.crearEdificio(pistaFacil1, pistaMedia1, pistaDificil1);

		// AEROPUERTO
		PistaFacil pistaFacil2 = new PistaFacil("Bandera canadiese");
		PistaMedia pistaMedia2 = new PistaMedia("Bandera similar a la canadiese");
		PistaDificil pistaDificil2 = new PistaDificil("bandera con una hoja");
		Edificio aeropuerto = fabricaAeropuerto.crearEdificio(pistaFacil2, pistaMedia2, pistaDificil2);

		// BIBLIOTECA
		PistaFacil pistaFacil3 = new PistaFacil("facil");
		PistaMedia pistaMedia3 = new PistaMedia("media");
		PistaDificil pistaDificil3 = new PistaDificil("Limita con usa");
		Edificio biblioteca = fabricaBiblioteca.crearEdificio(pistaFacil3, pistaMedia3, pistaDificil3);

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
		Edificio bancoRoma = fabricaBancos.crearEdificio(pistaFacil4, pistaMedia4, pistaDificil4);

		// AEROPUERTO
		PistaFacil pistaFacil5 = new PistaFacil("facil");
		PistaMedia pistaMedia5 = new PistaMedia("media");
		PistaDificil pistaDificil5 = new PistaDificil("Avion con bandera de italia");
		Edificio aeropuertoRoma = fabricaAeropuerto.crearEdificio(pistaFacil5, pistaMedia5, pistaDificil5);

		// BIBLIOTECA
		PistaFacil pistaFacil6 = new PistaFacil("facil");
		PistaMedia pistaMedia6 = new PistaMedia("media");
		PistaDificil pistaDificil6 = new PistaDificil("Limita con usa");
		Edificio bibliotecaPistasRoma = fabricaBiblioteca.crearEdificio(pistaFacil6, pistaMedia6, pistaDificil6);

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
		Edificio bancoPistasParis = fabricaBancos.crearEdificio(pistaFacil7, pistaMedia7, pistaDificil7);

		// AEROPUERTO
		PistaFacil pistaFacil8 = new PistaFacil("facil");
		PistaMedia pistaMedia8 = new PistaMedia("media");
		PistaDificil pistaDificil8 = new PistaDificil("bandera de francia");
		Edificio aeropuertoPistasParis = fabricaAeropuerto.crearEdificio(pistaFacil8, pistaMedia8, pistaDificil8);

		// BIBLIOTECA
		PistaFacil pistaFacil9 = new PistaFacil("facil");
		PistaMedia pistaMedia9 = new PistaMedia("media");
		PistaDificil pistaDificil9 = new PistaDificil("dificil");
		Edificio bibliotecaPistasParis = fabricaBiblioteca.crearEdificio(pistaFacil9, pistaMedia9, pistaDificil9);

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
		Edificio bancoPistasBsas = fabricaBancos.crearEdificio(pistaFacil10, pistaMedia10, pistaDificil10);

		// BIBLIOTECA
		PistaFacil pistaFacil11 = new PistaFacil("facil");
		PistaMedia pistaMedia11 = new PistaMedia("media");
		PistaDificil pistaDificil11 = new PistaDificil("Rio de la plata");
		Edificio bibliotecaPistasBsas = fabricaBancos.crearEdificio(pistaFacil11, pistaMedia11, pistaDificil11);

		// PISTAS
		LinkedList<Pista> pistasDevueltasBancoBsas = policia.visitar(bancoPistasBsas, jose); // primera visita
		LinkedList<Pista> pistasDevueltasBibliotecaBsas = policia.visitar(bibliotecaPistasBsas, jose);// segunda visita


		assert (pistasDevueltasBancoBsas.contains(pistaDificil10));
		assert (pistasDevueltasBibliotecaBsas.contains(pistaDificil11));
		assertEquals(15, policia.tiempoTranscurridoEnHoras());

		// todo mockear el ladron y que devuelva cierta pista
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