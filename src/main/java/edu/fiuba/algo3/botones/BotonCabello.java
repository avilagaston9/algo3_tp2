package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonCabello extends MenuButton {

    public BotonCabello(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/man-hair.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        MenuItem castanio = new MenuItem("Castaño");
        MenuItem rubio = new MenuItem("Rubio");
        MenuItem Rojo = new MenuItem("Rojo");
        MenuItem Negro = new MenuItem("Negro");

        CaracteristicaEventHandler castanioHandler = new CaracteristicaEventHandler("Su pelo es castaño",computadora);
        CaracteristicaEventHandler rubioHandler = new CaracteristicaEventHandler("Su pelo es rubio", computadora);
        CaracteristicaEventHandler rojoHandler = new CaracteristicaEventHandler("Su pelo es rojo", computadora);
        CaracteristicaEventHandler negroHandler = new CaracteristicaEventHandler("Su pelo es negro", computadora);

        castanio.setOnAction(castanioHandler);
        rubio.setOnAction(rubioHandler);
        Rojo.setOnAction(rojoHandler);
        Negro.setOnAction(negroHandler);

        this.getItems().addAll(castanio,rubio,Rojo,Negro);
        this.setPrefWidth(200);
        this.setPrefHeight(200);
    }
}
