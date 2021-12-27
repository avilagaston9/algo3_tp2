package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import edu.fiuba.algo3.contenedores.ContenedorCargaDeNombre;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonEntrarEventHandler implements EventHandler<ActionEvent> {

    Stage stage;
    Scene proximaEscena;

    public BotonEntrarEventHandler(Stage stage, Scene proximaEscena, AlgoThief algothief) {
        this.stage = stage;
        ContenedorCargaDeNombre cargaDeNombre = new ContenedorCargaDeNombre(algothief,proximaEscena,stage);
        this.proximaEscena = new Scene(cargaDeNombre,640,480);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(proximaEscena);
        stage.setFullScreenExitHint("");
    }
}
