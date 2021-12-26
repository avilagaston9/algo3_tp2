package edu.fiuba.algo3.eventos;

import clases.Computadora;
import clases.caracteristicasLadron.CaracteristicaLadron;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class CaracteristicaEventHandler implements EventHandler<ActionEvent> {
    Stage stage ;
    CaracteristicaLadron caracteristica;
    Computadora computadora;

    public CaracteristicaEventHandler(String Caracteristica, Computadora computadora, Stage stage){
        this.stage = stage;
        this.caracteristica = new CaracteristicaLadron(Caracteristica);
        this.computadora = computadora;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        //this.computadora.cargarCaracteristica(this.caracteristica);
        stage.close();

    }
}
