package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonAceptarNombreEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorCargaDeNombre extends VBox {

	public ContenedorCargaDeNombre(Stage stage, AlgoThief algoThief) {

		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPadding(new Insets(25));
		this.setAlignment(Pos.CENTER);

		this.setImagenFondo();

		TextField slotParaIngresarNombre = new TextField();
		slotParaIngresarNombre.setPromptText("Ingrese su nombre");

		Button botonOk = new Button("Ingresar nombre");

		BotonAceptarNombreEventHandler botonOkHandler = new BotonAceptarNombreEventHandler(algoThief, slotParaIngresarNombre);
		botonOk.setOnAction(botonOkHandler);

		this.getChildren().addAll(slotParaIngresarNombre, botonOk);
	}

	private void setImagenFondo() {

		Image imagen = new Image("file:src/imagenes/textura.png");
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));
	}
}
