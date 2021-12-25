package clases;

import java.util.ArrayList;

import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoComun;
import clases.valorObjetoRobado.ObjetoMuyValioso;
import clases.valorObjetoRobado.ObjetoValioso;

public class RutaDeEscape {

    private int largoRutaObjetoComun = 4;
	private int largoRutaObjetoValioso = 5;
	private int largoRutaObjetoMuyValioso = 7;

	private ArrayList<Ciudad> ciudades;

	public RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoComun objeto) {

		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoComun));
	}

	public RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoValioso objeto) {

		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoValioso));
	}

	public RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoMuyValioso objeto) {

		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoMuyValioso));
	}

	public void asignarCiudad(Ladron ladron) {
		ladron.setCiudad(this.ciudades.get(-1));
	}

	public void asignarCiudad(Policia policia) {
		policia.setCiudad(this.ciudades.get(-1));
	}

	public ArrayList<Ciudad> getRuta() {
		return this.ciudades;
	}
}
