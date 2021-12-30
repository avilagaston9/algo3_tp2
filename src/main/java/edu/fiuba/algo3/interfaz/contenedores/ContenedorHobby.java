package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.botones.BotonBorrarCaracteristicaHobby;
import edu.fiuba.algo3.interfaz.botones.BotonCerrar;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorHobby extends VBox {

	public ContenedorHobby(Stage stage, AlgoThief algoThief) {
		Button tenis = new Button("Tenis");
		Button musica = new Button("Musica");
		Button alpinismo = new Button("Alpinismo");
		Button paracaidismo = new Button("Paracaidismo");
		Button natacion = new Button("Natacion");
		Button croquet = new Button("Croquet");
		BotonCerrar botonVolver = new BotonCerrar(stage, "Volver");
		BotonBorrarCaracteristicaHobby botonBorrar = new BotonBorrarCaracteristicaHobby(algoThief);

		CaracteristicaEventHandler tenisHandler = new CaracteristicaEventHandler("Hobby del sospechos@: Tenis", algoThief, stage);
		CaracteristicaEventHandler musicaHandler = new CaracteristicaEventHandler("Hobby del sospechos@: Musica", algoThief, stage);
		CaracteristicaEventHandler alpinismoHandler = new CaracteristicaEventHandler("Hobby del sospechos@: Alpinismo", algoThief, stage);
		CaracteristicaEventHandler paracaidismoHandler = new CaracteristicaEventHandler("Hobby del sospechos@: Paracaidismo", algoThief,
				stage);
		CaracteristicaEventHandler natacionHandler = new CaracteristicaEventHandler("Hobby del sospechos@: Natacion", algoThief, stage);
		CaracteristicaEventHandler croquetHandler = new CaracteristicaEventHandler("Hobby del sospechos@: Croquet", algoThief, stage);

		tenis.setOnAction(tenisHandler);
		musica.setOnAction(musicaHandler);
		alpinismo.setOnAction(alpinismoHandler);
		paracaidismo.setOnAction(paracaidismoHandler);
		natacion.setOnAction(natacionHandler);
		croquet.setOnAction(croquetHandler);

		this.getChildren().addAll(tenis, musica, alpinismo, paracaidismo, natacion, croquet, botonVolver, botonBorrar);

	}
}
