package edu.fiuba.algo3.botones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonSeniaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonSenia extends Button {

	public BotonSenia(AlgoThief algoThief) throws FileNotFoundException {
		FileInputStream input = new FileInputStream("src/imagenes/diamond.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		this.setGraphic(imageView);
		BotonSeniaEventHandler botonSeniaHandler = new BotonSeniaEventHandler(algoThief);
		this.setOnAction(botonSeniaHandler);
		this.setMaxSize(200, 200);

	}
}
