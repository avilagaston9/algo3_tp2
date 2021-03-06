package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.botones.BotonBorrarCaracteristicaVehiculo;
import edu.fiuba.algo3.interfaz.botones.BotonCerrar;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorVehiculos extends VBox {

	public ContenedorVehiculos(AlgoThief algoThief, Stage stage) {
		Button descapotable = new Button("Descapotable");
		descapotable.setMaxSize(200, 50);
		Button limusina = new Button("Limusina");
		limusina.setMaxSize(200, 50);
		Button deportivo = new Button("Deportivo");
		deportivo.setMaxSize(200, 50);
		Button moto = new Button("Moto");
		moto.setMaxSize(200, 50);
		BotonCerrar botonVolver = new BotonCerrar(stage, "Volver");
		BotonBorrarCaracteristicaVehiculo botonBorrar = new BotonBorrarCaracteristicaVehiculo(algoThief);

		CaracteristicaEventHandler descapotableHandler = new CaracteristicaEventHandler("Vehículo del sospechos@: Descapotable", algoThief,
				stage);
		CaracteristicaEventHandler limusinaHandler = new CaracteristicaEventHandler("Vehículo del sospechos@: Limusina", algoThief, stage);
		CaracteristicaEventHandler deportivoHandler = new CaracteristicaEventHandler("Vehículo del sospechos@: Deportivo", algoThief, stage);
		CaracteristicaEventHandler motoHandler = new CaracteristicaEventHandler("Vehículo del sospechos@: Moto", algoThief, stage);

		descapotable.setOnAction(descapotableHandler);
		limusina.setOnAction(limusinaHandler);
		deportivo.setOnAction(deportivoHandler);
		moto.setOnAction(motoHandler);

		this.getChildren().addAll(deportivo, descapotable, limusina, moto, botonVolver, botonBorrar);
	}
}
