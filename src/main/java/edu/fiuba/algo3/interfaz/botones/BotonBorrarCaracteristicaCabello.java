package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.modelo.AlgoThief;
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

		BorrarCaracteristicaEventHandler castanioHandler = new BorrarCaracteristicaEventHandler("Color de pelo del sospechos@: Castaño", algothief);
		BorrarCaracteristicaEventHandler rojoHandler = new BorrarCaracteristicaEventHandler("Color de pelo del sospechos@: Rojizo", algothief);
		BorrarCaracteristicaEventHandler rubioHandler = new BorrarCaracteristicaEventHandler("Color de pelo del sospechos@: Rubio", algothief);
		BorrarCaracteristicaEventHandler negroHandler = new BorrarCaracteristicaEventHandler("Color de pelo del sospechos@: Morocho", algothief);

		castanio.setOnAction(castanioHandler);
		rojo.setOnAction(rojoHandler);
		rubio.setOnAction(rubioHandler);
		negro.setOnAction(negroHandler);

		this.getItems().addAll(castanio, rojo, rubio, negro);
	}
}
