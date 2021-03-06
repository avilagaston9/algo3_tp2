package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.botones.BotonBorrarCaracteristicaSexo;
import edu.fiuba.algo3.interfaz.botones.BotonCerrar;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorSexo extends VBox {

	public ContenedorSexo(AlgoThief algoThief, Stage stage) {
		Button masculino = new Button("Masculino");
		masculino.setMaxSize(200, 100);
		Button femenino = new Button("Femenino");
		femenino.setMaxSize(200, 100);
		BotonCerrar botonVolver = new BotonCerrar(stage, "Volver");
		BotonBorrarCaracteristicaSexo botonBorrar = new BotonBorrarCaracteristicaSexo(algoThief);

		CaracteristicaEventHandler masculinoHandler = new CaracteristicaEventHandler("Sexo del sospechos@: Masculino", algoThief, stage);
		CaracteristicaEventHandler femeninoHandler = new CaracteristicaEventHandler("Sexo del sospechos@: Femenino", algoThief, stage);

		masculino.setOnAction(masculinoHandler);
		femenino.setOnAction(femeninoHandler);

		this.getChildren().addAll(masculino, femenino, botonVolver, botonBorrar);

	}
}
