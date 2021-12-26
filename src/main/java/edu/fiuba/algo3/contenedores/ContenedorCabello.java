package edu.fiuba.algo3.contenedores;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorCabello extends VBox {

    public ContenedorCabello(Stage stage, Computadora computadora){

        Button castanio = new Button("Castaño");
        castanio.setMaxSize(200,50);
        Button rubio = new Button("Rubio");
        rubio.setMaxSize(200,50);
        Button Rojo = new Button("Rojo");
        Rojo.setMaxSize(200,50);
        Button Negro = new Button("Negro");

        CaracteristicaEventHandler castanioHandler = new CaracteristicaEventHandler("Su pelo es castaño",computadora,stage);
        CaracteristicaEventHandler rubioHandler = new CaracteristicaEventHandler("Su pelo es rubio", computadora, stage);
        CaracteristicaEventHandler rojoHandler = new CaracteristicaEventHandler("Su pelo es rojo", computadora, stage);
        CaracteristicaEventHandler negroHandler = new CaracteristicaEventHandler("Su pelo es negro", computadora, stage);

        castanio.setOnAction(castanioHandler);
        rubio.setOnAction(rubioHandler);
        Rojo.setOnAction(rojoHandler);
        Negro.setOnAction(negroHandler);

        this.getChildren().addAll(castanio,rubio,Rojo,Negro);

    }
}
