package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.BotonSexoEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonSexo extends Button {

    public BotonSexo(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/sex.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonSexoEventHandler botonSexoHandler = new BotonSexoEventHandler(computadora);
        this.setOnAction(botonSexoHandler);
        this.setMaxSize(200,200);





    }
}
