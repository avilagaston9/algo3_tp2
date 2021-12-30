package edu.fiuba.algo3.modelo.rangos;

import java.util.List;

import edu.fiuba.algo3.modelo.Tiempo;
import edu.fiuba.algo3.modelo.edificios.Edificio;
import edu.fiuba.algo3.modelo.ladron.Ladron;
import edu.fiuba.algo3.modelo.pistas.Pista;
import edu.fiuba.algo3.modelo.ObjetoRobado.ObjetoRobado;

public class Investigador extends Rango {

	public Investigador() {

		this.arrestos = 10;
		this.maximoArrestos = 20;
		this.nombre ="Investigador";
	}

	public Investigador(int cantArrestos){

		this.maximoArrestos = 20;
		this.arrestos = cantArrestos;
		this.nombre ="Investigador";
	}

	@Override
	public Rango siguienteRango() {
		return new Sargento();
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
