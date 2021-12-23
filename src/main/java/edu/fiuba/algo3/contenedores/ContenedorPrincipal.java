package edu.fiuba.algo3.contenedores;

import edu.fiuba.algo3.barraMenu.BarraDeMenu;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ContenedorPrincipal extends BorderPane {
    BarraDeMenu menuBar;

    public ContenedorPrincipal(Stage stage) {
        this.setMenu(stage);
    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
