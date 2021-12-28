package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.botones.BotonCerrar;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorSinOrdenDeArresto extends VBox {
    public ContenedorSinOrdenDeArresto(AlgoThief algothief, Stage stage) {

        Label texto = new Label(("¡Game Over!\n" + algothief.getNombrePolicia() + ", te haz cruzado con " +
                algothief.getNombreLadron() + "sin orden de arresto y se ha escapado."));
        BotonCerrar botonCerrar = new BotonCerrar(stage, "Salir");

        this.getChildren().addAll(texto, botonCerrar);

    }
}
