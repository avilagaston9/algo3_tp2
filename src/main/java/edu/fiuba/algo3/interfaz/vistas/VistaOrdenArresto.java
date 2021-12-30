package edu.fiuba.algo3.interfaz.vistas;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.Observador;
import javafx.scene.control.Label;

public class VistaOrdenArresto implements Observador {
	private AlgoThief algoThief;
	private Label orden;

	public VistaOrdenArresto(AlgoThief algothief, Label ordenDeArresto) {
		this.algoThief = algothief;
		this.orden = ordenDeArresto;
	}

	@Override
	public void actualizar() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orden de arresto: ");
		String orden = this.algoThief.ladronDeOrdenDeArresto();
		builder.append(orden);
		this.orden.setText(builder.toString());

	}
}
