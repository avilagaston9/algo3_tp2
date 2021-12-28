package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.botones.BotonBorrarCaracteristicaCabello;
import edu.fiuba.algo3.botones.BotonBorrarCaracteristicaHobby;
import edu.fiuba.algo3.botones.BotonCerrar;
import edu.fiuba.algo3.botones.BotonVolver;
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
        BotonCerrar botonVolver = new BotonCerrar(stage,"Volver");
        BotonBorrarCaracteristicaCabello botonBorrar = new BotonBorrarCaracteristicaCabello(algoThief);

        CaracteristicaEventHandler castanioHandler = new CaracteristicaEventHandler("Castaño", algoThief,stage);
        CaracteristicaEventHandler rubioHandler = new CaracteristicaEventHandler("Rubio", algoThief, stage);
        CaracteristicaEventHandler rojoHandler = new CaracteristicaEventHandler("Rojizo", algoThief, stage);
        CaracteristicaEventHandler negroHandler = new CaracteristicaEventHandler("Morocho", algoThief, stage);

        castanio.setOnAction(castanioHandler);
        rubio.setOnAction(rubioHandler);
        Rojo.setOnAction(rojoHandler);
        Negro.setOnAction(negroHandler);

        this.getChildren().addAll(castanio,rubio,Rojo,Negro,botonVolver,botonBorrar);

    }
}
