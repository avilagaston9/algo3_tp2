package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.Observador;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class VistaCiudad implements Observador {
	private Label descripcion;
	private AlgoThief juego;
	private Label nombreCiudad;

	public VistaCiudad(AlgoThief juego, Label nombreCiudad) {
		this.juego = juego;
		this.nombreCiudad = nombreCiudad;
	}
	@Override
	public void actualizar() {

		String nombreCiudad = juego.getNombreCiudadActual();
		this.nombreCiudad.setText(nombreCiudad);
		this.nombreCiudad.setFont(new Font("Verdana", 35));
	}
}
