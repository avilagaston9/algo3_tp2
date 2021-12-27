package edu.fiuba.algo3.eventos;

import clases.AlgoThief;
import edu.fiuba.algo3.contenedores.ContenedorInformacionInicial;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class BotonOkEventHandler implements EventHandler<ActionEvent> {
    TextField slot;
    Stage stage;
    Scene escenaActual;

    public BotonOkEventHandler(AlgoThief algoThief, Scene proximaEscena, TextField slotParaIngresarNombre, Stage stage) {
        this.slot = slotParaIngresarNombre;
        ContenedorInformacionInicial contenedorInfomacionInicial = new ContenedorInformacionInicial(stage,algoThief,proximaEscena);
        this.escenaActual = new Scene(contenedorInfomacionInicial,200,200);
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (this.slot.getText().trim().equals("")) {
            this.slot.requestFocus();
        }
        else {
            stage.setScene(escenaActual);
            stage.show();
        }
    }
}
