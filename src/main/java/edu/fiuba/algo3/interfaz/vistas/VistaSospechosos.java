package edu.fiuba.algo3.interfaz.vistas;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.Computadora;
import edu.fiuba.algo3.modelo.Observador;
import javafx.scene.control.Label;

public class VistaSospechosos implements Observador {

	private final AlgoThief algoThief;
	private Label labelSospechosos;

	public VistaSospechosos(AlgoThief algoThief, Label label) {

		this.algoThief = algoThief;
		this.labelSospechosos = label;
	}

	@Override
	public void actualizar() {
		StringBuilder stringBuilder = new StringBuilder();

		Computadora computadora = algoThief.getComputadora();
		ArrayList<String> sospechosos = computadora.getNombresSospechosos();

		for (String s : sospechosos) {
			stringBuilder.append(s).append("\n");
		}
		this.labelSospechosos.setText(stringBuilder.toString());
	}

}
