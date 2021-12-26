package edu.fiuba.algo3.eventos;

import clases.Computadora;
import edu.fiuba.algo3.contenedores.ContenedorVehiculos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonVehiculoEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene muestravehiculos;

    public BotonVehiculoEventHandler(Computadora computadora){
        this.stage = new Stage(StageStyle.UNDECORATED);
        ContenedorVehiculos contenedorVehiculos = new ContenedorVehiculos(computadora,stage);
        this.muestravehiculos = new Scene(contenedorVehiculos,200,200);
        this.stage.initModality(Modality.APPLICATION_MODAL);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage.setScene(muestravehiculos);
        this.stage.show();

    }
}
