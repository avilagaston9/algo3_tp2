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

//	public RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoComun objeto) {
//
//		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoComun));
//	}
//
//	public RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoValioso objeto) {
//
//		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoValioso));
//	}
//
//	public RutaDeEscape(ArrayList<Ciudad> ciudades, ObjetoMuyValioso objeto) {
//
//		this.ciudades = new ArrayList<Ciudad>(ciudades.subList(0, largoRutaObjetoMuyValioso));
//	}
//
	public RutaDeEscape(ArrayList<Ciudad> ciudades, String nombreCiudad, int largoRutaDeEscape) {

		this.ciudades = new ArrayList<Ciudad>(ciudades);
		Ciudad ciudad =  this.buscarCiudad(ciudades, nombreCiudad);
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
