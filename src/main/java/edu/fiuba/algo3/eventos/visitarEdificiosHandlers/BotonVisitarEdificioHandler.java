package edu.fiuba.algo3.eventos.visitarEdificiosHandlers;

import java.util.LinkedList;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.interfaz.contenedores.ContenedorPistas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public abstract class BotonVisitarEdificioHandler implements EventHandler<ActionEvent> {

	protected final AlgoThief algoThief;
	protected Stage stage;

	public BotonVisitarEdificioHandler(Stage stage, AlgoThief algoThief) {
		this.algoThief = algoThief;
		this.stage = stage;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		LinkedList<Pista> pistas = this.visitarJuego();
		Stage stagePistas = new Stage(StageStyle.UNDECORATED);
		ContenedorPistas contenedorPistas = new ContenedorPistas(stagePistas, pistas);
		stagePistas.setScene(new Scene(contenedorPistas, 640, 480));

		stagePistas.show();
		stage.close();
	}

	public abstract LinkedList<Pista> visitarJuego();
}
