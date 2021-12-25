package clases.rangos;

import clases.Tiempo;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.pistas.Pista;
import clases.valorObjetoRobado.ObjetoRobado;

import java.util.ArrayList;

public class Detective extends Rango {

	public Detective() {

		this.arrestos = 5;
		this.maximoArrestos = 10;
	}

	@Override
	public Rango siguienteRango() {
		return new Investigador();
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
	public ObjetoRobado getObjetoRobado(ArrayList<ObjetoRobado> objetosRobados) {
		for (ObjetoRobado o : objetosRobados){
			if (o.esValidoPara(this)){
				return o;
			}
		}
		return null;
	}

	/*
	 * @Override public void viajar(int cantidadKms, Tiempo tiempo) {
	 * 
	 * }
	 * 
	 * @Override public void dormir(Tiempo tiempoTranscurrido) {
	 * 
	 * }
	 * 
	 * @Override public boolean rango() { return false; }
	 * 
	 */


}
