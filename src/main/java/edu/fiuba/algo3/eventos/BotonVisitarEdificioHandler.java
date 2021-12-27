package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import clases.edificios.Edificio;
import clases.ladron.Ladron;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonVisitarEdificioHandler implements EventHandler<ActionEvent> {

    private final AlgoThief algoThief;
    private Edificio edificio;
    private Stage stage;

    public BotonVisitarEdificioHandler(Stage stage, AlgoThief algoThief, Edificio edificio) {

        this.edificio = edificio;
        this.algoThief = algoThief;
        this.stage = stage;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.algoThief.visitar(this.edificio);
        stage.close();
    }
}
