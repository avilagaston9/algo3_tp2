package edu.fiuba.algo3.contenedores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import clases.AlgoThief;
import clases.ciudades.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivos.ObtenerDatosFachada;
import edu.fiuba.algo3.eventos.BotonBuscarEventHandler;
import edu.fiuba.algo3.eventos.BotonBuscarPistaEventHandler;
import edu.fiuba.algo3.eventos.BotonViajarEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import edu.fiuba.algo3.vistas.VistaCiudad;
import edu.fiuba.algo3.vistas.VistaOrdenArresto;
import edu.fiuba.algo3.vistas.VistaReloj;
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
        Image imagen = new Image("file:src/imagenes/textura.png");
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
		Label cuadro = new Label();
		cuadro.setFont(new Font("Verdana", 35));
		VistaCiudad vistaCiudad = new VistaCiudad(algoThief, cuadro);

		algoThief.setObservador(vistaCiudad);
		vistaCiudad.actualizar();
		this.setCenter(cuadro);
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

		try{
			FileInputStream input = new FileInputStream("src/imagenes/planeIcon.png");
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
			FileInputStream inputPista = new FileInputStream("src/imagenes/clue.png");
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
			FileInputStream inputBuscar = new FileInputStream("src/imagenes/unknown.png");
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
