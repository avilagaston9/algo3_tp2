package edu.fiuba.algo3.contenedores;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorVehiculos extends VBox {

    public ContenedorVehiculos(Computadora computadora , Stage stage){
        Button descapotable = new Button("Descapotable");
        descapotable.setMaxSize(200,50);
        Button limusina = new Button("Limusina");
        limusina.setMaxSize(200,50);
        Button deportivo = new Button("Deportivo");
        deportivo.setMaxSize(200,50);
        Button moto = new Button("Moto");
        moto.setMaxSize(200,50);

        CaracteristicaEventHandler descapotableHandler = new CaracteristicaEventHandler("manejaba un descapotable", computadora, stage);
        CaracteristicaEventHandler limusinaHandler = new CaracteristicaEventHandler("manejaba una limusina", computadora, stage);
        CaracteristicaEventHandler deportivoHandler = new CaracteristicaEventHandler("manejaba una limusina", computadora, stage);
        CaracteristicaEventHandler motoHandler = new CaracteristicaEventHandler("manejaba una moto", computadora, stage);

        descapotable.setOnAction(deportivoHandler);
        limusina.setOnAction(limusinaHandler);
        deportivo.setOnAction(deportivoHandler);
        moto.setOnAction(motoHandler);

        this.getChildren().addAll(deportivo,descapotable,limusina,moto);
    }
}
