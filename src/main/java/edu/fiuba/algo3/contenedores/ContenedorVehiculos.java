package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import clases.Computadora;
import edu.fiuba.algo3.botones.BotonBorrarCaracteristicaCabello;
import edu.fiuba.algo3.botones.BotonBorrarCaracteristicaVehiculo;
import edu.fiuba.algo3.botones.BotonCerrar;
import edu.fiuba.algo3.botones.BotonVolver;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorVehiculos extends VBox {

    public ContenedorVehiculos(AlgoThief algoThief , Stage stage){
        Button descapotable = new Button("Descapotable");
        descapotable.setMaxSize(200,50);
        Button limusina = new Button("Limusina");
        limusina.setMaxSize(200,50);
        Button deportivo = new Button("Deportivo");
        deportivo.setMaxSize(200,50);
        Button moto = new Button("Moto");
        moto.setMaxSize(200,50);
        BotonCerrar botonVolver = new BotonCerrar(stage,"Volver");
        BotonBorrarCaracteristicaVehiculo botonBorrar = new BotonBorrarCaracteristicaVehiculo(algoThief);


        CaracteristicaEventHandler descapotableHandler = new CaracteristicaEventHandler("Descapotable", algoThief, stage);
        CaracteristicaEventHandler limusinaHandler = new CaracteristicaEventHandler("Limusina", algoThief, stage);
        CaracteristicaEventHandler deportivoHandler = new CaracteristicaEventHandler("Deportivo", algoThief, stage);
        CaracteristicaEventHandler motoHandler = new CaracteristicaEventHandler("Moto", algoThief, stage);

        descapotable.setOnAction(descapotableHandler);
        limusina.setOnAction(limusinaHandler);
        deportivo.setOnAction(deportivoHandler);
        moto.setOnAction(motoHandler);

        this.getChildren().addAll(deportivo,descapotable,limusina,moto,botonVolver,botonBorrar);
    }
}
