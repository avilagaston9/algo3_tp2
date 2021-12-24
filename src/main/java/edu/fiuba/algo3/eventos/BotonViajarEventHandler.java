package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.contenedores.ContenedorCiudades;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class BotonViajarEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene mostrarCiudades;



    public BotonViajarEventHandler(Stage stage) {
        this.stage = stage;
        ContenedorCiudades contenedorCiudades= new ContenedorCiudades(stage);
        this.mostrarCiudades= new Scene(contenedorCiudades,240,240);
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(mostrarCiudades);
        stage.setFullScreenExitHint("");
        stage.show();





    }
}
