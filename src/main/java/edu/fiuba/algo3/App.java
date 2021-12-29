package edu.fiuba.algo3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import clases.AlgoThief;
import clases.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoCiudadesJson;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoLadronesJson;
import clases.InteraccionConArchivos.LectorDeArchivos.LectorArchivoObjetosRobadosJson;
import clases.InteraccionConArchivos.LectorDeArchivos.ObtenerDatosFachada;
import clases.InteraccionConArchivos.LectorDeArchivosFachada;
import clases.ladron.Ladron;
import clases.ObjetoRobado.ObjetoRobado;
import edu.fiuba.algo3.vistas.VistaPrincipal;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	private ArrayList<Ciudad> ciudades;
	private ArrayList<Ladron> ladrones;
	private ArrayList<ObjetoRobado> objetosRobados;
	private ObtenerDatosFachada obtenedorDeDatos;

	@Override
	public void start(Stage stage) throws FileNotFoundException {

		AlgoThief algothief = this.crearModelo();
		VistaPrincipal vistaPrincipal = new VistaPrincipal(stage, algothief, this.ciudades, this.ladrones);
		vistaPrincipal.actualizar();
	}

	public static void main(String[] args) {
		launch();
	}



	private AlgoThief crearModelo() {

		this.obtenedorDeDatos = this.crearObtenedorDeDatos();
		return new AlgoThief(this.obtenedorDeDatos);
	}

	private ObtenerDatosFachada crearObtenedorDeDatos() {

		LectorArchivoCiudadesJson lectorJsonCiudades = new LectorArchivoCiudadesJson("//src//main//java//" +
				"clases//InteraccionConArchivos//LectorDeArchivos//ciudadesSinTerminar.json");

		LectorArchivoLadronesJson lectorJsonLadrones = new LectorArchivoLadronesJson("//src//main//java//" +
				"clases//InteraccionConArchivos//LectorDeArchivos//dossiers.json");

		LectorArchivoObjetosRobadosJson lectorJsonObjetosRobados = new LectorArchivoObjetosRobadosJson("" +
				"//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//tesoros.json");


		return new ObtenerDatosFachada(lectorJsonCiudades, lectorJsonLadrones, lectorJsonObjetosRobados);
	}


}