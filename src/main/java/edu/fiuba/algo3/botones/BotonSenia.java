package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.contenedores.BotonSeniaEventHandler;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonSenia extends Button {

    public BotonSenia(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/diamond.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonSeniaEventHandler botonSeniaHandler = new BotonSeniaEventHandler(computadora);
        this.setOnAction(botonSeniaHandler);
        this.setMaxSize(200,200);





    }
}
