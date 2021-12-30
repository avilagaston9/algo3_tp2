package edu.fiuba.algo3.interfaz.botones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BotonHobbyEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonHobby extends Button {

	public BotonHobby(AlgoThief algoThief) throws FileNotFoundException {
		FileInputStream input = new FileInputStream(Resources.IconoCaracteristicaHobbyRuta());
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		this.setGraphic(imageView);
		BotonHobbyEventHandler botonHobbyHandler = new BotonHobbyEventHandler(algoThief);
		this.setOnAction(botonHobbyHandler);
		this.setMaxSize(200, 200);

	}
}