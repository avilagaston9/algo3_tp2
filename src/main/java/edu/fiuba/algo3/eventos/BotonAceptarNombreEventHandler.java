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
	Stage stage;
	Scene proximaEscena;

	public BotonAceptarNombreEventHandler(AlgoThief algoThief, Scene proximaEscena, TextField slotParaIngresarNombre,
			Stage stage) {
		this.slot = slotParaIngresarNombre;
		this.proximaEscena = proximaEscena;
		this.stage = stage;
		this.algoThief = algoThief;
	}

	@Override
	public void handle(ActionEvent actionEvent) {
		String nombre = this.slot.getText().trim();
		if (nombre.equals("")) {
			this.slot.requestFocus();
		} else {
			this.algoThief.setNombrePolicia(nombre);
			ContenedorInformacionInicial contenedorInfomacionInicial = new ContenedorInformacionInicial(this.stage,
					this.algoThief, this.proximaEscena);
			stage.setScene(new Scene(contenedorInfomacionInicial, 200, 200));
			stage.setFullScreen(true);
			stage.show();
		}
	}
}
