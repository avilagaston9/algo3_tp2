package edu.fiuba.algo3.interfaz.contenedores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.interfaz.botones.BotonCircular;
import edu.fiuba.algo3.interfaz.botones.BotonRectangular;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BotonEntrarEventHandler;
import edu.fiuba.algo3.eventos.OpcionSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ContenedorBienvenidos extends HBox {
	private final AlgoThief algoThief;
	Stage stage;

	public ContenedorBienvenidos(Stage stage, AlgoThief algoThief){
		super();

		this.stage = stage;
		this.algoThief = algoThief;
		this.setAlignment(Pos.CENTER);
		this.setSpacing(40);
		this.setPadding(new Insets(25));
		this.setAlignment(Pos.BOTTOM_CENTER);

		Scene escenaContenedorCargaDeNombre = this.setSceneContenedorCargaDeNombre();
		this.setImagenBienvenida();
		this.setBotonPlay(escenaContenedorCargaDeNombre);
		this.setBotonExit();
	}

	private Scene setSceneContenedorCargaDeNombre() {

		ContenedorCargaDeNombre contenedorCargaDeNombre = new ContenedorCargaDeNombre(this.stage, this.algoThief);
		return new Scene(contenedorCargaDeNombre,640, 480);
	}

	private void setImagenBienvenida() {

		Image imagen = new Image(Resources.FondoPrincipalRuta());
		BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(imagenDeFondo));
	}

	private void setBotonPlay(Scene escenaContenedorCargaDeNombre) {

		try{
			FileInputStream inputPlay = new FileInputStream(Resources.IconoJugarRuta());
			Image imagePlay = new Image(inputPlay);
			ImageView imageViewPlay = new ImageView(imagePlay);
			BotonCircular botonJugar = new BotonCircular(imageViewPlay, Color.FORESTGREEN, 60, 60);
			BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(this.stage, escenaContenedorCargaDeNombre);
			botonJugar.setOnAction(botonEntrarHandler);
			this.getChildren().add(botonJugar);
		}catch (FileNotFoundException e){System.out.println("No se encontro imagen play-button");}
	}

	private void setBotonExit(){

		try{
			FileInputStream inputExit = new FileInputStream(Resources.IconoSalirRuta());
			Image imageExit = new Image(inputExit);
			ImageView imageViewExit = new ImageView(imageExit);
			BotonCircular botonSalir = new BotonCircular(imageViewExit, Color.RED, 60, 60);
			OpcionSalirEventHandler botonSalirHandler = new OpcionSalirEventHandler();
			botonSalir.setOnAction(botonSalirHandler);
			this.getChildren().add(botonSalir);
		}catch (FileNotFoundException e){System.out.println("No se encontro imagen cancel");}
	}
}
