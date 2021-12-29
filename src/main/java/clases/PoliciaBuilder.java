package clases;

import clases.rangos.Rango;

public class PoliciaBuilder {

	private Ciudad ciudadInicio;
	private Rango rango;
	private RutaDeEscape rutaDeEscape;
	private String nombre;

	public void setPrimerCiudad(Ciudad ciudadInicio) {
		this.ciudadInicio = ciudadInicio;
	}

	public void setRango(Rango rango) {
		this.rango = rango;
	}

	public void setNombre(String unNombre){
		this.nombre = unNombre;
	}



	public Policia getPolicia() {
		return new Policia(this.rango, this.ciudadInicio);
	}
}
