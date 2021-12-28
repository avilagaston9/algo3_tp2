package edu.fiuba.algo3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import clases.AlgoThief;
import clases.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivosFachada;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoRobado;
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

	@Override
	public void start(Stage stage) throws FileNotFoundException {

		AlgoThief algothief = this.crearModelo();

		VistaPrincipal vistaPrincipal = new VistaPrincipal(stage, algothief, this.ciudades, this.ladrones);
	}

	public static void main(String[] args) {
		launch();
	}

	private AlgoThief crearModelo() {

		LectorDeArchivosFachada lectorDeArchivos = new LectorDeArchivosFachada();
		this.ciudades = lectorDeArchivos.obtenerCiudades(
				"//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//ciudadesSinTerminar.json");
		this.ladrones = lectorDeArchivos
				.obtenerLadrones("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//dossiers.json");
		this.objetosRobados = lectorDeArchivos.obtenerObjetosRobados(
				"//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//tesoros.json");

		return new AlgoThief(this.ciudades, this.ladrones, this.objetosRobados);
	}
}