package edu.fiuba.algo3.eventos;

import clases.Computadora;
import edu.fiuba.algo3.botones.BotonHobby;
import edu.fiuba.algo3.contenedores.ContenedorHobby;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BotonHobbyEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene muestraHobbies;

    public BotonHobbyEventHandler(Computadora computadora){
        this.stage = new Stage(StageStyle.UNDECORATED);
        ContenedorHobby contenedorHobby = new ContenedorHobby(stage,computadora);
        this.muestraHobbies = new Scene(contenedorHobby,200,200);
        this.stage.initModality(Modality.APPLICATION_MODAL);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.stage.show();

    }
}
