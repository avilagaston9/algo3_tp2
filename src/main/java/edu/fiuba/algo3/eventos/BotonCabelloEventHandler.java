package edu.fiuba.algo3.eventos;

import clases.Computadora;
import edu.fiuba.algo3.contenedores.ContenedorCabello;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonCabelloEventHandler  implements EventHandler<ActionEvent> {
    Stage stage;
    Scene muestraCabellos;

    public BotonCabelloEventHandler(Computadora computadora){
        this.stage = new Stage(StageStyle.UNDECORATED);
        ContenedorCabello contenedorCabello = new ContenedorCabello(stage,computadora);
        this.muestraCabellos = new Scene(contenedorCabello,200,200);
        this.stage.initModality(Modality.APPLICATION_MODAL);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage.show();
    }
}
