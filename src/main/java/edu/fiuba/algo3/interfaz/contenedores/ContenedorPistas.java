package edu.fiuba.algo3.interfaz.contenedores;

import java.util.LinkedList;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.eventos.BotonCerrarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ContenedorPistas extends VBox {

	public ContenedorPistas(Stage stagePistas, LinkedList<Pista> pistas) {

		Label pista;
		int i = 1;
		for (Pista p : pistas) {

			pista = new Label("Pista " + i + ": " + p.revelar());
			pista.setFont(new Font("Verdana", 16));
			this.getChildren().add(pista);
			i++;
		}

		this.setAlignment(Pos.CENTER);
		this.setSpacing(20);
		this.setPadding(new Insets(25));
		this.setAlignment(Pos.CENTER);
		this.setFondo();
		Button botonCerrar = new Button("Entendido");
		BotonCerrarEventHandler botonCerrarHandler = new BotonCerrarEventHandler(stagePistas);
		botonCerrar.setOnAction(botonCerrarHandler);
		this.getChildren().add(botonCerrar);
	}
	private void setFondo() {

		Image imagen = new Image(Resources.FondoJuegoRuta());
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));
	}
}
