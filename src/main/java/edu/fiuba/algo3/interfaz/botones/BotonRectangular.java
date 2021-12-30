package edu.fiuba.algo3.interfaz.botones;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class BotonRectangular extends Button {

    public BotonRectangular(String texto, Color colorTexto, Color colorFondo, int alto, int ancho) {
        super(texto);
        this.agregarFormato(colorTexto, colorFondo);

        this.setPrefSize(ancho, alto);
    }

    public BotonRectangular(ImageView img, Color colorFondo, int alto, int ancho) {
        this.setGraphic(img);
        img.setFitWidth(ancho);
        img.setFitHeight(alto);
        this.setContentDisplay(ContentDisplay.CENTER);
        this.agregarFormato(Color.BLACK, colorFondo);

        //this.setPrefSize(ancho, alto);
    }

    private void agregarFormato(Color colorTexto, Color colorFondo) {
        this.setBorder(new Border(
                new BorderStroke(
                        Color.TRANSPARENT,
                        BorderStrokeStyle.NONE,
                        new CornerRadii(3),
                        BorderWidths.EMPTY
                )
        ));
        this.setPadding(new Insets(5));
        this.setTextFill(colorTexto);
        this.setEffect(new DropShadow(3, Color.LIGHTGREY));
        this.setPrefHeight(50);

        this.setBackground(new Background(
                new BackgroundFill(
                        colorFondo,
                        new CornerRadii(3),
                        Insets.EMPTY
                )
        ));
    }
}
