package edu.fiuba.algo3;

import clases.AlgoThief;
import clases.Ciudad;
import clases.InteraccionConArchivos.LectorDeArchivosFachada;
import clases.ladron.Ladron;
import clases.valorObjetoRobado.ObjetoRobado;
import edu.fiuba.algo3.contenedores.ContenedorBienvenidos;
import edu.fiuba.algo3.contenedores.ContenedorPrincipal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {


    private ArrayList<Ciudad> ciudades;
    private ArrayList<Ladron> ladrones;
    private ArrayList<ObjetoRobado> objetosRobados;

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        AlgoThief algothief = this.crearModelo();
        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(stage, algothief, this.ciudades, this.ladrones);


        Scene escenaJuego = new Scene(contenedorPrincipal, 640, 480);


        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(stage, escenaJuego);
        Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640, 480);

        stage.setScene(escenaBienvenidos);
        stage.setFullScreen(true);

        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

    private AlgoThief crearModelo() {

        LectorDeArchivosFachada lectorDeArchivos = new LectorDeArchivosFachada();
        this.ciudades = lectorDeArchivos.obtenerCiudades("ciudadesSinTerminar.json");
        this.ladrones = lectorDeArchivos.obtenerLadrones("dossiers.json");
        this.objetosRobados = lectorDeArchivos.obtenerObjetosRobados("tesoros.json");

        return new AlgoThief(this.ciudades, this.ladrones, this.objetosRobados);
    }
}