package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import clases.Ciudad;
import edu.fiuba.algo3.contenedores.ContenedorCiudades;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class BotonViajarEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene muestraCiudades;

    public BotonViajarEventHandler(ArrayList<Ciudad> ciudades, AlgoThief algoThief){
        this.stage = new Stage(StageStyle.UNDECORATED);
        ContenedorCiudades contenedorCiudades = new ContenedorCiudades(stage,ciudades, algoThief);
        this.muestraCiudades = new Scene(contenedorCiudades,200,500);
        this.stage.initModality(Modality.APPLICATION_MODAL);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(muestraCiudades);
        stage.setFullScreenExitHint("");
        stage.show();

    }
}
