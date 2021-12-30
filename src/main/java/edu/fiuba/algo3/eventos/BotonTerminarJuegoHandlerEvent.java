package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonTerminarJuegoHandlerEvent implements EventHandler<ActionEvent> {

    private final AlgoThief algoThief;
    private final Stage stage;

    public BotonTerminarJuegoHandlerEvent(AlgoThief algoThief, Stage stage){

        this.algoThief = algoThief;
        this.stage = stage;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

        this.algoThief.registrarDatos();
        System.exit(0);
    }
}
