package edu.fiuba.algo3.botones;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BorrarCaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonBorrarCaracteristicaCabello extends MenuButton {

	public BotonBorrarCaracteristicaCabello(AlgoThief algothief) {
		this.setText("Borrar");
		MenuItem castanio = new MenuItem("Castaño");
		MenuItem rojo = new MenuItem("Rojo");
		MenuItem rubio = new MenuItem("Rubio");
		MenuItem negro = new MenuItem("Negro");

		BorrarCaracteristicaEventHandler castanioHandler = new BorrarCaracteristicaEventHandler("Castaño", algothief);
		BorrarCaracteristicaEventHandler rojoHandler = new BorrarCaracteristicaEventHandler("Rojizo", algothief);
		BorrarCaracteristicaEventHandler rubioHandler = new BorrarCaracteristicaEventHandler("Rubio", algothief);
		BorrarCaracteristicaEventHandler negroHandler = new BorrarCaracteristicaEventHandler("Morocho", algothief);

		castanio.setOnAction(castanioHandler);
		rojo.setOnAction(rojoHandler);
		rubio.setOnAction(rubioHandler);
		negro.setOnAction(negroHandler);

		this.getItems().addAll(castanio, rojo, rubio, negro);
	}
}
