package edu.fiuba.algo3.botones;

import edu.fiuba.algo3.eventos.BotonVolverEventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonCerrar extends Button {

    public BotonCerrar(Stage stage, String textoCerrar){
        this.setText(textoCerrar);
        BotonVolverEventHandler botonVolverHandler = new BotonVolverEventHandler(stage);
        this.setOnAction(botonVolverHandler);
    }
}
