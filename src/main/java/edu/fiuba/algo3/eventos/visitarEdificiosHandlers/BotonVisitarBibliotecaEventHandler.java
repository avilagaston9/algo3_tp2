package edu.fiuba.algo3.eventos.visitarEdificiosHandlers;

import clases.AlgoThief;
import clases.pistas.Pista;
import javafx.stage.Stage;

import java.util.LinkedList;

public class BotonVisitarBibliotecaEventHandler  extends BotonVisitarEdificioHandler {


    public BotonVisitarBibliotecaEventHandler(Stage stage, AlgoThief algoThief) {
        super(stage, algoThief);
    }

    @Override
    public LinkedList<Pista> visitarJuego() {

        return this.algoThief.visitarBibliotecaActual();
    }
}
