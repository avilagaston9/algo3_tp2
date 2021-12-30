package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonesCiudadEventHandler implements EventHandler<ActionEvent> {

	private final AlgoThief algoThief;
	private final Ciudad ciudad;
	Stage stage;

	public BotonesCiudadEventHandler(Stage stage, AlgoThief algoThief, Ciudad ciudad) {

		this.stage = stage;
		this.algoThief = algoThief;
		this.ciudad = ciudad;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		this.algoThief.viajarA(this.ciudad);
		stage.close();

	}
}
