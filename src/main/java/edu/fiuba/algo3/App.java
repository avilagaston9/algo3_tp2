package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) {

        LayoutInicial layoutInicial = new LayoutInicial(stage);

        //AlgoThief juego = new Algothief();

        Scene sceneInicio = new Scene(layoutInicial);

        stage.setScene(sceneInicio);
        stage.setMinWidth(640);
        stage.setMinHeight(480);
        stage.setTitle("AlgoThief");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}