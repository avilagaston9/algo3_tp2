package clases;

import java.util.ArrayList;

import clases.OrdenDeArresto.OrdenArresto;
import clases.OrdenDeArresto.OrdenDeArresto;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;
import edu.fiuba.algo3.vistas.VistaCaracteristicas;

public class Computadora {
	private ArrayList<Ladron> ladrones;
	private ArrayList<CaracteristicaLadron> caracteristicas;
	private ArrayList<Observador> observadores;

	public Computadora(ArrayList<Ladron> unosLadrones) {
		this.ladrones = unosLadrones;
		this.caracteristicas = new ArrayList<CaracteristicaLadron>();
		this.observadores = new ArrayList<Observador>();
	}

	// public ArrayList<Ladron> cargarDatosYBuscar(List<CaracteristicaLadron>
	// caracteristicas, Tiempo tiempo) {
	// ArrayList<Ladron> sospechosos= (ArrayList<Ladron>) this.ladrones.clone();
	// for (int i=0;i<caracteristicas.size();i++) {
	// ArrayList<Ladron>posiblesSospechosos= new ArrayList<>();
	// for (int j = 0; j < sospechosos.size(); j++) {
	// if (sospechosos.get(j).tieneLaCaracteristica(caracteristicas.get(i))) {
	// posiblesSospechosos.add(sospechosos.get(j));
	// }
	// }
	// sospechosos = (ArrayList<Ladron>) posiblesSospechosos.clone();
	// }
	// tiempo.sumarHoras(3);
	// return sospechosos;
	// }//todo borrar basura vieja

	public void cargarCaracteristica(CaracteristicaLadron caracteristica) {
		caracteristicas.add(caracteristica);
		this.actualizarObservadores();
	}

	public ArrayList<Ladron> buscarSospechosos() {
		ArrayList<Ladron> sospechosos = new ArrayList<Ladron>();

		for (Ladron unLadron : this.ladrones) {
			boolean cumple = true;
			for (CaracteristicaLadron unaCaracterisica : this.caracteristicas) {
				if (!unLadron.tieneLaCaracteristica(unaCaracterisica)) {
					cumple = false;
					break;
				}
			}
			if (cumple) {
				sospechosos.add(unLadron);
			}
		}
		this.actualizarObservadores();
		return sospechosos;
	}

	public OrdenArresto emitirOrdenDeArresto(Ladron unLadron) {

		ArrayList<Ladron> ladronesSospechosos = new ArrayList<>();
		ladronesSospechosos = this.buscarSospechosos();

		for (Ladron sospechoso : ladronesSospechosos)
			if (sospechoso == unLadron) {
				OrdenDeArresto orden = new OrdenDeArresto(unLadron);
				return orden;
			}
		return null;
	}

	public ArrayList<String> getCaracteristicas() {
		ArrayList<String> caracteristicas = new ArrayList<>();

		for (CaracteristicaLadron c: this.caracteristicas){
			caracteristicas.add(c.getPista().revelar());
		}
		return caracteristicas;
	}

	public void setObservador(Observador vista) {
		this.observadores.add(vista);
	}

	private void actualizarObservadores() {
		for(Observador o : this.observadores){
			o.actualizar();
		}
	}
}
