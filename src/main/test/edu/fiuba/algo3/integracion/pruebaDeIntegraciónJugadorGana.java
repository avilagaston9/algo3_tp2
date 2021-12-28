package edu.fiuba.algo3.integracion;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import clases.*;
import clases.Exceptions.ExcepcionSinOrdenDeArresto;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudades;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoLadrones;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoObjetosRobados;
import clases.OrdenDeArresto.OrdenArresto;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.rangos.Novato;
import clases.valorObjetoRobado.ObjetoRobado;

public class pruebaDeIntegraciónJugadorGana {

	@Test
	public void novatoRealizaLaInvestigacionYArrestaAlLadron() throws ExcepcionSinOrdenDeArresto {

		LectorArchivoCiudades lectorCiudades = new LectorArchivoCiudades();
		ArrayList<Ciudad> ciudades = lectorCiudades
				.leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//ciudadesSinTerminar.json");

		LectorArchivoLadrones lectorLadrones = new LectorArchivoLadrones();
		ArrayList<Ladron> ladrones = lectorLadrones
				.leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//dossiers.json");

		LectorArchivoObjetosRobados lectorObjetos = new LectorArchivoObjetosRobados();
		ArrayList<ObjetoRobado> objetos = lectorObjetos
				.leer("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//tesoros.json");

		// AlgoThief juego = new AlgoThief(ciudades, ladrones, objetos);

		// juego.visitarBancoActual();

		Novato rango = new Novato();

		ObjetoRobado objetoRobado = rango.getObjetoRobado(objetos);
		assert (objetoRobado.equals(objetos.get(1)));

		RutaDeEscape rutaDeEscape = objetoRobado.crearRutaDeEscape(new ArrayList<Ciudad>(ciudades)); // (Baghdad,
																										// Atenas,Bamako,Bangkok)
		ArrayList<Ciudad> listaRuta = rutaDeEscape.getRuta();

		Ciudad baghdad = ciudades.get(1);
		Ciudad atenas = ciudades.get(0);
		Ciudad bamako = ciudades.get(2);
		Ciudad bangkok = ciudades.get(3);

		assert (listaRuta.get(0).equals(baghdad));
		assert (listaRuta.get(1).equals(atenas));
		assert (listaRuta.get(2).equals(bamako));
		assert (listaRuta.get(3).equals(bangkok));

		PoliciaBuilder policiaBuilder = new PoliciaBuilder();
		policiaBuilder.setRango(rango);
		policiaBuilder.setPrimerCiudad(baghdad);
		Policia policia = policiaBuilder.getPolicia();

		Ladron ladron = ladrones.get(0); // Carmen Sandiego
		ladron.setCiudad(listaRuta.get(listaRuta.size() - 1)); // Bangkok
		ladron.setRutaDeEscape(rutaDeEscape);
		int contadorPistasLadron = 0;

		// Ladron ladronSpy = Mockito.spy(ladron);
		// Mockito.when(ladronSpy.pedirPista(rango)).thenReturn(new
		// PistaConInformacion("Femenino"));

		Computadora computadora = new Computadora(ladrones);

		// VISITAS EN BAGHDAD
		LinkedList<Pista> pistasDevueltasBanco = policia.visitarBancoActual(ladron); // primera visita
		LinkedList<Pista> pistasDevueltasAeropuerto = policia.visitarAeropuertoActual(ladron);// segunda visita
		LinkedList<Pista> pistasDevueltasBiblioteca = policia.visitarBibliotecaActual(ladron);// tercer visita

		assert (pistasDevueltasBanco.get(0).revelar().equals("Dracmas"));
		this.cargarPistaLadron(pistasDevueltasAeropuerto, computadora);

		assert (pistasDevueltasAeropuerto.get(0).revelar().equals("Azul y blanco"));
		this.cargarPistaLadron(pistasDevueltasBanco, computadora);

		assert (pistasDevueltasBiblioteca.get(0).revelar().equals("Montes"));
		this.cargarPistaLadron(pistasDevueltasBiblioteca, computadora);

		assertEquals(3, policia.tiempoTranscurridoEnHoras());

		policia.viajarA(atenas);
		assertEquals(5, policia.tiempoTranscurridoEnHoras());

		// VISITAS EN ATENAS
		pistasDevueltasBanco = policia.visitarBancoActual(ladron); // primera visita
		pistasDevueltasAeropuerto = policia.visitarAeropuertoActual(ladron);// segunda visita
		pistasDevueltasBiblioteca = policia.visitarBibliotecaActual(ladron);// tercer visita

		assert (pistasDevueltasBanco.get(0).revelar().equals("Franco francés"));
		this.cargarPistaLadron(pistasDevueltasAeropuerto, computadora);

		assert (pistasDevueltasAeropuerto.get(0).revelar().equals("Verde, Amarillo, Rojo"));
		this.cargarPistaLadron(pistasDevueltasBanco, computadora);

		assert (pistasDevueltasBiblioteca.get(0).revelar().equals("Savanna Tropical"));
		this.cargarPistaLadron(pistasDevueltasBiblioteca, computadora);

		assertEquals(8, policia.tiempoTranscurridoEnHoras());

		policia.viajarA(bamako);
		assertEquals(12, policia.tiempoTranscurridoEnHoras());

		// VISITAS EN BAMAKO
		pistasDevueltasBanco = policia.visitarBancoActual(ladron); // primera visita
		pistasDevueltasAeropuerto = policia.visitarAeropuertoActual(ladron);// segunda visita
		pistasDevueltasBiblioteca = policia.visitarBibliotecaActual(ladron);// tercer visita

		assert (pistasDevueltasBanco.get(0).revelar().equals("Baht tailandés"));
		this.cargarPistaLadron(pistasDevueltasAeropuerto, computadora);

		assert (pistasDevueltasAeropuerto.get(0).revelar().equals("Rojo, Blanco, Azul"));
		this.cargarPistaLadron(pistasDevueltasBanco, computadora);

		assert (pistasDevueltasBiblioteca.get(0).revelar().equals("Llanura"));
		this.cargarPistaLadron(pistasDevueltasBiblioteca, computadora);

		assertEquals(15, policia.tiempoTranscurridoEnHoras());

		computadora.buscarSospechosos();

		OrdenArresto orden = computadora.emitirOrdenDeArresto(ladron);
		policia.emitirOrdenDeArresto(orden);
		assertEquals(26, policia.tiempoTranscurridoEnHoras()); // 3hs de orden de arresto + 8hs de dormir

		policia.viajarA(bangkok);
		assertEquals(38, policia.tiempoTranscurridoEnHoras());

		assertTrue(policia.arrestarA(ladron));
		assertTrue(policia.tiempoTranscurridoEnHoras() < 154);
		// chequear que tiempo no se haya pasado antes
	}

	private void cargarPistaLadron(LinkedList<Pista> pistasDevueltas, Computadora computadora) {
		if (!pistasDevueltas.get(1).revelar().equals("Lo sentimos, no tenemos informacion del ladron")) {
			CaracteristicaLadron caracteristicaLadron = new CaracteristicaLadron(pistasDevueltas.get(1).revelar());
			computadora.cargarCaracteristica(caracteristicaLadron);
		}
	}
}
