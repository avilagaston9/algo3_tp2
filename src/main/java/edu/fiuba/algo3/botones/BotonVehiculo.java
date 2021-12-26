package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.BotonVehiculoEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVehiculo extends Button {

    public BotonVehiculo(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/searching.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonVehiculoEventHandler botonVehiculoHandler = new BotonVehiculoEventHandler(computadora);
        this.setOnAction(botonVehiculoHandler);
        this.setMaxSize(200,200);


    }
}
