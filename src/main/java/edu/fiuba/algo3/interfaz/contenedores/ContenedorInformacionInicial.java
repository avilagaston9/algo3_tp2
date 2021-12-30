package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BotonEntendidoEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ContenedorInformacionInicial extends VBox {

	public ContenedorInformacionInicial(Stage stage, AlgoThief algoThief, Scene proximaEscena) {

		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPadding(new Insets(25));
		this.setAlignment(Pos.CENTER);

		this.setImagenFondo();
		String nombreObjetoRobado = algoThief.nombreObjetoRobado();
		String nombreCiudadInicial = algoThief.nombreCiudadInicial();
		String nombrePolicia = algoThief.getNombrePolicia();
		String rangoPolicia = algoThief.getRangoPolicia();

		Label informacion = new Label(
				"Bienvenido " + rangoPolicia + " " + nombrePolicia + ".\n Le ha sido asignado el caso del robo de "
						+ nombreObjetoRobado + "\n en la ciudad de " + nombreCiudadInicial + ".");
		informacion.setFont(new Font("Verdana", 14));

		Button botonEntendido = new Button("Entendido");

		BotonEntendidoEventHandler botonEntendidoHandler = new BotonEntendidoEventHandler(stage,
				proximaEscena);
		botonEntendido.setOnAction(botonEntendidoHandler);

		this.getChildren().addAll(informacion, botonEntendido);

	}

	private void setImagenFondo() {

		Image imagen = new Image(Resources.FondoJuegoRuta());
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));
	}
}
