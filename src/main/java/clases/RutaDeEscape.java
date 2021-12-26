package clases;

import java.util.ArrayList;

import clases.edificios.Edificio;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoComun;
import clases.valorObjetoRobado.ObjetoMuyValioso;
import clases.valorObjetoRobado.ObjetoValioso;

public class RutaDeEscape {

	private ArrayList<Ciudad> ciudades;


	public RutaDeEscape(ArrayList<Ciudad> ciudades, String nombreCiudad, int largoRutaDeEscape) {

		this.ciudades = new ArrayList<Ciudad>(ciudades);
		Ciudad ciudad =  this.buscarCiudad(ciudades, nombreCiudad);
		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaDeEscape-1));
		this.ciudades.add(0, ciudad);

		for (int i = 0; i < this.ciudades.size() - 1; i++){
			Ciudad ciudadActual = this.ciudades.get(i);
			ciudadActual.setPistas(this.ciudades.get(i+1));

		}
	}

	private Ciudad buscarCiudad(ArrayList<Ciudad> ciudades, String nombreCiudad){

		Ciudad ciudad = null;

		for (Ciudad c : ciudades){
			if (c.esIgualA(nombreCiudad)){
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


}
