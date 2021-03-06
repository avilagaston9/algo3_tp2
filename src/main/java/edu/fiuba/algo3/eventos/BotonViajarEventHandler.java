package edu.fiuba.algo3.eventos;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.interfaz.contenedores.ContenedorCiudades;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonViajarEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	Scene muestraCiudades;

	public BotonViajarEventHandler(ArrayList<Ciudad> ciudades, AlgoThief algoThief) {
		this.stage = new Stage(StageStyle.UNDECORATED);
		ContenedorCiudades contenedorCiudades = new ContenedorCiudades(stage, ciudades, algoThief);
		this.muestraCiudades = new Scene(contenedorCiudades, 200, 500);
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		stage.setScene(muestraCiudades);
		stage.setFullScreenExitHint("");
		stage.show();

	}
}
