package edu.fiuba.algo3.eventos;

import edu.fiuba.algo3.botones.BotonVisitarBiblioteca;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonVisitarBibliotecaEventHandler  implements EventHandler<ActionEvent> {
    Stage stage;

    public BotonVisitarBibliotecaEventHandler(Stage stage){
        this.stage = stage;

    }
    @Override
    public void handle(ActionEvent actionEvent) {
        stage.close();
//TODO pasar todas estas a un solo EdificioEVentHandler
    }
}
