package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.botones.*;
import edu.fiuba.algo3.menues.BarraDeMenu;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ContenedorEdificios extends BorderPane {
    private final AlgoThief algoThief;
    Stage stage;
    BarraDeMenu menuBar;

    public ContenedorEdificios(Stage stage, AlgoThief algoThief) throws FileNotFoundException {
        this.stage = stage;
        this.setMenu(stage);
        this.setBotonera(stage);
        this.algoThief = algoThief;
    }

    private void setBotonera(Stage stage) throws FileNotFoundException {

        BotonVisitarEdificio botonAeropuerto = new BotonVisitarEdificio(this.stage, this.algoThief, this.algoThief.getCiudadActual().getAeropuerto);

        BotonVisitarAeropuerto botonVisitarAeropuerto = new BotonVisitarAeropuerto(this.stage);
        BotonVisitarBiblioteca botonVisitarBiblioteca = new BotonVisitarBiblioteca(this.stage);
        BotonVisitarBanco botonVisitarBanco = new BotonVisitarBanco(this.stage);
        BotonVolver botonVolver = new BotonVolver(stage);
        FileInputStream input = new FileInputStream("src/imagenes/log-out.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        botonVolver.setGraphic(imageView);
        TilePane botonera = new TilePane(botonVisitarBanco,botonVisitarAeropuerto,botonVisitarBiblioteca,botonVolver);

        this.setBottom(botonera);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
