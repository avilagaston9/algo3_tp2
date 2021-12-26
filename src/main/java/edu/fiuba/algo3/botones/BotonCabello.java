package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.BotonCabelloEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonCabello extends Button {

    public BotonCabello(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/man-hair.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonCabelloEventHandler botonCabelloHandler = new BotonCabelloEventHandler(computadora);
        this.setOnAction(botonCabelloHandler);
        this.setMaxSize(200,200);
    }
}
