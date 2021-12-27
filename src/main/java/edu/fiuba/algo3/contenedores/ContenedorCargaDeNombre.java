package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.BotonAceptarNombreEventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorCargaDeNombre extends VBox {
    Scene proximaEscena;

   public  ContenedorCargaDeNombre(AlgoThief algothief, Scene proximaEscena, Stage stage){
       this.proximaEscena = proximaEscena;

       TextField slotParaIngresarNombre = new TextField();
       slotParaIngresarNombre.setPromptText("Ingrese su nombre");

       Button botonOk = new Button("Ok");

       BotonAceptarNombreEventHandler botonOkHandler = new BotonAceptarNombreEventHandler(algothief,proximaEscena,slotParaIngresarNombre,stage);
       botonOk.setOnAction(botonOkHandler);

       this.getChildren().addAll(botonOk,slotParaIngresarNombre);

    }

}
