package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import clases.Ciudad;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoRobado;
import edu.fiuba.algo3.eventos.BotonBuscarEventHandler;
import edu.fiuba.algo3.eventos.BotonBuscarPistaEventHandler;
import edu.fiuba.algo3.menues.BarraDeMenu;
import edu.fiuba.algo3.botones.BotonViajar;
import edu.fiuba.algo3.vistas.VistaCiudad;
import edu.fiuba.algo3.vistas.VistaOrdenArresto;
import edu.fiuba.algo3.vistas.VistaReloj;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ContenedorPrincipal extends BorderPane {

    BarraDeMenu menuBar;


    public ContenedorPrincipal(Stage stage, AlgoThief algothief, ArrayList<Ciudad> ciudades, ArrayList<Ladron> ladrones) throws FileNotFoundException {
        this.setMenu(stage);
        this.setBotonera(stage,algothief,ciudades);
        this.setReloj(algothief);
        this.setVistaCiudad(algothief);
        this.setVistaOrdenDeArresto(algothief);
    }

    private void setReloj(AlgoThief algothief) {

        Label labelReloj = new Label();
        VistaReloj vistaReloj = new VistaReloj(algothief, labelReloj);
        algothief.setObservador(vistaReloj);
        vistaReloj.actualizar();
        this.setRight(labelReloj);
    }

    private void setVistaCiudad(AlgoThief algoThief){
        Label cuadro = new Label();
        VistaCiudad vistaCiudad = new VistaCiudad(algoThief, cuadro);

        algoThief.setObservador(vistaCiudad);
        vistaCiudad.actualizar();
        this.setCenter(cuadro);
    }

    private void setVistaOrdenDeArresto(AlgoThief algothief){
        Label ordenDeArresto = new Label();
        VistaOrdenArresto vistaOrden = new VistaOrdenArresto(algothief,ordenDeArresto);
        algothief.setObservador(vistaOrden);
        vistaOrden.actualizar();
        this.setTop(ordenDeArresto);
    }

    private void setBotonera(Stage stage,AlgoThief algoThief,ArrayList<Ciudad> ciudades) throws FileNotFoundException {
        // Carga el icono del boton para buscar sospechosos
        FileInputStream inputBuscar = new FileInputStream("src/imagenes/unknown.png");
        Image imageBuscar = new Image(inputBuscar);
        ImageView imageViewBuscar = new ImageView(imageBuscar);
        // Carga el icono del boton para  buscar pistas en los edificios
        FileInputStream inputPista = new FileInputStream("src/imagenes/clue.png");
        Image imagePista = new Image(inputPista);
        ImageView imageViewPista = new ImageView(imagePista);


        BotonViajar botonViajar= new BotonViajar(ciudades, algoThief);

        Button botonBuscarSospechosos= new Button("",imageViewBuscar);
        botonBuscarSospechosos.setMaxSize(150,150);

        BotonBuscarEventHandler buscarButtonHandler = new BotonBuscarEventHandler(stage,algoThief);
        botonBuscarSospechosos.setOnAction(buscarButtonHandler);

        Button buscarPista = new Button("",imageViewPista);
        buscarPista.setMaxSize(150,150);

        BotonBuscarPistaEventHandler buscarPistaButtonHandler = new BotonBuscarPistaEventHandler(algoThief);
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
