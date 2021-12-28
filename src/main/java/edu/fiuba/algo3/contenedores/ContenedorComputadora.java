package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import clases.Computadora;
import edu.fiuba.algo3.botones.*;
import edu.fiuba.algo3.botones.BotonSenia;
import edu.fiuba.algo3.eventos.BotonBuscarSospechososEventHandler;
import edu.fiuba.algo3.eventos.BotonEmitirOrdenEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import edu.fiuba.algo3.vistas.VistaCaracteristicas;
import edu.fiuba.algo3.vistas.VistaSospechosos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        this.computadora = algoThief.getComputadora();
        this.setMenu(stage);
        this.setBotonera(algoThief,stage);
//        FileInputStream input = new FileInputStream("src/imagenes/compuCargaDatos.png");
//        Image image = new Image(input,800,1000,true,true);
//        ImageView imageView = new ImageView(image);
//        this.setRight(imageView);
        this.setVistaCaracteristicas(algoThief);
        this.setVistaSospechosos(algoThief);
    }

    private void setVistaSospechosos(AlgoThief algoThief) {
        Label label = new Label();
        VistaSospechosos vista = new VistaSospechosos(algoThief, label);
        this.computadora.setObservador(vista);
        this.setRight(label);
    }

    private void setVistaCaracteristicas(AlgoThief algoThief) {
        Label label = new Label();
        VistaCaracteristicas vista = new VistaCaracteristicas(algoThief, label);
        this.computadora.setObservador(vista);
        this.setCenter(label);
    }

    private void setBotonera(AlgoThief algothief, Stage stage) throws FileNotFoundException {
        BotonSexo sexo= new BotonSexo(algothief);
        BotonHobby hobby = new BotonHobby(algothief);
        BotonCabello cabello = new BotonCabello(algothief);
        BotonSenia senia = new BotonSenia(algothief);
        BotonVehiculo vehiculo = new BotonVehiculo(algothief);

        Button buscarSospechosos = new Button("Buscar sospechosos");
        BotonBuscarSospechososEventHandler buscarSospechososButtonHandler = new BotonBuscarSospechososEventHandler(algothief,stage);
        buscarSospechosos.setOnAction(buscarSospechososButtonHandler);

        Button emitirOrdenDeArresto = new Button("Emitir Orden De Arresto");
        FileInputStream inputArresto = new FileInputStream("src/imagenes/orden-de-arresto.png");
        Image imageArresto = new Image(inputArresto);
        ImageView imageViewArresto = new ImageView(imageArresto);
        emitirOrdenDeArresto.setGraphic(imageViewArresto);
        BotonEmitirOrdenEventHandler botonEmitirOrdenHandler = new BotonEmitirOrdenEventHandler(algothief);
        emitirOrdenDeArresto.setOnAction(botonEmitirOrdenHandler);


        BotonVolver botonVolver = new BotonVolver(stage);
        FileInputStream input = new FileInputStream("src/imagenes/log-out.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        botonVolver.setGraphic(imageView);

        VBox contenedorVertical = new VBox(sexo,hobby,cabello,senia,vehiculo,buscarSospechosos,botonVolver,emitirOrdenDeArresto);
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
