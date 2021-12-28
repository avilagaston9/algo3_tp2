package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.botones.BotonCerrar;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorJuegoGanado extends VBox {

	public ContenedorJuegoGanado(AlgoThief algothief, Stage stage) {

		Label texto = new Label(("Felicidades, " + algothief.getNombrePolicia() + "!!! \n" + algothief.getNombreLadron()
				+ ", ahora está tras las rejas."));

		BotonCerrar botonCerrar = new BotonCerrar(stage, "Salir");

		this.getChildren().addAll(texto, botonCerrar);
	}
}
