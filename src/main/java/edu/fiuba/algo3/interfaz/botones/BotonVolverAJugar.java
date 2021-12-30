package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.modelo.AlgoThief;
import edu.fiuba.algo3.eventos.BotonVolverAJugarHandlerEvent;
import javafx.scene.control.Button;

public class BotonVolverAJugar extends Button {

    public BotonVolverAJugar(AlgoThief algoThief) {

        this.setText("Volver a jugar");
        this.setOnAction(new BotonVolverAJugarHandlerEvent(algoThief));
    }
}
