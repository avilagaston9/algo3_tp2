package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import clases.ladron.Ladron;
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
