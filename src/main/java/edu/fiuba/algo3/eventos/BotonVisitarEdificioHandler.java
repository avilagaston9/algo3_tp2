package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import clases.edificios.Edificio;
import clases.pistas.Pista;
import edu.fiuba.algo3.contenedores.ContenedorPistas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.LinkedList;

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
        LinkedList<Pista> pistas = this.algoThief.visitar(this.edificio);
        Stage stagePistas = new Stage(StageStyle.UNDECORATED);
        ContenedorPistas contenedorPistas = new ContenedorPistas(stagePistas, pistas);
        stagePistas.setScene(new Scene(contenedorPistas,640,480));
        stage.close();
        stagePistas.show();
        //this.stage.initModality(Modality.APPLICATION_MODAL);
    }
}
