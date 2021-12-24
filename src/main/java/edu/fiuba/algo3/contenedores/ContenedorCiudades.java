package edu.fiuba.algo3.contenedores;

import edu.fiuba.algo3.eventos.BotonesCiudadEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ContenedorCiudades extends VBox {
    Stage stage;

    public ContenedorCiudades(Stage stage){
        super();
        List<String> nombresCiudadesAdyacentes= new ArrayList<>();
        nombresCiudadesAdyacentes.add("Bs.As");
        nombresCiudadesAdyacentes.add("Paris");
        nombresCiudadesAdyacentes.add("Londres");


        // botones que te permiten viajar a cada ciudad


        Button botonPrimerCiudad = new Button(nombresCiudadesAdyacentes.get(0));
        BotonesCiudadEventHandler botonCiudadesHandler = new BotonesCiudadEventHandler();
        botonPrimerCiudad.setOnAction(botonCiudadesHandler);

        Button botonSegundaCiudad = new Button(nombresCiudadesAdyacentes.get(1));
        botonSegundaCiudad.setOnAction(botonCiudadesHandler);

        Button botonTercerCiudad = new Button(nombresCiudadesAdyacentes.get(2));
        botonTercerCiudad.setOnAction(botonCiudadesHandler);

        this.getChildren().addAll( botonPrimerCiudad,botonSegundaCiudad,botonTercerCiudad);
    }
}
