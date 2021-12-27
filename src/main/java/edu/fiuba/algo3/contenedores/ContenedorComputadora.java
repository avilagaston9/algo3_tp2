package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import clases.Computadora;
import edu.fiuba.algo3.botones.*;
import edu.fiuba.algo3.botones.BotonSenia;
import edu.fiuba.algo3.eventos.BotonBuscarSospechososEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ContenedorComputadora extends BorderPane {
    BarraDeMenu menuBar;
    Computadora computadora;

    public ContenedorComputadora(Stage stage, AlgoThief algoThief) throws FileNotFoundException {
        this.setMenu(stage);
        this.setBotonera(algoThief);
        FileInputStream input = new FileInputStream("src/imagenes/compuCargaDatos.png");
        Image image = new Image(input,800,1000,true,true);
        ImageView imageView = new ImageView(image);
        this.setRight(imageView);
    }

    private void setBotonera(AlgoThief algothief) throws FileNotFoundException {
        BotonSexo sexo= new BotonSexo(algothief);
        BotonHobby hobby = new BotonHobby(algothief);
        BotonCabello cabello = new BotonCabello(algothief);
        BotonSenia senia = new BotonSenia(algothief);
        BotonVehiculo vehiculo = new BotonVehiculo(algothief);

        Button buscarSospechosos = new Button("Buscar sospechosos");
        BotonBuscarSospechososEventHandler buscarSospechososButtonHandler = new BotonBuscarSospechososEventHandler(algothief);
        buscarSospechosos.setOnAction(buscarSospechososButtonHandler);


        VBox contenedorVertical = new VBox(sexo,hobby,cabello,senia,vehiculo,buscarSospechosos);
        contenedorVertical.setPrefSize(100,40);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);
    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }
}
