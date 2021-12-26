package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonSexo extends MenuButton {

    public BotonSexo(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/sex.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        MenuItem masculino = new MenuItem("Masculino");
        MenuItem femenino  = new MenuItem("Femenino");

        CaracteristicaEventHandler masculinoHandler = new CaracteristicaEventHandler("es hombre", computadora);
        CaracteristicaEventHandler femeninoHandler =  new CaracteristicaEventHandler("es mujer", computadora);

        masculino.setOnAction(masculinoHandler);
        femenino.setOnAction(femeninoHandler);

        this.getItems().addAll(masculino, femenino);
    }
}
