package edu.fiuba.algo3.contenedores;

import edu.fiuba.algo3.botones.*;
import edu.fiuba.algo3.botones.BotonSenia;
import edu.fiuba.algo3.menues.BarraDeMenu;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorComputadora extends BorderPane {
    BarraDeMenu menuBar;
    Stage stage;

    public ContenedorComputadora(Stage stage){
        this.setMenu(stage);
        BotonSexo sexo= new BotonSexo();
        BotonHobby hobby = new BotonHobby();
        BotonCabello cabello = new BotonCabello();
        BotonSenia senia = new BotonSenia();
        BotonVehiculo vehiculo = new BotonVehiculo();


        VBox contenedorVertical = new VBox(sexo,hobby,cabello,senia,vehiculo);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);

    }
    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
