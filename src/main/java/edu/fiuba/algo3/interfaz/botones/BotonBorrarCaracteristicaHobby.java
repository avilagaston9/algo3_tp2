package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BorrarCaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonBorrarCaracteristicaHobby extends MenuButton {

	public BotonBorrarCaracteristicaHobby(AlgoThief algothief) {
		this.setText("Borrar");
		MenuItem tenis = new MenuItem("Tenis");
		MenuItem musica = new MenuItem("Musica");
		MenuItem alpinismo = new MenuItem("Alpinismo");
		MenuItem paracaidismo = new MenuItem("Paracaidismo");
		MenuItem natacion = new MenuItem("Natacion");
		MenuItem croquet = new MenuItem("Croquet");

		BorrarCaracteristicaEventHandler tenisHandler = new BorrarCaracteristicaEventHandler("Tenis", algothief);
		BorrarCaracteristicaEventHandler musicaHandler = new BorrarCaracteristicaEventHandler("Musica", algothief);
		BorrarCaracteristicaEventHandler alpinismoHandler = new BorrarCaracteristicaEventHandler("Alpinismo",
				algothief);
		BorrarCaracteristicaEventHandler paracaidismoHandler = new BorrarCaracteristicaEventHandler("Paracaidismo",
				algothief);
		BorrarCaracteristicaEventHandler natacionHandler = new BorrarCaracteristicaEventHandler("Natacion", algothief);
		BorrarCaracteristicaEventHandler croquetHandler = new BorrarCaracteristicaEventHandler("Croquet", algothief);

		tenis.setOnAction(tenisHandler);
		musica.setOnAction(musicaHandler);
		alpinismo.setOnAction(alpinismoHandler);
		paracaidismo.setOnAction(paracaidismoHandler);
		natacion.setOnAction(paracaidismoHandler);
		croquet.setOnAction(paracaidismoHandler);

		this.getItems().addAll(tenis, musica, alpinismo, paracaidismo, natacion, croquet);

	}
}
