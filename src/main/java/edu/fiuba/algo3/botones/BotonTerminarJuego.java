package edu.fiuba.algo3.botones;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonTerminarJuegoHandlerEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonTerminarJuego extends Button {
    public BotonTerminarJuego(AlgoThief algothief, Stage stage) {

        this.setText("Salir");
        this.setOnAction(new BotonTerminarJuegoHandlerEvent(algothief, stage));
    }
}
