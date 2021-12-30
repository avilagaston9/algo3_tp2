package edu.fiuba.algo3.modelo.rangos;

import java.util.List;

import edu.fiuba.algo3.modelo.Tiempo;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.ObjetoRobado.ObjetoRobado;

public class Novato extends Rango {
	// private int velocidad;

	public Novato() {

		this.maximoArrestos = 5;
		this.arrestos = 0;
		this.nombre ="Novato";
		// this.velocidad=900;
	}

	public Novato(int cantArrestos){

		this.maximoArrestos = 5;
		this.arrestos = cantArrestos;
		this.nombre ="Novato";
	}

	@Override
	public Rango siguienteRango() {
		return new Detective();
	}

	@Override
	public Pista visitar(Edificio unEdificio, Tiempo tiempo) {
		return unEdificio.serVisitado(this, tiempo);
	}

	@Override
	public Pista pedirPistaLadron(Ladron ladron) {
		return ladron.pedirPista(this);
	}

	@Override
	public void viajar(Tiempo tiempo, int kilometros) {
		tiempo.viajar(kilometros, this);
	}

	/*
	 * @Override public void viajar(int cantidadKms, Tiempo tiempo){
	 * tiempo.sumarHoras(cantidadKms*1/this.velocidad); }
	 * 
	 * @Override public void dormir(Tiempo tiempoTranscurrido) {
	 * 
	 * tiempoTranscurrido.sumarHoras(8); }
	 * 
	 * @Override public boolean rango() { return this.velocidad == 900; }
	 * 
	 */

	@Override
	public ObjetoRobado getObjetoRobado(List<ObjetoRobado> objetosRobados) {
		for (ObjetoRobado o : objetosRobados) {
			if (o.esValidoPara(this)) {
				return o;
			}
		}
		return null;
	}
}
