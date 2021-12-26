package edu.fiuba.algo3.botones;

import edu.fiuba.algo3.eventos.BotonViajarEventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonViajar extends Button {

    public BotonViajar() throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/planeIcon.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        this.setMaxSize(150,150);
        BotonViajarEventHandler botonViajarHandler = new BotonViajarEventHandler();
        this.setOnAction(botonViajarHandler);
    }
}
