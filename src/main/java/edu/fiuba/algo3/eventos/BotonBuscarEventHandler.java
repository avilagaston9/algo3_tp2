package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.contenedores.ContenedorComputadora;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonBuscarEventHandler  implements EventHandler<ActionEvent> {
    Stage stage;
    Scene mostrarComputadora;

    public BotonBuscarEventHandler(Stage stage){
        this.stage= stage;
        ContenedorComputadora contenedorComputadora= new ContenedorComputadora(stage);
        this.mostrarComputadora = new Scene(contenedorComputadora,640,480);

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(mostrarComputadora);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.show();
    }
}
