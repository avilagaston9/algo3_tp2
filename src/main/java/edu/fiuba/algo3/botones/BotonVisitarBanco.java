package edu.fiuba.algo3.botones;

import edu.fiuba.algo3.eventos.BotonVisitarBancoEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVisitarBanco  extends Button {

    public BotonVisitarBanco(Stage stage) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/bank.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonVisitarBancoEventHandler botonVisitarbancoHandler = new BotonVisitarBancoEventHandler(stage);
        this.setOnAction(botonVisitarbancoHandler);
    }
}
