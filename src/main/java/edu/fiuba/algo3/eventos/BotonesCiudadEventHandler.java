package edu.fiuba.algo3.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonesCiudadEventHandler  implements EventHandler<ActionEvent> {
    Stage stage;

    public BotonesCiudadEventHandler(Stage stage){
        this.stage=stage;

    }




    @Override
    public void handle(ActionEvent actionEvent) {
        stage.close();

    }
}