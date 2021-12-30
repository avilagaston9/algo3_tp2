package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.vistas.VistaPrincipal;
import edu.fiuba.algo3.modelo.InteraccionConArchivos.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/**
 * JavaFX App
 */
public class App extends Application {

	private EscribirDatosFachada registradorDeDatos;

	@Override
	public void start(Stage stage) throws FileNotFoundException {

		AlgoThief algothief = this.crearModelo();
		VistaPrincipal vistaPrincipal = new VistaPrincipal(stage, algothief);
		vistaPrincipal.actualizar();
	}

	public static void main(String[] args) {
		launch();
	}

	private AlgoThief crearModelo() {

		ObtenerDatosFachada obtenedorDeDatos = this.crearObtenedorDeDatos();
		this.registradorDeDatos = this.crearRegistadorDeDatos();
		return new AlgoThief(obtenedorDeDatos, this.registradorDeDatos);
	}

	private EscribirDatosFachada crearRegistadorDeDatos(){

		EscritorArchivoPoliciasJson escritorPolicias = new EscritorArchivoPoliciasJson("//src//main//java//clases//" +
				"InteraccionConArchivos//LectorDeArchivos//policias.json");

		EscribirDatosFachada escribirDatosFachada = new EscribirDatosFachada(escritorPolicias);

		return escribirDatosFachada;
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