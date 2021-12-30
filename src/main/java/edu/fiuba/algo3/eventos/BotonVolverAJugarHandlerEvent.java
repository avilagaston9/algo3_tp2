package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.modelo.AlgoThief;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonVolverAJugarHandlerEvent implements EventHandler<ActionEvent> {
    private final AlgoThief algoThief;

    public BotonVolverAJugarHandlerEvent(AlgoThief algoThief) {

        this.algoThief = algoThief;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        this.algoThief.iniciarJuego();
    }
}
