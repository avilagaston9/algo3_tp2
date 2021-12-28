package clases.valorObjetoRobado;

import java.util.List;

import clases.Ciudad;
import clases.RutaDeEscape;
import clases.rangos.Detective;
import clases.rangos.Investigador;
import clases.rangos.Novato;
import clases.rangos.Sargento;

public abstract class ObjetoRobado {

	protected String nombreCiudad;
	protected int largoRutaDeEscape;
	protected String nombre;

	public abstract boolean esValidoPara(Novato rango);

	public abstract boolean esValidoPara(Detective rango);

	public abstract boolean esValidoPara(Investigador rango);

	public abstract boolean esValidoPara(Sargento rango);

	public abstract RutaDeEscape crearRutaDeEscape(List<Ciudad> ciudades);

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
