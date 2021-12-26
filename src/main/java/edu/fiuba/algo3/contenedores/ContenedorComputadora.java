package edu.fiuba.algo3.contenedores;

import clases.Computadora;
import edu.fiuba.algo3.botones.*;
import edu.fiuba.algo3.botones.BotonSenia;
import edu.fiuba.algo3.eventos.BotonBuscarSospechososEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileNotFoundException;


public class ContenedorComputadora extends BorderPane {
    BarraDeMenu menuBar;
    Computadora computadora;

    public ContenedorComputadora(Stage stage) throws FileNotFoundException {
        this.setMenu(stage);
        this.setBotonera(computadora);
    }

    private void setBotonera(Computadora computadora) throws FileNotFoundException {
        BotonSexo sexo= new BotonSexo(computadora);
        BotonHobby hobby = new BotonHobby(computadora);
        BotonCabello cabello = new BotonCabello(computadora);
        BotonSenia senia = new BotonSenia(computadora);
        BotonVehiculo vehiculo = new BotonVehiculo(computadora);

        Button buscarSospechosos = new Button("Buscar sospechosos");
        BotonBuscarSospechososEventHandler buscarSospechososButtonHandler = new BotonBuscarSospechososEventHandler();
        buscarSospechosos.setOnAction(buscarSospechososButtonHandler);


        VBox contenedorVertical = new VBox(sexo,hobby,cabello,senia,vehiculo,buscarSospechosos);
        contenedorVertical.setPrefSize(100,40);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        contenedorVertical.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
;

        this.setLeft(contenedorVertical);
    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
