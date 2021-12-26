package edu.fiuba.algo3.botones;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonHobby extends MenuButton {

    public BotonHobby(Computadora computadora) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/mental-health.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        MenuItem tenis = new MenuItem("Tenis");
        MenuItem musica = new MenuItem("Musica");
        MenuItem alpinismo = new MenuItem("Alpinismo");
        MenuItem paracaidismo = new MenuItem("Paracaidismo");
        MenuItem natacion = new MenuItem("Natacion");
        MenuItem croquet = new MenuItem("Croquet");

        CaracteristicaEventHandler tenisHandler = new CaracteristicaEventHandler("le gusta jugar al tenis", computadora);
        CaracteristicaEventHandler musicaHandler = new CaracteristicaEventHandler("le gusta escuchar musica", computadora);
        CaracteristicaEventHandler alpinismoHandler = new CaracteristicaEventHandler("le gusta escalar montañas", computadora);
        CaracteristicaEventHandler paracaidismoHandler = new CaracteristicaEventHandler("le gusta saltar en paracaidas", computadora);
        CaracteristicaEventHandler natacionHandler = new CaracteristicaEventHandler("le gusta nadar", computadora);
        CaracteristicaEventHandler croquetHandler = new CaracteristicaEventHandler("le gusta jugar al croquet", computadora);

        tenis.setOnAction(tenisHandler);
        musica.setOnAction(musicaHandler);
        alpinismo.setOnAction(alpinismoHandler);
        paracaidismo.setOnAction(paracaidismoHandler);
        natacion.setOnAction(natacionHandler);
        croquet.setOnAction(croquetHandler);

        this.getItems().addAll(tenis,musica,alpinismo,paracaidismo,natacion,croquet);

    }
}
