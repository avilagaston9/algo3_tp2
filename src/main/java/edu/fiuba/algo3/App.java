package edu.fiuba.algo3;

import clases.AlgoThief;
import clases.InteraccionConArchivos.LectorDeArchivos.*;
import edu.fiuba.algo3.vistas.VistaPrincipal;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/**
 * JavaFX App
 */
public class App extends Application {

	private ObtenerDatosFachada obtenedorDeDatos;

	@Override
	public void start(Stage stage) throws FileNotFoundException {

		AlgoThief algothief = this.crearModelo();
		VistaPrincipal vistaPrincipal = new VistaPrincipal(stage, algothief, this.obtenedorDeDatos);
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

		LectorArchivoPoliciasJson lectorPolicias = new LectorArchivoPoliciasJson("//src//main//java//clases//" +
				"InteraccionConArchivos//LectorDeArchivos//policias.json");


		return new ObtenerDatosFachada(lectorJsonCiudades, lectorJsonLadrones, lectorJsonObjetosRobados, lectorPolicias);
	}
}