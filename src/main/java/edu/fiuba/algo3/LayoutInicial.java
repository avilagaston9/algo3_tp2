package edu.fiuba.algo3;

import edu.fiuba.algo3.controladores.ControladorJugar;
import edu.fiuba.algo3.controladores.ControladorSalir;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LayoutInicial extends StackPane{

    private static final String RUTA_FONDO_INICIO = "file:src/imagenes/bienvenida.jpg";


    public LayoutInicial(Stage stage) {

        this.setBackground(this.crearFondo());

        VBox botonesIniciales = new VBox(50);
        botonesIniciales.setAlignment(Pos.CENTER);
        botonesIniciales.getChildren().add(this.crearBotonJugar(stage));
        botonesIniciales.getChildren().add(this.crearBotonSalir());

        this.getChildren().add(botonesIniciales);
    }

    private Button crearBotonSalir() {

        Button botonSalir = new Button();
        botonSalir.setText("Salir");
        botonSalir.setFont(new Font("Arial", 30));
        botonSalir.setOnAction(new ControladorSalir());
        return botonSalir;
    }

    private Button crearBotonJugar(Stage stage) {

        Button botonJugar = new Button();
        botonJugar.setText("Jugar");
        botonJugar.setFont(new Font("Arial Black", 30));
        botonJugar.setOnAction(new ControladorJugar(botonJugar, stage));
        return botonJugar;
    }


    private Background crearFondo () {

        BackgroundImage fondoImagen = new BackgroundImage(new Image(RUTA_FONDO_INICIO), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER , BackgroundSize.DEFAULT);
        Background fondo = new Background(fondoImagen);
        return fondo;
    }
}
