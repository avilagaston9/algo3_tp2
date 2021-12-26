package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.contenedores.ContenedorComputadora;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileNotFoundException;

public class BotonBuscarEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene mostrarComputadora;

    public BotonBuscarEventHandler(Stage stage) throws FileNotFoundException {
        this.stage= new Stage(StageStyle.UNDECORATED);
        ContenedorComputadora contenedorComputadora= new ContenedorComputadora(stage);
        this.mostrarComputadora = new Scene(contenedorComputadora,640,480);
        this.stage.initModality(Modality.APPLICATION_MODAL);

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(mostrarComputadora);
        stage.setFullScreenExitHint("");
        stage.show();
    }
}
