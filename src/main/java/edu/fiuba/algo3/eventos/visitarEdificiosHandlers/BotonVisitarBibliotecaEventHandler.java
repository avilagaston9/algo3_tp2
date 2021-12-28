package edu.fiuba.algo3.eventos.visitarEdificiosHandlers;

import java.util.LinkedList;

import clases.AlgoThief;
import clases.pistas.Pista;
import javafx.stage.Stage;

public class BotonVisitarBibliotecaEventHandler extends BotonVisitarEdificioHandler {

	public BotonVisitarBibliotecaEventHandler(Stage stage, AlgoThief algoThief) {
		super(stage, algoThief);
	}

	@Override
	public LinkedList<Pista> visitarJuego() {

		return this.algoThief.visitarBibliotecaActual();
	}
}
