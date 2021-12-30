package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.caracteristicasLadron.CaracteristicaLadron;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class CaracteristicaEventHandler implements EventHandler<ActionEvent> {
	Stage stage;
	CaracteristicaLadron caracteristica;
	AlgoThief algoThief;

	public CaracteristicaEventHandler(String Caracteristica, AlgoThief algoThief, Stage stage) {
		this.stage = stage;
		this.caracteristica = new CaracteristicaLadron(Caracteristica);
		this.algoThief = algoThief;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		this.algoThief.cargarCaracteristica(this.caracteristica);
		stage.close();

	}
}
