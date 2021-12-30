package edu.fiuba.algo3.interfaz.contenedores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import edu.fiuba.algo3.eventos.BotonBuscarSospechososEventHandler;
import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.interfaz.botones.BotonIcono;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.eventos.BotonBuscarPistaEventHandler;
import edu.fiuba.algo3.eventos.BotonViajarEventHandler;
import edu.fiuba.algo3.interfaz.menues.BarraDeMenu;
import edu.fiuba.algo3.interfaz.vistas.VistaCiudad;
import edu.fiuba.algo3.interfaz.vistas.VistaOrdenArresto;
import edu.fiuba.algo3.interfaz.vistas.VistaReloj;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {

	BarraDeMenu menuBar;

	public ContenedorPrincipal(Stage stage, AlgoThief algothief){

		this.setMenu(stage);
		this.setBotonera(stage, algothief, algothief.getCiudades());
		this.setReloj(algothief);
		this.setVistaCiudad(algothief);
		this.setVistaOrdenDeArresto(algothief);
        Image imagen = new Image(Resources.FondoJuegoRuta());
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));
	}

	private void setReloj(AlgoThief algothief) {

		Label labelReloj = new Label();
		labelReloj.setFont(new Font("Verdana", 18));
		VistaReloj vistaReloj = new VistaReloj(algothief, labelReloj);
		algothief.setObservador(vistaReloj);
		vistaReloj.actualizar();
		this.setRight(labelReloj);
	}

	private void setVistaCiudad(AlgoThief algoThief) {
		Label nombreCiudad = new Label();
		VistaCiudad vistaCiudad = new VistaCiudad(algoThief, nombreCiudad);
		vistaCiudad.actualizar();
		this.setCenter(nombreCiudad);
		algoThief.setObservador(vistaCiudad);
	}

	private void setVistaOrdenDeArresto(AlgoThief algothief) {
		Label ordenDeArresto = new Label();
		VistaOrdenArresto vistaOrden = new VistaOrdenArresto(algothief, ordenDeArresto);
		algothief.setObservador(vistaOrden);
		vistaOrden.actualizar();
		this.setBottom(ordenDeArresto);
	}

	private void setBotonera(Stage stage, AlgoThief algoThief, ArrayList<Ciudad> ciudades) {

		Button buscarPista = this.setBotonVisitarEdificios(algoThief);
		Button botonUsarComputadora = this.setBotonUsarComputadora(stage, algoThief);
		Button botonViajar = this.setBotonViajar(ciudades, algoThief);

		TilePane botonera = new TilePane();
		botonera.setVgap(70);
		botonera.getChildren().addAll(botonViajar, botonUsarComputadora, buscarPista);
		this.setLeft(botonera);
	}

	private Button setBotonViajar(ArrayList<Ciudad> ciudades, AlgoThief algoThief) {

		Collections.shuffle(ciudades);
		String pathImagen = Resources.IconoViajarACiudadRuta();
		BotonViajarEventHandler handlerViajar = new BotonViajarEventHandler(ciudades, algoThief);
		return new BotonIcono(pathImagen, handlerViajar);
	}

	private Button setBotonVisitarEdificios(AlgoThief algoThief) {

		String pathImagen = Resources.IconoVisitarEdificioRuta();
		BotonBuscarPistaEventHandler handlerPista = new BotonBuscarPistaEventHandler(algoThief);
		return new BotonIcono(pathImagen, handlerPista);
	}

	private Button setBotonUsarComputadora(Stage stage, AlgoThief algoThief) {

		String pathImagen = Resources.IconoUsarComputadoraRuta();
		BotonBuscarSospechososEventHandler handlerSospechosos = new BotonBuscarSospechososEventHandler(algoThief, stage);
		return new BotonIcono(pathImagen, handlerSospechosos);
	}

	private void setMenu(Stage stage) {
		this.menuBar = new BarraDeMenu(stage);
		this.setTop(menuBar);
	}

}
