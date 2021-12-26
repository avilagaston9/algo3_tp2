package edu.fiuba.algo3.contenedores;

import clases.Computadora;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorSexo extends VBox {

    public ContenedorSexo(Computadora computadora , Stage stage){
        Button masculino = new Button("Masculino");
        masculino.setMaxSize(200,100);
        Button femenino = new Button("Femenino");
        femenino.setMaxSize(200,100);

        CaracteristicaEventHandler masculinoHandler = new CaracteristicaEventHandler("es hombre", computadora, stage);
        CaracteristicaEventHandler femeninoHandler =  new CaracteristicaEventHandler("es mujer", computadora, stage);

        masculino.setOnAction(masculinoHandler);
        femenino.setOnAction(femeninoHandler);

        this.getChildren().addAll(masculino,femenino);

    }
}
