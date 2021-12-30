package edu.fiuba.algo3.eventos;

import java.io.FileNotFoundException;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.contenedores.ContenedorEdificios;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonBuscarPistaEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	Scene mostrarEdificios;

	public BotonBuscarPistaEventHandler(AlgoThief algothief) {
		this.stage = new Stage(StageStyle.UNDECORATED);
		ContenedorEdificios contenedorEdificios = new ContenedorEdificios(this.stage, algothief);
		this.mostrarEdificios = new Scene(contenedorEdificios, 640, 480);
		//this.stage.initModality(Modality.APPLICATION_MODAL);
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		stage.setScene(mostrarEdificios);
		//stage.setFullScreen(true);
		//stage.setFullScreenExitHint("");
		stage.show();

	}
}
