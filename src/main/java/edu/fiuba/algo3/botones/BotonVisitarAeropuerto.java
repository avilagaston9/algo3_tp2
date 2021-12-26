package edu.fiuba.algo3.botones;

import edu.fiuba.algo3.eventos.BotonVisitarAeropuertoEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVisitarAeropuerto  extends Button {

    public BotonVisitarAeropuerto(Stage stage) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/airport.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonVisitarAeropuertoEventHandler botonVisitarAeropuertoHandler = new BotonVisitarAeropuertoEventHandler(stage);
        this.setOnAction(botonVisitarAeropuertoHandler);
    }
}
