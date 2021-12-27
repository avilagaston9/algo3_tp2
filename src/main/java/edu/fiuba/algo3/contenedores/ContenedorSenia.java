package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorSenia extends VBox {


    public ContenedorSenia(AlgoThief algoThief, Stage stage){
        Button anillo = new Button("Anillo");
        anillo.setMaxSize(200,50);
        Button tatuaje = new Button("Tatuaje");
        tatuaje.setMaxSize(200,50);
        Button cicatriz = new Button("Cicatriz");
        cicatriz.setMaxSize(200,50);
        Button joyas = new Button("Joyas");
        joyas.setMaxSize(200,50);

        CaracteristicaEventHandler anilloHandler = new CaracteristicaEventHandler("llevaba puesto un anillo", algoThief, stage);
        CaracteristicaEventHandler tatuajeHandler = new CaracteristicaEventHandler("tiene un tatuaje de un dragon", algoThief, stage);
        CaracteristicaEventHandler cicatrizHandler = new CaracteristicaEventHandler("tenia una cicatriz en la cara", algoThief, stage);
        CaracteristicaEventHandler joyasHandler = new CaracteristicaEventHandler("llevaba puesta joyas", algoThief, stage);

        anillo.setOnAction(anilloHandler);
        tatuaje.setOnAction(tatuajeHandler);
        cicatriz.setOnAction(cicatrizHandler);
        joyas.setOnAction(joyasHandler);

        this.getChildren().addAll(anillo,tatuaje,cicatriz,joyas);

    }
}
