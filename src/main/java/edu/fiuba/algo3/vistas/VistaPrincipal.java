package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.Ciudad;
import clases.Observador;
import clases.ladron.Ladron;
import edu.fiuba.algo3.contenedores.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VistaPrincipal implements Observador {

    private final Stage stage;
    private final AlgoThief algothief;

    public VistaPrincipal(Stage stage, AlgoThief algothief, ArrayList<Ciudad> ciudades, ArrayList<Ladron> ladrones) throws FileNotFoundException {

        this.stage = stage;
        this.algothief = algothief;

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, algothief, ciudades, ladrones);
        Scene escenaPrincipal = new Scene(contenedorPrincipal, 640, 480);

        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaPrincipal,algothief);
        Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640, 480);

        stage.setScene(escenaBienvenidos);
        stage.setFullScreen(true);

        stage.show();
    }
    @Override
    public void actualizar() {

        if (!this.algothief.juegoEnCurso()){

            Scene nuevaScene;
            if(this.algothief.juegoGanado()){

                nuevaScene = new Scene(new ContenedorJuegoGanado(this.algothief, this.stage), 640, 480);
            }else if(this.algothief.tiempoInsuficiente()){

                nuevaScene = new Scene(new ContenedorTiempoInsuficiente(this.algothief, this.stage), 640, 480));
            }else{
                nuevaScene = new Scene(new ContenedorSinOrdenDeArresto(this.algothief, this.stage), 640, 480));
            }
            this.stage.setScene(nuevaScene);
        }
    }
}
