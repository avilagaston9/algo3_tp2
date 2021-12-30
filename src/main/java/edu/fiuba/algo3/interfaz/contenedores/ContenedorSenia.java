package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.botones.BotonBorrarCaracteristicaSenia;
import edu.fiuba.algo3.interfaz.botones.BotonCerrar;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorSenia extends VBox {

	public ContenedorSenia(AlgoThief algoThief, Stage stage) {
		Button anillo = new Button("Anillo");
		anillo.setMaxSize(200, 50);
		Button tatuaje = new Button("Tatuaje");
		tatuaje.setMaxSize(200, 50);
		Button cicatriz = new Button("Cicatriz");
		cicatriz.setMaxSize(200, 50);
		Button joyas = new Button("Joyas");
		joyas.setMaxSize(200, 50);

		CaracteristicaEventHandler anilloHandler = new CaracteristicaEventHandler("Seña particular del sospechos@: Anillo", algoThief, stage);
		CaracteristicaEventHandler tatuajeHandler = new CaracteristicaEventHandler("Seña particular del sospechos@: Tatuaje", algoThief, stage);
		CaracteristicaEventHandler cicatrizHandler = new CaracteristicaEventHandler("Seña particular del sospechos@: Cicatriz", algoThief, stage);
		CaracteristicaEventHandler joyasHandler = new CaracteristicaEventHandler("Seña particular del sospechos@: Joyas", algoThief, stage);
		BotonCerrar botonVolver = new BotonCerrar(stage, "Volver");
		BotonBorrarCaracteristicaSenia botonBorrar = new BotonBorrarCaracteristicaSenia(algoThief);

		anillo.setOnAction(anilloHandler);
		tatuaje.setOnAction(tatuajeHandler);
		cicatriz.setOnAction(cicatrizHandler);
		joyas.setOnAction(joyasHandler);

		this.getChildren().addAll(anillo, tatuaje, cicatriz, joyas, botonVolver, botonBorrar);

	}
}
