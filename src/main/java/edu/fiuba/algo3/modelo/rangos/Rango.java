package edu.fiuba.algo3.modelo.rangos;

import java.util.List;

import edu.fiuba.algo3.modelo.Tiempo;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.ObjetoRobado.ObjetoRobado;

public abstract class Rango {

	protected int arrestos;
	protected int maximoArrestos;

	public Rango sumarArresto() {

		this.arrestos++;
		if (this.arrestos == this.maximoArrestos) {

			return this.siguienteRango();
		}
		return this;
	}

	public abstract Rango siguienteRango();

	public abstract Pista visitar(Edificio unEdificio, Tiempo tiempo);

	public abstract Pista pedirPistaLadron(Ladron ladron);

	public abstract void viajar(Tiempo tiempo, int kilometros);

	public int cantidadArrestos() {
		return this.arrestos;
	}

	public abstract ObjetoRobado getObjetoRobado(List<ObjetoRobado> objetosRobados);

	/*
	 * 
	 * void viajar(int cantidadKms, Tiempo tiempo);
	 * 
	 * void dormir(Tiempo tiempoTranscurrido);
	 * 
	 * boolean rango();
	 * 
	 */
}
