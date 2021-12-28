package clases;

import java.util.ArrayList;

import clases.OrdenDeArresto.OrdenArresto;
import clases.OrdenDeArresto.OrdenDeArresto;
import clases.caracteristicasLadron.CaracteristicaLadron;
import clases.ladron.Ladron;

public class Computadora {
	private ArrayList<Ladron> ladrones;
	private ArrayList<CaracteristicaLadron> caracteristicas;
	private ArrayList<Observador> observadores;
	private ArrayList<Ladron> sospechosos;

	public Computadora(ArrayList<Ladron> unosLadrones) {
		this.ladrones = unosLadrones;
		this.caracteristicas = new ArrayList<CaracteristicaLadron>();
		this.observadores = new ArrayList<Observador>();
		this.sospechosos = new ArrayList<Ladron>();
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
		for (CaracteristicaLadron c : this.caracteristicas) {
			if (caracteristica.equals(c)) {
				return;
			}
		}
		caracteristicas.add(caracteristica);
		this.actualizarObservadores();
	}

	public ArrayList<Ladron> buscarSospechosos() {
		this.sospechosos = new ArrayList<Ladron>();

		for (Ladron unLadron : this.ladrones) {
			boolean cumple = true;
			for (CaracteristicaLadron unaCaracterisica : this.caracteristicas) {
				if (!unLadron.tieneLaCaracteristica(unaCaracterisica)) {
					cumple = false;
					break;
				}
			}
			if (cumple) {
				this.cargarSospechoso(unLadron);
			}
		}
		this.actualizarObservadores();
		return this.sospechosos;
	}

	private void cargarSospechoso(Ladron unLadron) {
		for (Ladron l : this.sospechosos) {
			if (l.equals(unLadron)) {
				return;
			}
		}
		this.sospechosos.add(unLadron);
	}

	public OrdenArresto emitirOrdenDeArresto(Ladron unLadron) {

		// ArrayList<Ladron> ladronesSospechosos = new ArrayList<>();
		// ladronesSospechosos = this.buscarSospechosos();

		for (Ladron sospechoso : this.sospechosos)
			if (sospechoso.equals(unLadron)) {
				OrdenDeArresto orden = new OrdenDeArresto(unLadron);
				return orden;
			}
		return null;
	}

	public ArrayList<String> getCaracteristicas() {
		ArrayList<String> caracteristicas = new ArrayList<>();

		for (CaracteristicaLadron c : this.caracteristicas) {
			caracteristicas.add(c.getPista().revelar());
		}
		return caracteristicas;
	}

	public ArrayList<String> getNombresSospechosos() {
		ArrayList<String> sospechosos = new ArrayList<>();

		for (Ladron l : this.sospechosos) {
			sospechosos.add(l.getNombre());
		}
		return sospechosos;
	}

	public void setObservador(Observador vista) {
		this.observadores.add(vista);
	}

	private void actualizarObservadores() {
		for (Observador o : this.observadores) {
			o.actualizar();
		}
	}

	public void borrarCaracteristica(CaracteristicaLadron caracteristicaLadron) {
		ArrayList<CaracteristicaLadron> coincidencias = new ArrayList<>();
		for (CaracteristicaLadron c : this.caracteristicas) {
			if (caracteristicaLadron.equals(c)) {
				coincidencias.add(c);
			}
		}
		this.caracteristicas.removeAll(coincidencias);
		this.actualizarObservadores();
	}

	public ArrayList<Ladron> getSospechosos() {
		return this.sospechosos;
	}
}
