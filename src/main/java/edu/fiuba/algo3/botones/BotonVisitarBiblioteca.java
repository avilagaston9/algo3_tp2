package edu.fiuba.algo3.botones;

import edu.fiuba.algo3.eventos.BotonVisitarBancoEventHandler;
import edu.fiuba.algo3.eventos.BotonVisitarBibliotecaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BotonVisitarBiblioteca  extends Button {


    public BotonVisitarBiblioteca(Stage stage) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("src/imagenes/library.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        this.setGraphic(imageView);
        BotonVisitarBibliotecaEventHandler botonVisitarBibliotecaHandler = new BotonVisitarBibliotecaEventHandler(stage);
        this.setOnAction(botonVisitarBibliotecaHandler);

    }
}
