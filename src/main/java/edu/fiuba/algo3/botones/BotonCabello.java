package edu.fiuba.algo3.botones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonCabelloEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonCabello extends Button {

	public BotonCabello(AlgoThief algoThief) throws FileNotFoundException {
		FileInputStream input = new FileInputStream("src/imagenes/man-hair.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		this.setGraphic(imageView);
		BotonCabelloEventHandler botonCabelloHandler = new BotonCabelloEventHandler(algoThief);
		this.setOnAction(botonCabelloHandler);
		this.setMaxSize(200, 200);
	}
}
