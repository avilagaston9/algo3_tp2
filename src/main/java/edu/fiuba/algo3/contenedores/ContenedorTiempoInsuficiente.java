package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.botones.BotonCerrar;
import edu.fiuba.algo3.botones.BotonVolverAJugar;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ContenedorTiempoInsuficiente extends VBox {
	public ContenedorTiempoInsuficiente(AlgoThief algothief, Stage stage) {

		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPadding(new Insets(25));
		this.setAlignment(Pos.CENTER);

		Label texto = new Label(("¡Game Over!\n" + algothief.getNombrePolicia() + ", te haz quedado sin tiempo y "
				+ algothief.getNombreLadron() + "sigue suelto."));
		texto.setFont(new Font("Verdana", 14));
		BotonVolverAJugar botonVolverAJugar = new BotonVolverAJugar(algothief);
		BotonCerrar botonCerrar = new BotonCerrar(stage, "Salir");

		this.getChildren().addAll(texto, botonVolverAJugar, botonCerrar);
	}
}
