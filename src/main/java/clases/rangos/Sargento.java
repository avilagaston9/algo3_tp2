package clases.rangos;

import java.util.List;

import clases.Tiempo;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.ObjetoRobado.ObjetoRobado;

public class Sargento extends Rango {

	public Sargento() {

		this.arrestos = 20;
		this.maximoArrestos = 0;
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
