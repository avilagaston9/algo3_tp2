package edu.fiuba.algo3.controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControladorJugar implements EventHandler<ActionEvent> {

	private final Stage stage;
	private Button miBoton;
	public ControladorJugar(Button boton, Stage stage) {

		this.stage = stage;
		this.miBoton = boton;
	}

	@Override
	public void handle(ActionEvent actionEvent) {

		String textoClickeado = "Ha comenzado el juego";
		this.miBoton.setText(textoClickeado);

		// AlgoThief juego = new Algothief();
	}
}
