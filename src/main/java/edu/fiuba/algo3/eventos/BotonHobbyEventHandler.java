package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.contenedores.ContenedorHobby;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonHobbyEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	Scene muestraHobbies;

	public BotonHobbyEventHandler(AlgoThief algoThief) {
		this.stage = new Stage(StageStyle.UNDECORATED);
		ContenedorHobby contenedorHobby = new ContenedorHobby(stage, algoThief);
		this.muestraHobbies = new Scene(contenedorHobby, 200, 200);
		this.stage.initModality(Modality.APPLICATION_MODAL);
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		this.stage.setScene(muestraHobbies);
		this.stage.show();

	}
}
