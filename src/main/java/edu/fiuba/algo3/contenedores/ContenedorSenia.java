package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.botones.BotonBorrarCaracteristicaHobby;
import edu.fiuba.algo3.botones.BotonBorrarCaracteristicaSenia;
import edu.fiuba.algo3.botones.BotonVolver;
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

        CaracteristicaEventHandler anilloHandler = new CaracteristicaEventHandler("Anillo", algoThief, stage);
        CaracteristicaEventHandler tatuajeHandler = new CaracteristicaEventHandler("Tatuaje", algoThief, stage);
        CaracteristicaEventHandler cicatrizHandler = new CaracteristicaEventHandler("Cicatriz", algoThief, stage);
        CaracteristicaEventHandler joyasHandler = new CaracteristicaEventHandler("Joyas", algoThief, stage);
        BotonVolver botonVolver = new BotonVolver(stage);
        BotonBorrarCaracteristicaSenia botonBorrar = new BotonBorrarCaracteristicaSenia(algoThief);

        anillo.setOnAction(anilloHandler);
        tatuaje.setOnAction(tatuajeHandler);
        cicatriz.setOnAction(cicatrizHandler);
        joyas.setOnAction(joyasHandler);

        this.getChildren().addAll(anillo,tatuaje,cicatriz,joyas,botonVolver,botonBorrar);

    }
}
