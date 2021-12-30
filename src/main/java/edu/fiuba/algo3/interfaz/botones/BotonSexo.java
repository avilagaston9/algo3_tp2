package edu.fiuba.algo3.interfaz.botones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import edu.fiuba.algo3.interfaz.Resources;
import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BotonSexoEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonSexo extends Button {

	public BotonSexo(AlgoThief algoThief) throws FileNotFoundException {
		FileInputStream input = new FileInputStream(Resources.IconoCaracteristicaSexoRuta());
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		this.setGraphic(imageView);
		BotonSexoEventHandler botonSexoHandler = new BotonSexoEventHandler(algoThief);
		this.setOnAction(botonSexoHandler);
		this.setMaxSize(200, 200);

	}
}
