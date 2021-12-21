package edu.fiuba.algo3;

import edu.fiuba.algo3.controladores.ControladorJugar;
import edu.fiuba.algo3.controladores.ControladorSalir;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class LayoutInicial extends StackPane{

    private static final String RUTA_FONDO_INICIO = "file:src/main/java/edu/fiuba/algo3/recursos/portada.jpg";

    public LayoutInicial() {

        this.setBackground(this.crearFondo());

        VBox botonesIniciales = new VBox(50);
        botonesIniciales.setAlignment(Pos.CENTER);
        botonesIniciales.getChildren().add(this.crearBotonJugar());
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

    private Button crearBotonJugar() {

        Button botonJugar = new Button();
        botonJugar.setText("Jugar");
        botonJugar.setFont(new Font("Arial Black", 30));
        botonJugar.setOnAction(new ControladorJugar(botonJugar));
        return botonJugar;
    }


    private Background crearFondo () {

        BackgroundImage fondoImagen = new BackgroundImage(new Image(RUTA_FONDO_INICIO), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        Background fondo = new Background(fondoImagen);
        return fondo;
    }
}
