package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BorrarCaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class BotonBorrarCaracteristicaVehiculo extends MenuButton {
	public BotonBorrarCaracteristicaVehiculo(AlgoThief algothief) {
		this.setText("Borrar");
		MenuItem descapotable = new MenuItem("Descapotable");
		MenuItem deportivo = new MenuItem("Deportivo");
		MenuItem limusina = new MenuItem("Limusina");
		MenuItem moto = new MenuItem("Moto");

		BorrarCaracteristicaEventHandler descapotableHandler = new BorrarCaracteristicaEventHandler("Vehículo del sospechos@: Descapotable",
				algothief);
		BorrarCaracteristicaEventHandler deportivoHandler = new BorrarCaracteristicaEventHandler("Vehículo del sospechos@: Deportivo",
				algothief);
		BorrarCaracteristicaEventHandler limusinaHandler = new BorrarCaracteristicaEventHandler("Vehículo del sospechos@: Limusina", algothief);
		BorrarCaracteristicaEventHandler motoHandler = new BorrarCaracteristicaEventHandler("Vehículo del sospechos@: Moto", algothief);

		descapotable.setOnAction(descapotableHandler);
		deportivo.setOnAction(deportivoHandler);
		limusina.setOnAction(limusinaHandler);
		moto.setOnAction(motoHandler);

		this.getItems().addAll(descapotable, deportivo, limusina, moto);
	}
}
