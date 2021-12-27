package edu.fiuba.algo3.botones;

import edu.fiuba.algo3.eventos.BotonVolverEventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonVolver extends Button {

    public BotonVolver(Stage stage){
        this.setText("Volver");
        BotonVolverEventHandler botonVolverHandler = new BotonVolverEventHandler(stage);
        this.setOnAction(botonVolverHandler);

    }
}
