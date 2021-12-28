package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.Observador;
import javafx.scene.control.Label;

public class VistaCiudad implements Observador {
	private AlgoThief juego;
	private Label cuadro;

	public VistaCiudad(AlgoThief juego, Label label) {
		this.juego = juego;
		this.cuadro = label;
	}
	@Override
	public void actualizar() {

		String nombreCiudad = juego.getNombreCiudadActual();

		this.cuadro.setText(nombreCiudad);
	}
}
