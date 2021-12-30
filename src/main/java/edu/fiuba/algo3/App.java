package edu.fiuba.algo3;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.vistas.VistaPrincipal;
import edu.fiuba.algo3.modelo.InteraccionConArchivos.*;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * JavaFX App
 */
public class App extends Application {

	@Override
	public void start(Stage stage) throws FileNotFoundException {
		stage.getIcons().add(new Image(new FileInputStream(Resources.IconoAppRuta())));
		AlgoThief algothief = this.crearModelo();
		VistaPrincipal vistaPrincipal = new VistaPrincipal(stage, algothief);
		vistaPrincipal.actualizar();
		algothief.setObservador(vistaPrincipal);
	}

	public static void main(String[] args) {
		launch();
	}

	private AlgoThief crearModelo() {

		ObtenerDatosFachada obtenedorDeDatos = this.crearObtenedorDeDatos();
		RegistrarDatosFachada registradorDeDatos = this.crearRegistadorDeDatos();
		return new AlgoThief(obtenedorDeDatos, registradorDeDatos);
	}

	private RegistrarDatosFachada crearRegistadorDeDatos(){

		EscritorArchivoPoliciasJson escritorPolicias = new EscritorArchivoPoliciasJson(Resources.ArchivoPoliciasRuta());

		RegistrarDatosFachada registrarDatosFachada = new RegistrarDatosFachada(escritorPolicias);

		return registrarDatosFachada;
	}

	private ObtenerDatosFachada crearObtenedorDeDatos() {

		LectorArchivoCiudadesJson lectorJsonCiudades = new LectorArchivoCiudadesJson(Resources.ArchivoCiudadesRuta());

		LectorArchivoLadronesJson lectorJsonLadrones = new LectorArchivoLadronesJson(Resources.ArchivoLadronesRuta());

		LectorArchivoObjetosRobadosJson lectorJsonObjetosRobados = new LectorArchivoObjetosRobadosJson("" + Resources.ArchivoTesorosRuta());

		LectorArchivoPoliciasJson lectorPolicias = new LectorArchivoPoliciasJson(Resources.ArchivoPoliciasRuta());


		return new ObtenerDatosFachada(lectorJsonCiudades, lectorJsonLadrones, lectorJsonObjetosRobados, lectorPolicias);
	}
}