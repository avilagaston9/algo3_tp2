package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import edu.fiuba.algo3.contenedores.ContenedorLadrones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonEmitirOrdenEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene muestraLadrones;

    public BotonEmitirOrdenEventHandler(AlgoThief algoThief){
        this.stage = new Stage(StageStyle.UNDECORATED);
        ContenedorLadrones contenedorLadrones = new ContenedorLadrones(this.stage,algoThief);
        this.muestraLadrones = new Scene(contenedorLadrones,640,480);
        this.stage.initModality(Modality.APPLICATION_MODAL);

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage.setScene(this.muestraLadrones);
        this.stage.show();
    }
}
