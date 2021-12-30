package edu.fiuba.algo3.interfaz.contenedores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.modelo.ciudades.Ciudad;
import edu.fiuba.algo3.eventos.BotonBuscarEventHandler;
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

		Button buscarPista = this.setBotonPista(algoThief);
		Button botonBuscarSospechosos = this.setBotonBuscarSospechosos(stage, algoThief);
		Button botonViajar = this.setBotonViajar(ciudades, algoThief);

		TilePane botonera = new TilePane();
		botonera.getChildren().addAll(botonViajar, botonBuscarSospechosos, buscarPista);
		this.setLeft(botonera);
	}

	private Button setBotonViajar(ArrayList<Ciudad> ciudades, AlgoThief algoThief) {

		Collections.shuffle(ciudades);
		try{
			FileInputStream input = new FileInputStream(Resources.IconoViajarACiudadRuta());
			Image image = new Image(input);
			ImageView imageView = new ImageView(image);
			Button botonViajar = new Button("", imageView);
			botonViajar.setMaxSize(150, 150);
			BotonViajarEventHandler botonViajarHandler = new BotonViajarEventHandler(ciudades, algoThief);
			botonViajar.setOnAction(botonViajarHandler);
			return botonViajar;
		}catch (FileNotFoundException e){
			System.out.println("planeIcon.png no entontrado.");
		}return null;
	}

	private Button setBotonPista(AlgoThief algoThief) {
		try{
			FileInputStream inputPista = new FileInputStream(Resources.IconoVisitarEdificioRuta());
			Image imagePista = new Image(inputPista);
			ImageView imageViewPista = new ImageView(imagePista);
			Button buscarPista = new Button("", imageViewPista);
			buscarPista.setMaxSize(150, 150);
			BotonBuscarPistaEventHandler buscarPistaButtonHandler = new BotonBuscarPistaEventHandler(algoThief);
			buscarPista.setOnAction(buscarPistaButtonHandler);
			return buscarPista;
		}catch (FileNotFoundException e){
			System.out.println("clue.png no entontrado.");
		}return null;
	}

	private Button setBotonBuscarSospechosos(Stage stage, AlgoThief algoThief) {

		try{
			FileInputStream inputBuscar = new FileInputStream(Resources.IconoUsarComputadoraRuta());
			Image imageBuscar = new Image(inputBuscar);
			ImageView imageViewBuscar = new ImageView(imageBuscar);

			Button botonBuscarSospechosos = new Button("", imageViewBuscar);
			botonBuscarSospechosos.setMaxSize(150, 150);

			BotonBuscarEventHandler buscarButtonHandler = new BotonBuscarEventHandler(stage, algoThief);
			botonBuscarSospechosos.setOnAction(buscarButtonHandler);
			return botonBuscarSospechosos;
		}catch (FileNotFoundException e){
			System.out.println("unknown.png no entontrado.");
		}return null;
	}

	private void setMenu(Stage stage) {
		this.menuBar = new BarraDeMenu(stage);
		this.setTop(menuBar);
	}

}