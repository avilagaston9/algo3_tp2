package edu.fiuba.algo3.contenedores;

import clases.AlgoThief;
import edu.fiuba.algo3.eventos.CaracteristicaEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorHobby extends VBox {

    public ContenedorHobby(Stage stage, AlgoThief algoThief){
        Button tenis = new Button("Tenis");
        Button musica = new Button("Musica");
        Button alpinismo = new Button("Alpinismo");
        Button paracaidismo = new Button("Paracaidismo");
        Button natacion = new Button("Natacion");
        Button croquet = new Button("Croquet");

        CaracteristicaEventHandler tenisHandler = new CaracteristicaEventHandler("le gusta jugar al tenis", algoThief, stage);
        CaracteristicaEventHandler musicaHandler = new CaracteristicaEventHandler("le gusta escuchar musica", algoThief, stage);
        CaracteristicaEventHandler alpinismoHandler = new CaracteristicaEventHandler("le gusta escalar montañas", algoThief, stage);
        CaracteristicaEventHandler paracaidismoHandler = new CaracteristicaEventHandler("le gusta saltar en paracaidas", algoThief, stage);
        CaracteristicaEventHandler natacionHandler = new CaracteristicaEventHandler("le gusta nadar", algoThief, stage);
        CaracteristicaEventHandler croquetHandler = new CaracteristicaEventHandler("le gusta jugar al croquet", algoThief, stage);

        tenis.setOnAction(tenisHandler);
        musica.setOnAction(musicaHandler);
        alpinismo.setOnAction(alpinismoHandler);
        paracaidismo.setOnAction(paracaidismoHandler);
        natacion.setOnAction(natacionHandler);
        croquet.setOnAction(croquetHandler);

        this.getChildren().addAll(tenis,musica,alpinismo,paracaidismo,natacion,croquet);

    }
}
