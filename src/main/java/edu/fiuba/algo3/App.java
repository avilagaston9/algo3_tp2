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

	@Override
	public void start(Stage stage) throws FileNotFoundException {

		//AlgoThief algothief = this.crearModelo();
		//VistaPrincipal vistaPrincipal = new VistaPrincipal(stage, algothief, this.ciudades, this.ladrones);
		VistaPrincipal vistaPrincipal = new VistaPrincipal(stage);

	}

	public static void main(String[] args) {
		launch();
	}



	private AlgoThief crearModelo() {

		LectorArchivoCiudadesJson lectorJsonCiudades = new LectorArchivoCiudadesJson("//src//main//java//" +
				"clases//InteraccionConArchivos//LectorDeArchivos//ciudadesSinTerminar.json");

		LectorArchivoLadronesJson lectorJsonLadrones = new LectorArchivoLadronesJson("//src//main//java//" +
				"clases//InteraccionConArchivos//LectorDeArchivos//dossiers.json");

		LectorArchivoObjetosRobadosJson lectorJsonObjetosRobados = new LectorArchivoObjetosRobadosJson("" +
				"//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//tesoros.json");


		ObtenerDatosFachada obtenedorDeDatos = new ObtenerDatosFachada(lectorJsonCiudades, lectorJsonLadrones, lectorJsonObjetosRobados);

		//...

		this.ciudades = obtenedorDeDatos.obtenerCiudades();
		this.ladrones = obtenedorDeDatos.obtenerLadrones();
		this.objetosRobados = obtenedorDeDatos.obtenerObjetosRobados();

		return new AlgoThief(this.ciudades, this.ladrones, this.objetosRobados, null);


		/*
		LectorDeArchivosFachada lectorDeArchivos = new LectorDeArchivosFachada();
		this.ciudades = lectorDeArchivos.obtenerCiudades(
				"//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//ciudadesSinTerminar.json");
		this.ladrones = lectorDeArchivos
				.obtenerLadrones("//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//dossiers.json");
		this.objetosRobados = lectorDeArchivos.obtenerObjetosRobados(
				"//src//main//java//clases//InteraccionConArchivos//LectorDeArchivos//tesoros.json");

		return new AlgoThief(this.ciudades, this.ladrones, this.objetosRobados, null);

		 */
	}


}