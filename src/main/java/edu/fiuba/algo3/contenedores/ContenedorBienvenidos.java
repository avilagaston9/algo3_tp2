package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonEntrarEventHandler;
import edu.fiuba.algo3.eventos.OpcionSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ContenedorBienvenidos extends VBox {
    Stage stage;

    public ContenedorBienvenidos(Stage stage, Scene proximaEscena, AlgoThief algothief) throws FileNotFoundException {
        super();

        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(25));
        this.setAlignment(Pos.CENTER);
        Image imagen = new Image("file:src/imagenes/bienvenida.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));

        FileInputStream inputPlay = new FileInputStream("src/imagenes/play-button.png");
        Image imagePlay = new Image(inputPlay);
        ImageView imageViewPlay = new ImageView(imagePlay);
        Button botonJugar = new Button("",imageViewPlay);
        FileInputStream inputExit = new FileInputStream("src/imagenes/cancel.png");
        Image imageExit = new Image(inputExit);
        ImageView imageViewExit = new ImageView(imageExit);
        Button botonSalir = new Button("",imageViewExit);


        BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(stage, proximaEscena,algothief);
        botonJugar.setOnAction(botonEntrarHandler);
        OpcionSalirEventHandler botonSalirHandler = new OpcionSalirEventHandler();
        botonSalir.setOnAction(botonSalirHandler);

        this.getChildren().addAll( botonJugar, botonSalir);
    }
}
