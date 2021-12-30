package clases;

import clases.rangos.Rango;

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
