package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonSenia extends MenuButton {

    public BotonSenia(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/diamond.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        MenuItem anillo = new MenuItem("Anillo");
        MenuItem tatuaje = new MenuItem("Tatuaje");
        MenuItem cicatriz = new MenuItem("Cicatriz");
        MenuItem joyas = new MenuItem("Joyas");

        CaracteristicaEventHandler anilloHandler = new CaracteristicaEventHandler("llevaba puesto un anillo", computadora);
        CaracteristicaEventHandler tatuajeHandler = new CaracteristicaEventHandler("tiene un tatuaje de un dragon", computadora);
        CaracteristicaEventHandler cicatrizHandler = new CaracteristicaEventHandler("tenia una cicatriz en la cara", computadora);
        CaracteristicaEventHandler joyasHandler = new CaracteristicaEventHandler("llevaba puesta joyas", computadora);

        anillo.setOnAction(anilloHandler);
        tatuaje.setOnAction(tatuajeHandler);
        cicatriz.setOnAction(cicatrizHandler);
        joyas.setOnAction(joyasHandler);


        this.getItems().addAll(anillo,tatuaje,cicatriz,joyas);
    }
}
