package edu.fiuba.algo3.modelo.ladron;

import java.util.LinkedList;
import java.util.Objects;

import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.modelo.RutaDeEscape;
import edu.fiuba.algo3.modelo.Exceptions.ExcepcionSinOrdenDeArresto;
import edu.fiuba.algo3.modelo.OrdenDeArresto.OrdenArresto;
import edu.fiuba.algo3.modelo.caracteristicasLadron.CaracteristicaLadron;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.pistas.PistaSinInformacion;
import edu.fiuba.algo3.modelo.rangos.Detective;
import edu.fiuba.algo3.modelo.rangos.Investigador;
import edu.fiuba.algo3.modelo.rangos.Novato;
import edu.fiuba.algo3.modelo.rangos.Sargento;

public class Ladron {
	private final String nombre;
	private boolean arrestado;
	private int iteradorCaracteristicas;
	private LinkedList<CaracteristicaLadron> caracteristicas;
	private Ciudad ciudadFinal;
	private RutaDeEscape rutaDeEscape;

	public Ladron(String nombre, CaracteristicaLadron cabello, CaracteristicaLadron hobby, CaracteristicaLadron sexo,
			CaracteristicaLadron senia, CaracteristicaLadron vehiculo) {

		this.arrestado = false;
		this.nombre = nombre;
		this.iteradorCaracteristicas = 0;
		this.caracteristicas = new LinkedList<CaracteristicaLadron>();
		this.caracteristicas.add(cabello);
		this.caracteristicas.add(hobby);
		this.caracteristicas.add(sexo);
		this.caracteristicas.add(senia);
		this.caracteristicas.add(vehiculo);
	}

	private Pista calcularChances(double chances) {
		if (Math.random() < chances) {

			this.iteradorCaracteristicas++;
			return caracteristicas.get(iteradorCaracteristicas % 5).darPista();
		}
		return new PistaSinInformacion();
	}

	public Pista pedirPista(Novato unRango) {
		return this.calcularChances(0.8);
	}

	public Pista pedirPista(Detective unRango) {
		return this.calcularChances(0.6);
	}

	public Pista pedirPista(Investigador unRango) {
		return this.calcularChances(0.5);
	}

	public Pista pedirPista(Sargento unRango) {
		return this.calcularChances(0.5);
	}

	public boolean tieneLaCaracteristica(CaracteristicaLadron unaCaracteristica) {
		for (int i = 0; i < this.caracteristicas.size(); i++)
			if (this.caracteristicas.get(i).equals(unaCaracteristica)) {
				return true;
			}
		return false;
	}

	public boolean serArrestado(OrdenArresto ordenDeArresto, Ciudad ciudadPolicia) throws ExcepcionSinOrdenDeArresto {

		if (ciudadPolicia != ciudadFinal) {
			return false;
		}

		if (!ordenDeArresto.comparar(this)) {
			throw new ExcepcionSinOrdenDeArresto("sin orden de arresto");
		}

		return true; // caso que cumple con la orden de arresto y con estar en la misma ciudad, el
						// ladon puede ser arestado...

		/*
		 * if((ordenDeArresto.comparar(this)) && (ciudadPolicia == ciudadFinal)){
		 * this.arrestado = true; return true; }
		 */
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Ladron ladron = (Ladron) o;
		return iteradorCaracteristicas == ladron.iteradorCaracteristicas
				&& Objects.equals(caracteristicas, ladron.caracteristicas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(iteradorCaracteristicas, caracteristicas);
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudadFinal = ciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setRutaDeEscape(RutaDeEscape rutaDeEscape) {
		this.rutaDeEscape = rutaDeEscape;
	}

	public boolean ciudadPerteneceASuRutaDeEscape(Ciudad unaCiudad) {
		return (this.rutaDeEscape.pertenece(unaCiudad));
	}
}
