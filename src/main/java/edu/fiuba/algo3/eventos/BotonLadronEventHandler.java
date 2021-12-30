package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonLadronEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	AlgoThief algoThief;
	Ladron ladron;

	public BotonLadronEventHandler(Stage stage, AlgoThief algoThief, Ladron ladron) {
		this.stage = stage;
		this.algoThief = algoThief;
		this.ladron = ladron;

	}

	@Override
	public void handle(ActionEvent actionEvent) {
		this.algoThief.emitirOrdenDeArresto(this.ladron);
		stage.close();

	}
}
