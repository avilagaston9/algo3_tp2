package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.eventos.BotonVolverEventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonVolver extends Button {

	public BotonVolver(Stage stage) {
		BotonVolverEventHandler botonVolverHandler = new BotonVolverEventHandler(stage);
	}
}
