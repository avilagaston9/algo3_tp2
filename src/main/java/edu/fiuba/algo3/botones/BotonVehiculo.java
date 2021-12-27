package edu.fiuba.algo3.botones;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonVehiculoEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVehiculo extends Button {

    public BotonVehiculo(AlgoThief algoThief) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/searching.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonVehiculoEventHandler botonVehiculoHandler = new BotonVehiculoEventHandler(algoThief);
        this.setOnAction(botonVehiculoHandler);
        this.setMaxSize(200,200);


    }
}
