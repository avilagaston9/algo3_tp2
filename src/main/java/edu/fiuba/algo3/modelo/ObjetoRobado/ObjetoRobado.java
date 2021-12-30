package edu.fiuba.algo3.modelo.ObjetoRobado;

import java.util.List;

import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.modelo.ladron.RutaDeEscape;
import edu.fiuba.algo3.modelo.rangos.Detective;
import edu.fiuba.algo3.modelo.rangos.Investigador;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Sargento;

public abstract class ObjetoRobado {

	protected String nombreCiudad;
	protected int largoRutaDeEscape;
	protected String nombre;

	public ObjetoRobado(String nombre, String ciudad) {
		this.nombre = nombre;
		this.nombreCiudad = ciudad;
	}

	public abstract boolean esValidoPara(Novato rango);

	public abstract boolean esValidoPara(Detective rango);

	public abstract boolean esValidoPara(Investigador rango);

	public abstract boolean esValidoPara(Sargento rango);

	public RutaDeEscape crearRutaDeEscape(List<Ciudad> ciudades) {
		return new RutaDeEscape(ciudades, this.nombreCiudad, this.largoRutaDeEscape);
	}

	public void setNombreCiudad(String nombreCiudad) {

		this.nombreCiudad = nombreCiudad;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getNombreCiudad() {
		return this.nombreCiudad;
	}
}
