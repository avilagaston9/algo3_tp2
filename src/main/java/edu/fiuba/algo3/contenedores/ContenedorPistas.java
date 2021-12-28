package edu.fiuba.algo3.contenedores;

import java.util.LinkedList;

import clases.pistas.Pista;
import edu.fiuba.algo3.eventos.BotonCerrarEventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPistas extends VBox {

	public ContenedorPistas(Stage stagePistas, LinkedList<Pista> pistas) {

		Label pista;
		for (Pista p : pistas) {

			pista = new Label(p.revelar());
			this.getChildren().add(pista);
		}
		Button botonCerrar = new Button("Entendido");
		BotonCerrarEventHandler botonCerrarHandler = new BotonCerrarEventHandler(stagePistas);
		botonCerrar.setOnAction(botonCerrarHandler);
		this.getChildren().add(botonCerrar);
	}
}
