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

		BorrarCaracteristicaEventHandler tenisHandler = new BorrarCaracteristicaEventHandler("Hobby del sospechos@: Tenis", algothief);
		BorrarCaracteristicaEventHandler musicaHandler = new BorrarCaracteristicaEventHandler("Hobby del sospechos@: Musica", algothief);
		BorrarCaracteristicaEventHandler alpinismoHandler = new BorrarCaracteristicaEventHandler("Hobby del sospechos@: Alpinismo",
				algothief);
		BorrarCaracteristicaEventHandler paracaidismoHandler = new BorrarCaracteristicaEventHandler("Hobby del sospechos@: Paracaidismo",
				algothief);
		BorrarCaracteristicaEventHandler natacionHandler = new BorrarCaracteristicaEventHandler("Hobby del sospechos@: Natacion", algothief);
		BorrarCaracteristicaEventHandler croquetHandler = new BorrarCaracteristicaEventHandler("Hobby del sospechos@: Croquet", algothief);

		tenis.setOnAction(tenisHandler);
		musica.setOnAction(musicaHandler);
		alpinismo.setOnAction(alpinismoHandler);
		paracaidismo.setOnAction(paracaidismoHandler);
		natacion.setOnAction(natacionHandler);
		croquet.setOnAction(croquetHandler);

		this.getItems().addAll(tenis, musica, alpinismo, paracaidismo, natacion, croquet);

	}
}
