package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BorrarCaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonBorrarCaracteristicaSenia extends MenuButton {
	public BotonBorrarCaracteristicaSenia(AlgoThief algothief) {
		this.setText("Borrar");
		MenuItem anillo = new MenuItem("Anillo");
		MenuItem tatuaje = new MenuItem("Tatuaje");
		MenuItem cicatriz = new MenuItem("Cicatriz");
		MenuItem joyas = new MenuItem("Joyas");

		BorrarCaracteristicaEventHandler anilloHandler = new BorrarCaracteristicaEventHandler("Seña particular del sospechos@: Anillo", algothief);
		BorrarCaracteristicaEventHandler tatuajeHandler = new BorrarCaracteristicaEventHandler("Seña particular del sospechos@: Tatuaje", algothief);
		BorrarCaracteristicaEventHandler cicatrizHandler = new BorrarCaracteristicaEventHandler("Seña particular del sospechos@: Cicatriz", algothief);
		BorrarCaracteristicaEventHandler joyasHandler = new BorrarCaracteristicaEventHandler("Seña particular del sospechos@: Joyas", algothief);

		anillo.setOnAction(anilloHandler);
		tatuaje.setOnAction(tatuajeHandler);
		cicatriz.setOnAction(cicatrizHandler);
		joyas.setOnAction(joyasHandler);

		this.getItems().addAll(anillo, tatuaje, cicatriz, joyas);
	}
}
