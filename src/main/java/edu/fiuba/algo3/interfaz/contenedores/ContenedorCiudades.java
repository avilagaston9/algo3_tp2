package edu.fiuba.algo3.interfaz.contenedores;

import java.util.ArrayList;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.interfaz.botones.BotonCerrar;
import edu.fiuba.algo3.eventos.BotonesCiudadEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorCiudades extends VBox {

	public ContenedorCiudades(Stage stage, ArrayList<Ciudad> ciudades, AlgoThief algoThief) {
		super();
		for (int i = 0; i < ciudades.size(); i++) {
			Button botonCiudad = new Button(ciudades.get(i).nombreCiudad());
			botonCiudad.setMaxSize(200, 100);
			BotonesCiudadEventHandler botonCiudadHandler = new BotonesCiudadEventHandler(stage, algoThief,
					ciudades.get(i));
			botonCiudad.setOnAction(botonCiudadHandler);
			this.getChildren().add(botonCiudad);
		}
		BotonCerrar botonVolver = new BotonCerrar(stage, "Volver");
		botonVolver.setMaxSize(200, 100);
		botonVolver.setStyle("-fx-background-color: red");
		this.getChildren().add(botonVolver);
		this.setWidth(200);
		this.setFondo();
	}

	private void setFondo() {
		Image imagen = new Image(Resources.FondoJuegoFinalLiso());
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
		BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));

	}


}
