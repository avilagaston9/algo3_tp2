package edu.fiuba.algo3.contenedores;

import edu.fiuba.algo3.eventos.BotonBuscarEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import edu.fiuba.algo3.botones.BotonViajar;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
    BarraDeMenu menuBar;
    Canvas canvas;



    public ContenedorPrincipal(Stage stage) {
        this.setMenu(stage);
        this.setBotonera(stage);

    }

    private void setBotonera(Stage stage) {
        BotonViajar botonViajar= new BotonViajar();
        Button botonBuscarSospechosos= new Button("Buscar");
        BotonBuscarEventHandler buscarButtonHandler = new BotonBuscarEventHandler(stage);
        botonBuscarSospechosos.setOnAction(buscarButtonHandler);



        VBox contenedorVertical = new VBox(botonBuscarSospechosos,botonViajar);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }


}
