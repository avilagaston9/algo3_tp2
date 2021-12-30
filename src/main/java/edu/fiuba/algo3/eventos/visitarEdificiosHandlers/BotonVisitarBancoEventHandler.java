package edu.fiuba.algo3.eventos.visitarEdificiosHandlers;

import java.util.LinkedList;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.pistas.Pista;
import javafx.stage.Stage;

public class BotonVisitarBancoEventHandler extends BotonVisitarEdificioHandler {
	public BotonVisitarBancoEventHandler(Stage stage, AlgoThief algoThief) {
		super(stage, algoThief);
	}

	@Override
	public LinkedList<Pista> visitarJuego() {

		return this.algoThief.visitarBancoActual();
	}
}
