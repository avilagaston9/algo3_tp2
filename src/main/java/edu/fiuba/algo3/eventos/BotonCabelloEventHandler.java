package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.contenedores.ContenedorCabello;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonCabelloEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	Scene muestraCabellos;

	public BotonCabelloEventHandler(AlgoThief algoThief) {
		this.stage = new Stage(StageStyle.UNDECORATED);
		ContenedorCabello contenedorCabello = new ContenedorCabello(stage, algoThief);
		this.muestraCabellos = new Scene(contenedorCabello, 200, 200);
		this.stage.initModality(Modality.APPLICATION_MODAL);
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		this.stage.setScene(muestraCabellos);
		this.stage.show();
	}
}
