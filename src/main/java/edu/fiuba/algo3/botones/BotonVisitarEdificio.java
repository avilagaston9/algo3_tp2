package edu.fiuba.algo3.botones;

import clases.AlgoThief;
import clases.edificios.Edificio;
import edu.fiuba.algo3.eventos.BotonVisitarEdificioHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVisitarEdificio extends Button {

    public BotonVisitarEdificio(Stage stage, AlgoThief algoThief, Edificio edificio) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/airport.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonVisitarEdificioHandler botonVisitarEdificioHandler = new BotonVisitarEdificioHandler(stage, algoThief, edificio);
        this.setOnAction(botonVisitarEdificioHandler);
    }
}
