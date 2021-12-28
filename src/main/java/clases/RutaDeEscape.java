package clases;

import java.util.ArrayList;
import java.util.List;

import clases.ladron.Ladron;

public class RutaDeEscape {

	private ArrayList<Ciudad> ciudades;

	public RutaDeEscape(List<Ciudad> ciudades, String nombreCiudad, int largoRutaDeEscape) {

		this.ciudades = new ArrayList<Ciudad>(ciudades);
		Ciudad ciudad = this.buscarCiudad(ciudades, nombreCiudad);
		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaDeEscape - 1));
		this.ciudades.add(0, ciudad);

		for (int i = 0; i < this.ciudades.size() - 1; i++) {
			Ciudad ciudadActual = this.ciudades.get(i);
			ciudadActual.setPistas(this.ciudades.get(i + 1));
		}
	}

	private Ciudad buscarCiudad(List<Ciudad> ciudades, String nombreCiudad) {

		Ciudad ciudad = null;

		for (Ciudad c : ciudades) {
			if (c.esIgualA(nombreCiudad)) {
				ciudad = c;
			}
		}
		ciudades.remove(ciudad);
		return ciudad;
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

	public boolean pertenece(Ciudad unaCiudad) {
		return (this.ciudades.contains(unaCiudad));
	}

}
