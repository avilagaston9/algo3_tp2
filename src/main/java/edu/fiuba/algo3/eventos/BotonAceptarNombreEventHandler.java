package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import edu.fiuba.algo3.contenedores.ContenedorInformacionInicial;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BotonAceptarNombreEventHandler implements EventHandler<ActionEvent> {
	private final AlgoThief algoThief;
	TextField slot;

	public BotonAceptarNombreEventHandler(AlgoThief algoThief, TextField slotParaIngresarNombre) {

		this.slot = slotParaIngresarNombre;
		this.algoThief = algoThief;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		String nombre = this.slot.getText().trim();
		if (nombre.equals("")) {
			this.slot.requestFocus();
		} else {
			this.algoThief.setNombrePolicia(nombre);
			this.algoThief.iniciarJuego();
		}
	}
}
