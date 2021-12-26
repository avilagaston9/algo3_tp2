package edu.fiuba.algo3.eventos;

import clases.Computadora;
import edu.fiuba.algo3.contenedores.ContenedorSenia;
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
        this.stage.setScene(muestraSenia);
        this.stage.show();

    }
}
