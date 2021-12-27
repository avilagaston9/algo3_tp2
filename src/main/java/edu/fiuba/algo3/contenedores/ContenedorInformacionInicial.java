package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonEntendidoEventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorInformacionInicial extends VBox {

    public ContenedorInformacionInicial(Stage stage, AlgoThief algoThief, Scene proximaEscena) {
        Label informacion = new Label("Aca iria la informacion");

        Button botonEntendido = new Button("Entendido");

        BotonEntendidoEventHandler botonEntendidoHandler = new BotonEntendidoEventHandler(stage,algoThief,proximaEscena);
        botonEntendido.setOnAction(botonEntendidoHandler);

        this.getChildren().addAll(botonEntendido,informacion);

    }
}
