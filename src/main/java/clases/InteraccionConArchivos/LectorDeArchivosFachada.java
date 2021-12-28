package clases.InteraccionConArchivos;

import java.util.ArrayList;

import clases.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudades;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoLadrones;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoObjetosRobados;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivos;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoRobado;

public class LectorDeArchivosFachada {

	private LectorArchivos lectorArchivoLadrones;
	private LectorArchivos lectorArchivoCiudades;
	private LectorArchivos lectorArchivoObjetosRobados;

	public LectorDeArchivosFachada() {

		this.lectorArchivoCiudades = new LectorArchivoCiudades();
		this.lectorArchivoLadrones = new LectorArchivoLadrones();
		this.lectorArchivoObjetosRobados = new LectorArchivoObjetosRobados();
	}

	public ArrayList<Ciudad> obtenerCiudades(String pathArchivoCiudades) {

		return (ArrayList<Ciudad>) this.lectorArchivoCiudades.leer(pathArchivoCiudades);
	}
	public ArrayList<Ladron> obtenerLadrones(String pathArchivoLadrones) {

		return (ArrayList<Ladron>) this.lectorArchivoLadrones.leer(pathArchivoLadrones);
	}
	public ArrayList<ObjetoRobado> obtenerObjetosRobados(String pathArchivoObjetosRobados) {

		return (ArrayList<ObjetoRobado>) this.lectorArchivoObjetosRobados.leer(pathArchivoObjetosRobados);
	}

}
