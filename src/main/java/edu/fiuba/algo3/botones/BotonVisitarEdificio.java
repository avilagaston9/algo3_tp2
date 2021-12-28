package edu.fiuba.algo3.botones;

import edu.fiuba.algo3.eventos.visitarEdificiosHandlers.BotonVisitarEdificioHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVisitarEdificio extends Button {

    public BotonVisitarEdificio(BotonVisitarEdificioHandler handler, String imagen) throws FileNotFoundException {
        FileInputStream input = new FileInputStream(imagen);
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        this.setOnAction(handler);
    }
}
