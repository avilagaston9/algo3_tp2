package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.BotonHobbyEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonHobby extends Button {

    public BotonHobby(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/mental-health.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonHobbyEventHandler botonHobbyHandler = new BotonHobbyEventHandler(computadora);
        this.setOnAction(botonHobbyHandler);
        this.setMaxSize(200,200);






    }
}
