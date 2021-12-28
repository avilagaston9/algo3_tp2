package edu.fiuba.algo3.contenedores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import clases.AlgoThief;
import edu.fiuba.algo3.botones.BotonCerrar;
import edu.fiuba.algo3.botones.BotonVisitarEdificio;
import edu.fiuba.algo3.eventos.visitarEdificiosHandlers.BotonVisitarAeropuertoEventHandler;
import edu.fiuba.algo3.eventos.visitarEdificiosHandlers.BotonVisitarBancoEventHandler;
import edu.fiuba.algo3.eventos.visitarEdificiosHandlers.BotonVisitarBibliotecaEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class ContenedorEdificios extends BorderPane {
	private final AlgoThief algoThief;
	Stage stage;
	BarraDeMenu menuBar;

	public ContenedorEdificios(Stage stage, AlgoThief algoThief) throws FileNotFoundException {

		this.algoThief = algoThief;
		this.stage = stage;
		this.setMenu(stage);
		this.setBotonera(stage);
	}

	private void setBotonera(Stage stage) throws FileNotFoundException {

		// creo boton visitar aeropuerto.
		BotonVisitarAeropuertoEventHandler AeropuertoEventHandler = new BotonVisitarAeropuertoEventHandler(this.stage,
				this.algoThief);
		BotonVisitarEdificio botonAeropuerto = new BotonVisitarEdificio(AeropuertoEventHandler,
				"src/imagenes/airport.png");
		// creo boton visitar biblioteca
		BotonVisitarBibliotecaEventHandler BibliotecaEventHandler = new BotonVisitarBibliotecaEventHandler(this.stage,
				this.algoThief);
		BotonVisitarEdificio botonBiblioteca = new BotonVisitarEdificio(BibliotecaEventHandler,
				"src/imagenes/library.png");
		// creo boton visitar banco
		BotonVisitarBancoEventHandler BancoEventHandler = new BotonVisitarBancoEventHandler(this.stage, this.algoThief);
		BotonVisitarEdificio botonBanco = new BotonVisitarEdificio(BancoEventHandler, "src/imagenes/bank.png");

		BotonCerrar botonVolver = new BotonCerrar(stage, "Volver");
		FileInputStream input = new FileInputStream("src/imagenes/log-out.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		botonVolver.setGraphic(imageView);
		TilePane botonera = new TilePane(botonBanco, botonAeropuerto, botonBiblioteca, botonVolver);

		this.setBottom(botonera);

	}

	private void setMenu(Stage stage) {
		this.menuBar = new BarraDeMenu(stage);
		this.setTop(menuBar);
	}
}
