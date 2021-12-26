package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVehiculo extends MenuButton {

    public BotonVehiculo(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/searching.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        MenuItem descapotable = new MenuItem("Descapotable");
        MenuItem limusina = new MenuItem("Limusina");
        MenuItem deportivo = new MenuItem("Deportivo");
        MenuItem moto = new MenuItem("Moto");

        CaracteristicaEventHandler descapotableHandler = new CaracteristicaEventHandler("manejaba un descapotable", computadora);
        CaracteristicaEventHandler limusinaHandler = new CaracteristicaEventHandler("manejaba una limusina", computadora);
        CaracteristicaEventHandler deportivoHandler = new CaracteristicaEventHandler("manejaba una limusina", computadora);
        CaracteristicaEventHandler motoHandler = new CaracteristicaEventHandler("manejaba una moto", computadora);

        descapotable.setOnAction(deportivoHandler);
        limusina.setOnAction(limusinaHandler);
        deportivo.setOnAction(deportivoHandler);
        moto.setOnAction(motoHandler);

        this.getItems().addAll(descapotable,limusina,deportivo,moto);

    }
}
