package edu.fiuba.algo3.interfaz.contenedores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import edu.fiuba.algo3.eventos.*;
import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.Computadora;
import edu.fiuba.algo3.interfaz.botones.*;
import edu.fiuba.algo3.interfaz.menues.BarraDeMenu;
import edu.fiuba.algo3.interfaz.vistas.VistaCaracteristicas;
import edu.fiuba.algo3.interfaz.vistas.VistaSospechosos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorComputadora extends BorderPane {
	BarraDeMenu menuBar;
	Computadora computadora;

	public ContenedorComputadora(Stage stage, AlgoThief algoThief)  {
		this.computadora = algoThief.getComputadora();
		this.setMenu(stage);
		this.setBotonera(algoThief, stage);
		this.setFondo();
		this.setVistaCaracteristicas(algoThief);
		this.setVistaSospechosos(algoThief);
	}

	private void setFondo() {

		Image imagen = new Image(Resources.FondoJuegoRuta());
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));
	}

	private void setVistaSospechosos(AlgoThief algoThief) {
		Label label = new Label();
		VistaSospechosos vista = new VistaSospechosos(algoThief, label);
		this.computadora.setObservador(vista);
		this.setRight(label);
	}

	private void setVistaCaracteristicas(AlgoThief algoThief) {
		Label label = new Label();
		VistaCaracteristicas vista = new VistaCaracteristicas(algoThief, label);
		this.computadora.setObservador(vista);
		this.setCenter(label);
	}

	private void setBotonera(AlgoThief algothief, Stage stage) {

		BotonIcono sexo = new BotonIcono(Resources.IconoCaracteristicaSexoRuta(), new BotonSexoEventHandler(algothief));
		BotonIcono hobby = new BotonIcono(Resources.IconoCaracteristicaHobbyRuta(), new BotonHobbyEventHandler(algothief));
		BotonIcono cabello = new BotonIcono(Resources.IconoCaracteristicaCabelloRuta(), new BotonCabelloEventHandler(algothief));
		BotonIcono senia = new BotonIcono(Resources.IconoCaracteristicaSeniaRuta(),new BotonSeniaEventHandler(algothief));
		BotonIcono vehiculo = new BotonIcono(Resources.IconoCaracteristicaVehiculoRuta(), new BotonVehiculoEventHandler(algothief));

		Button buscarSospechosos = new Button("Buscar sospechosos");
		BotonBuscarSospechososEventHandler buscarSospechososButtonHandler = new BotonBuscarSospechososEventHandler(
				algothief, stage);
		buscarSospechosos.setOnAction(buscarSospechososButtonHandler);

		BotonIcono emitirOrdenDeArresto = new BotonIcono(Resources.IconoGenerarOrdenDeArrestoRuta(), new BotonEmitirOrdenEventHandler(algothief));

		BotonIcono botonVolver = new BotonIcono(Resources.IconoVolver(), new BotonVolverEventHandler(stage));

		VBox contenedorVertical = new VBox(sexo, hobby, cabello, senia, vehiculo, buscarSospechosos, botonVolver,
				emitirOrdenDeArresto);
		contenedorVertical.setPrefSize(100, 40);
		contenedorVertical.setSpacing(10);
		contenedorVertical.setPadding(new Insets(15));

		this.setLeft(contenedorVertical);
	}

	private void setMenu(Stage stage) {
		this.menuBar = new BarraDeMenu(stage);
		this.setTop(menuBar);
	}
}
