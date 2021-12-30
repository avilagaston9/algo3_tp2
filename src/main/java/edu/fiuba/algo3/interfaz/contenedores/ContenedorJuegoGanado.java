package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.botones.BotonTerminarJuego;
import edu.fiuba.algo3.interfaz.botones.BotonVolverAJugar;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ContenedorJuegoGanado extends VBox {

	public ContenedorJuegoGanado(AlgoThief algothief, Stage stage) {

		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPadding(new Insets(25));
		this.setAlignment(Pos.CENTER);
		this.setFondo();

		Label texto = new Label(("Felicidades, " + algothief.getNombrePolicia() + "!!! \n" + algothief.getNombreLadron()
				+ ", ahora está tras las rejas."));
		texto.setFont(new Font("Verdana", 14));

		BotonTerminarJuego botonSalirDeJuego = new BotonTerminarJuego(algothief, stage);
		BotonVolverAJugar botonVolverAJugar = new BotonVolverAJugar(algothief);

		this.getChildren().addAll(texto, botonVolverAJugar, botonSalirDeJuego);
	}
	private void setFondo() {

		Image imagen = new Image(Resources.FondoJuegoRuta());
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));
	}
}
