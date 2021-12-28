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
    private final AlgoThief algoThief;
    Stage stage;
    Scene muestraLadrones;

    public BotonEmitirOrdenEventHandler(AlgoThief algoThief){
        this.stage = new Stage(StageStyle.UNDECORATED);
        this.algoThief = algoThief;
        this.stage.initModality(Modality.APPLICATION_MODAL);

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        ContenedorLadrones contenedorLadrones = new ContenedorLadrones(this.stage,this.algoThief);
        this.muestraLadrones = new Scene(contenedorLadrones,200,200);
        this.stage.setScene(this.muestraLadrones);
        this.stage.show();
    }
}
