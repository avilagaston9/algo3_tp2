package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorCabello extends VBox {

    public ContenedorCabello(Stage stage, AlgoThief algoThief){

        Button castanio = new Button("Castaño");
        castanio.setMaxSize(200,50);
        Button rubio = new Button("Rubio");
        rubio.setMaxSize(200,50);
        Button Rojo = new Button("Rojo");
        Rojo.setMaxSize(200,50);
        Button Negro = new Button("Negro");

        CaracteristicaEventHandler castanioHandler = new CaracteristicaEventHandler("Su pelo es castaño", algoThief,stage);
        CaracteristicaEventHandler rubioHandler = new CaracteristicaEventHandler("Su pelo es rubio", algoThief, stage);
        CaracteristicaEventHandler rojoHandler = new CaracteristicaEventHandler("Su pelo es rojo", algoThief, stage);
        CaracteristicaEventHandler negroHandler = new CaracteristicaEventHandler("Su pelo es negro", algoThief, stage);

        castanio.setOnAction(castanioHandler);
        rubio.setOnAction(rubioHandler);
        Rojo.setOnAction(rojoHandler);
        Negro.setOnAction(negroHandler);

        this.getChildren().addAll(castanio,rubio,Rojo,Negro);

    }
}
