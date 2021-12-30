package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BorrarCaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonBorrarCaracteristicaSexo extends MenuButton {
	public BotonBorrarCaracteristicaSexo(AlgoThief algothief) {
		this.setText("Borrar");
		MenuItem masculino = new MenuItem("Masculino");
		MenuItem femenino = new MenuItem("Femenino");

		BorrarCaracteristicaEventHandler masculinoHandler = new BorrarCaracteristicaEventHandler("Sexo del sospechos@: Masculino",
				algothief);
		BorrarCaracteristicaEventHandler femeninoHandler = new BorrarCaracteristicaEventHandler("Sexo del sospechos@: Femenino", algothief);

		masculino.setOnAction(masculinoHandler);
		femenino.setOnAction(femeninoHandler);

		this.getItems().addAll(masculino, femenino);

	}
}
