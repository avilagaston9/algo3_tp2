package edu.fiuba.algo3.interfaz.vistas;

import java.util.ArrayList;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.Computadora;
import edu.fiuba.algo3.modelo.Observador;
import javafx.scene.control.Label;

public class VistaCaracteristicas implements Observador {

	private final AlgoThief algoThief;
	private Label labelCaracteristicas;

	public VistaCaracteristicas(AlgoThief algoThief, Label label) {

		this.algoThief = algoThief;
		this.labelCaracteristicas = label;
	}

	@Override
	public void actualizar() {
		StringBuilder stringBuilder = new StringBuilder();

		Computadora computadora = algoThief.getComputadora();
		ArrayList<String> caracteristicas = computadora.getCaracteristicas();

		for (String s : caracteristicas) {
			stringBuilder.append(s).append("\n");
		}
		this.labelCaracteristicas.setText(stringBuilder.toString());
	}
}
