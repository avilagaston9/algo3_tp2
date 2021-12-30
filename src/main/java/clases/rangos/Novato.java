package clases.rangos;

import java.util.List;

import clases.Tiempo;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.ObjetoRobado.ObjetoRobado;

public class Novato extends Rango {
	// private int velocidad;

	public Novato() {

		this.maximoArrestos = 5;
		this.arrestos = 0;
		// this.velocidad=900;
	}

	public Novato(int cantArrestos){

		this.maximoArrestos = 5;
		this.arrestos = cantArrestos;
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
