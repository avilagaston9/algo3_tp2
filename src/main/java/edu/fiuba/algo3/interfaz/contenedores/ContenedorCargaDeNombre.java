package edu.fiuba.algo3.interfaz.contenedores;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BotonAceptarNombreEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorCargaDeNombre extends VBox {

	public ContenedorCargaDeNombre(Stage stage, AlgoThief algoThief) {

		this.setAlignment(Pos.CENTER);
		this.setSpacing(160);
		this.setPadding(new Insets(15));
		this.setAlignment(Pos.BOTTOM_CENTER);
		this.setImagenFondo();

		// Contenido de la pantalla
		Label textoIntroduccion = new Label("Bienvenido, agente.\nPor favor, identifíquese a continuación:");
		textoIntroduccion.setStyle("-fx-text-fill: black; -fx-text-alignment: center");

		TextField slotParaIngresarNombre = new TextField();
		slotParaIngresarNombre.setStyle("-fx-alignment: center");
		slotParaIngresarNombre.setMaxWidth(300);

		VBox pantalla = new VBox(textoIntroduccion, slotParaIngresarNombre);
		pantalla.setSpacing(20);
		pantalla.setAlignment(Pos.BOTTOM_CENTER);

		// Resto de la vista
		Button botonOk = new Button("Confirmar");
		botonOk.setMinWidth(120);

		BotonAceptarNombreEventHandler botonOkHandler = new BotonAceptarNombreEventHandler(algoThief, slotParaIngresarNombre);
		botonOk.setOnAction(botonOkHandler);

		this.getChildren().addAll(pantalla, botonOk);
	}

	private void setImagenFondo() {

		Image imagen = new Image(Resources.FondoInfoRuta());
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));
	}
}
