package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.modelo.edificios.Aeropuerto;
import edu.fiuba.algo3.modelo.edificios.Banco;
import edu.fiuba.algo3.modelo.edificios.Biblioteca;

public class CiudadBuilder {
	private Banco banco;
	private Biblioteca biblioteca;
	private Aeropuerto aeropuerto;
	private Coordenadas coordenadas;
	private String nombre;
	private String descripcion;

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	public void setDescripcion(String descripcionCiudad) {
		this.descripcion = descripcionCiudad;
	}

	public Ciudad getCiudad() {
		return new Ciudad(this.nombre, this.coordenadas, this.banco, this.biblioteca, this.aeropuerto, this.descripcion);
	}
}
