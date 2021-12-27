package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonEntendidoEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    AlgoThief algoThief;
    Scene esceneActual;


    public BotonEntendidoEventHandler(Stage stage, AlgoThief algoThief, Scene proximaEscena) {
        this.stage = stage;
        this.algoThief = algoThief;
        this.esceneActual = proximaEscena;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(esceneActual);
        stage.show();

    }
}
