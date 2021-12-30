package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.botones.BotonBorrarCaracteristicaCabello;
import edu.fiuba.algo3.interfaz.botones.BotonCerrar;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorCabello extends VBox {

	public ContenedorCabello(Stage stage, AlgoThief algoThief) {

		Button castanio = new Button("Castaño");
		castanio.setMaxSize(200, 50);
		Button rubio = new Button("Rubio");
		rubio.setMaxSize(200, 50);
		Button Rojo = new Button("Rojo");
		Rojo.setMaxSize(200, 50);
		Button Negro = new Button("Negro");
		BotonCerrar botonVolver = new BotonCerrar(stage, "Volver");
		BotonBorrarCaracteristicaCabello botonBorrar = new BotonBorrarCaracteristicaCabello(algoThief);

		CaracteristicaEventHandler castanioHandler = new CaracteristicaEventHandler("Color de pelo del sospechos@: Castaño", algoThief, stage);
		CaracteristicaEventHandler rubioHandler = new CaracteristicaEventHandler("Color de pelo del sospechos@: Rubio", algoThief, stage);
		CaracteristicaEventHandler rojoHandler = new CaracteristicaEventHandler("Color de pelo del sospechos@: Rojizo", algoThief, stage);
		CaracteristicaEventHandler negroHandler = new CaracteristicaEventHandler("Color de pelo del sospechos@: Morocho", algoThief, stage);

		castanio.setOnAction(castanioHandler);
		rubio.setOnAction(rubioHandler);
		Rojo.setOnAction(rojoHandler);
		Negro.setOnAction(negroHandler);

		this.getChildren().addAll(castanio, rubio, Rojo, Negro, botonVolver, botonBorrar);

	}
}
