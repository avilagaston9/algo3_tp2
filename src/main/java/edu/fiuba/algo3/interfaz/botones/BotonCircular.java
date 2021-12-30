package edu.fiuba.algo3.interfaz.botones;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class BotonCircular extends Button {

    public BotonCircular(String texto, Color colorTexto, Color colorFondo, int alto, int ancho) {
        super(texto);
        this.agregarFormato(colorTexto, colorFondo);

        this.setPrefSize(ancho, alto);
    }

    public BotonCircular(ImageView img, Color colorFondo, int alto, int ancho) {
        //img.setPreserveRatio(true);
        img.setFitWidth(ancho);
        img.setFitHeight(alto);
        this.setGraphic(img);
        this.setContentDisplay(ContentDisplay.CENTER);
        this.agregarFormato(Color.BLACK, colorFondo);

        //this.setPrefSize(ancho, alto);
    }

    private void agregarFormato(Color colorTexto, Color colorFondo) {
        this.setBorder(new Border(
                new BorderStroke(
                        Color.BLACK,
                        BorderStrokeStyle.SOLID,
                        new CornerRadii(50, true),
                        BorderWidths.DEFAULT
                )
        ));
        this.setPadding(new Insets(5));
        this.setEffect(new DropShadow(5, Color.GREY));
        //this.setPrefHeight(50);
        //this.setPrefWidth(50);
        this.setTextFill(colorTexto);

        this.setBackground(new Background(
                new BackgroundFill(
                        colorFondo,
                        new CornerRadii(50, true),
                        Insets.EMPTY
                )
        ));
    }
}
