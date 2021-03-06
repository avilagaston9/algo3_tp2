package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.caracteristicasLadron.CaracteristicaLadron;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BorrarCaracteristicaEventHandler implements EventHandler<ActionEvent> {
	AlgoThief algothief;
	CaracteristicaLadron caracteristica;

	public BorrarCaracteristicaEventHandler(String caracteristica, AlgoThief algothief) {
		this.algothief = algothief;
		this.caracteristica = new CaracteristicaLadron(caracteristica);

	}

	@Override
	public void handle(ActionEvent actionEvent) {
		this.algothief.borrarCaracteristica(this.caracteristica);
	}
}
