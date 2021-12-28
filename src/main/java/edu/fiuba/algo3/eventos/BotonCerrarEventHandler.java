package edu.fiuba.algo3.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonCerrarEventHandler implements EventHandler<ActionEvent> {
	private final Stage stage;

	public BotonCerrarEventHandler(Stage stage) {

		this.stage = stage;
	}

	@Override
	public void handle(ActionEvent actionEvent) {

		this.stage.close();
	}
}
