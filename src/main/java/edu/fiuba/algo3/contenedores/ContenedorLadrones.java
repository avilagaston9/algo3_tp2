package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import clases.ladron.Ladron;
import edu.fiuba.algo3.eventos.BotonLadronEventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ContenedorLadrones extends VBox {
    ArrayList<Ladron> listaSospechosos;

    public ContenedorLadrones(Stage stage, AlgoThief algoThief){
        super();
        Label label = new Label("ads");
        this.listaSospechosos = algoThief.getSospechosos();
        for(int i=0;i<listaSospechosos.size();i++){
            Button botonLadron = new Button(listaSospechosos.get(i).getNombre());
            BotonLadronEventHandler botonLadronHandler = new BotonLadronEventHandler(stage,algoThief,listaSospechosos.get(0));
            botonLadron.setOnAction(botonLadronHandler);
            this.getChildren().add(botonLadron);
        }
        this.getChildren().add(label);
    }
}
