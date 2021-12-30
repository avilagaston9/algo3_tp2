package edu.fiuba.algo3.modelo.Policia;

import edu.fiuba.algo3.modelo.rangos.Rango;

public class PoliciaBuilder {

	private Rango rango;
	private String nombre;

	public void setRango(Rango rango) {
		this.rango = rango;
	}

	public void setNombre(String unNombre){
		this.nombre = unNombre;
	}



	public Policia getPolicia() {
		return new Policia(this.rango, this.nombre);
	}
}
