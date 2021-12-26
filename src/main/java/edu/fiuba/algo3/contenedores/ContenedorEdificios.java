package edu.fiuba.algo3.contenedores;

import edu.fiuba.algo3.botones.BotonVisitarAeropuerto;
import edu.fiuba.algo3.botones.BotonVisitarBanco;
import edu.fiuba.algo3.botones.BotonVisitarBiblioteca;
import edu.fiuba.algo3.menues.BarraDeMenu;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

public class ContenedorEdificios extends BorderPane {
    Stage stage;
    BarraDeMenu menuBar;

    public ContenedorEdificios(Stage stage) throws FileNotFoundException {
        this.stage = stage;
        this.setMenu(stage);
        this.setBotonera();
    }

    private void setBotonera() throws FileNotFoundException {
        BotonVisitarAeropuerto botonVisitarAeropuerto = new BotonVisitarAeropuerto(this.stage);
        BotonVisitarBiblioteca botonVisitarBiblioteca = new BotonVisitarBiblioteca(this.stage);
        BotonVisitarBanco botonVisitarBanco = new BotonVisitarBanco(this.stage);
        TilePane botonera = new TilePane(botonVisitarBanco,botonVisitarAeropuerto,botonVisitarBiblioteca);

        this.setBottom(botonera);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
