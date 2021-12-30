package edu.fiuba.algo3.interfaz.contenedores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import edu.fiuba.algo3.eventos.BotonVolverEventHandler;
import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.interfaz.botones.BotonIcono;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.interfaz.botones.BotonCerrar;
import edu.fiuba.algo3.eventos.visitarEdificiosHandlers.BotonVisitarAeropuertoEventHandler;
import edu.fiuba.algo3.eventos.visitarEdificiosHandlers.BotonVisitarBancoEventHandler;
import edu.fiuba.algo3.eventos.visitarEdificiosHandlers.BotonVisitarBibliotecaEventHandler;
import edu.fiuba.algo3.interfaz.menues.BarraDeMenu;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class ContenedorEdificios extends BorderPane {
	private final AlgoThief algoThief;
	Stage stage;
	BarraDeMenu menuBar;

	public ContenedorEdificios(Stage stage, AlgoThief algoThief) {

		this.algoThief = algoThief;
		this.stage = stage;
		this.setMenu(stage);
		this.setBotonera(stage);
		this.setPadding(new Insets(25));
	}

	private void setBotonera(Stage stage){

		// creo boton visitar aeropuerto.
		BotonVisitarAeropuertoEventHandler AeropuertoEventHandler = new BotonVisitarAeropuertoEventHandler(this.stage, this.algoThief);
		BotonIcono botonAeropuerto = new BotonIcono(Resources.IconoAeropuertoRuta(), AeropuertoEventHandler);
		// creo boton visitar biblioteca
		BotonVisitarBibliotecaEventHandler BibliotecaEventHandler = new BotonVisitarBibliotecaEventHandler(this.stage, this.algoThief);
		BotonIcono botonBiblioteca = new BotonIcono(Resources.IconoBibliotecaRuta(), BibliotecaEventHandler);
		// creo boton visitar banco
		BotonVisitarBancoEventHandler BancoEventHandler = new BotonVisitarBancoEventHandler(this.stage, this.algoThief);
		BotonIcono botonBanco = new BotonIcono(Resources.IconoBancoRuta(), BancoEventHandler);

		//creo icono volver
		BotonIcono botonVolver = new BotonIcono(Resources.IconoVolver(), new BotonVolverEventHandler(stage));

		TilePane botonera = new TilePane(botonBanco, botonAeropuerto, botonBiblioteca, botonVolver);
		botonera.setHgap(70);
		this.setBottom(botonera);
	}

	private void setMenu(Stage stage) {
		this.menuBar = new BarraDeMenu(stage);
		this.setTop(menuBar);
	}
}
