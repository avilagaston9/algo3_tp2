package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonBuscarSospechososEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	AlgoThief algoThief;

	public BotonBuscarSospechososEventHandler(AlgoThief algothief, Stage stage) {
		this.stage = stage;
		this.algoThief = algothief;

	}
	@Override
	public void handle(ActionEvent actionEvent) {
		algoThief.buscarSospechosos();
		// this.stage.close();
	}
}
