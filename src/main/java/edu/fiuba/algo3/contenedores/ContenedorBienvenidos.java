package edu.fiuba.algo3.contenedores;

import edu.fiuba.algo3.eventos.BotonEntrarEventHandler;
import edu.fiuba.algo3.eventos.OpcionSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorBienvenidos extends VBox {
    Stage stage;

    public ContenedorBienvenidos(Stage stage, Scene proximaEscena) {
        super();

        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(25));
        this.setAlignment(Pos.CENTER);
        Image imagen = new Image("file:src/imagenes/bienvenida.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));


        Button botonJugar = new Button();
        botonJugar.setText("Jugar");
        Button botonSalir = new Button();
        botonSalir.setText("Salir");


        BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(stage, proximaEscena);
        botonJugar.setOnAction(botonEntrarHandler);
        OpcionSalirEventHandler botonSalirHandler = new OpcionSalirEventHandler();
        botonSalir.setOnAction(botonSalirHandler);

        this.getChildren().addAll( botonJugar, botonSalir);
    }
}
