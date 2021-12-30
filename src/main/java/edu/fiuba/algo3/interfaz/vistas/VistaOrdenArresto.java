package edu.fiuba.algo3.interfaz.vistas;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.Observador;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class VistaOrdenArresto implements Observador {
	private AlgoThief algoThief;
	private Label orden;

	public VistaOrdenArresto(AlgoThief algothief, Label ordenDeArresto) {
		this.algoThief = algothief;
		this.orden = ordenDeArresto;
		this.orden.setFont(new Font("Verdana", 13));
	}

	@Override
	public void actualizar() {
		StringBuilder builder = new StringBuilder();
		builder.append("Orden de arresto realizada: ");
		String orden = this.algoThief.ladronDeOrdenDeArresto();
		builder.append(orden);
		this.orden.setText(builder.toString());
	}
}
