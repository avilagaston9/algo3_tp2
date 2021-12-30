package edu.fiuba.algo3.modelo.rangos;

import java.util.List;

import edu.fiuba.algo3.modelo.Tiempo;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.ObjetoRobado.ObjetoRobado;

public class Sargento extends Rango {

	public Sargento() {

		this.arrestos = 20;
		this.maximoArrestos = 0;
	}

	public Sargento(int cantArrestos){

		this.maximoArrestos = 0;
		this.arrestos = cantArrestos;
	}

	@Override
	public Rango siguienteRango() {
		return this;
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
	public void viajar(Tiempo tiempo, int kilometos) {
		tiempo.viajar(kilometos, this);
	}

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
