package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import clases.Ciudad;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoRobado;
import edu.fiuba.algo3.eventos.BotonBuscarEventHandler;
import edu.fiuba.algo3.eventos.BotonBuscarPistaEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import edu.fiuba.algo3.botones.BotonViajar;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ContenedorPrincipal extends BorderPane {
    BarraDeMenu menuBar;
    Canvas canvas;



    public ContenedorPrincipal(Stage stage, AlgoThief algothief, ArrayList<Ciudad> ciudades, ArrayList<Ladron> ladrones) throws FileNotFoundException {
        this.setMenu(stage);
        this.setBotonera(stage);

    }

    private void setBotonera(Stage stage) throws FileNotFoundException {
        // Carga el icono del boton para buscar sospechosos
        FileInputStream inputBuscar = new FileInputStream("src/imagenes/unknown.png");
        Image imageBuscar = new Image(inputBuscar);
        ImageView imageViewBuscar = new ImageView(imageBuscar);
        // Carga el icono del boton para  buscar pistas en los edificios
        FileInputStream inputPista = new FileInputStream("src/imagenes/clue.png");
        Image imagePista = new Image(inputPista);
        ImageView imageViewPista = new ImageView(imagePista);


        BotonViajar botonViajar= new BotonViajar();

        Button botonBuscarSospechosos= new Button("",imageViewBuscar);
        botonBuscarSospechosos.setMaxSize(150,150);

        BotonBuscarEventHandler buscarButtonHandler = new BotonBuscarEventHandler(stage);
        botonBuscarSospechosos.setOnAction(buscarButtonHandler);

        Button buscarPista = new Button("",imageViewPista);
        buscarPista.setMaxSize(150,150);

        BotonBuscarPistaEventHandler buscarPistaButtonHandler = new BotonBuscarPistaEventHandler();
        buscarPista.setOnAction(buscarPistaButtonHandler);

        TilePane botonera = new TilePane();
        botonera.getChildren().addAll(botonViajar,botonBuscarSospechosos,buscarPista);
        this.setLeft(botonera);
    }

    private void setMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }


}
