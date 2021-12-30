package edu.fiuba.algo3.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonEntendidoEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	Scene esceneActual;

	public BotonEntendidoEventHandler(Stage stage, Scene proximaEscena) {
		this.stage = stage;
		this.esceneActual = proximaEscena;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		this.stage.setScene(esceneActual);
		this.stage.show();
	}
}
