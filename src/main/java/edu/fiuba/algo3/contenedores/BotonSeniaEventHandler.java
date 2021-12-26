package edu.fiuba.algo3.contenedores;

import clases.Computadora;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonSeniaEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene muestraSenia;

    public BotonSeniaEventHandler(Computadora computadora){
        this.stage = new Stage(StageStyle.UNDECORATED);
        ContenedorSenia contenedorSenia = new ContenedorSenia(computadora,stage);
        this.muestraSenia = new Scene(contenedorSenia,200,200);
        this.stage.initModality(Modality.APPLICATION_MODAL);
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage.show();

    }
}
