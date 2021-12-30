package edu.fiuba.algo3.interfaz.contenedores;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.eventos.BotonLadronEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorLadrones extends VBox {
	ArrayList<Ladron> listaSospechosos;

	public ContenedorLadrones(Stage stage, AlgoThief algoThief) {
		super();
		this.listaSospechosos = algoThief.getSospechosos();
		for (int i = 0; i < this.listaSospechosos.size(); i++) {
			Button botonLadron = new Button(listaSospechosos.get(i).getNombre());
			botonLadron.setMaxSize(200, 50);
			BotonLadronEventHandler botonLadronHandler = new BotonLadronEventHandler(stage, algoThief,
					listaSospechosos.get(i));
			botonLadron.setOnAction(botonLadronHandler);
			this.getChildren().add(botonLadron);
		}
	}
}
