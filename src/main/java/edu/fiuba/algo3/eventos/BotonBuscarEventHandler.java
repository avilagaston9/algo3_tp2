package edu.fiuba.algo3.eventos;


import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.contenedores.ContenedorComputadora;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonBuscarEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	Scene mostrarComputadora;

	public BotonBuscarEventHandler(Stage stage, AlgoThief algoThief) {

		this.stage = new Stage(StageStyle.UNDECORATED);
		ContenedorComputadora contenedorComputadora = new ContenedorComputadora(this.stage, algoThief);
		this.mostrarComputadora = new Scene(contenedorComputadora, 1000, 760);
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		stage.setScene(mostrarComputadora);
		stage.setFullScreenExitHint("");
		stage.show();
	}
}
