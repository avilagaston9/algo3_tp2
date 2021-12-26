package edu.fiuba.algo3.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonVisitarAeropuertoEventHandler implements EventHandler<ActionEvent> {
    Stage stage;

    public BotonVisitarAeropuertoEventHandler(Stage stage){
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.close();

    }
}
