package edu.fiuba.algo3.controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ControladorJugar implements EventHandler<ActionEvent> {

    private Button miBoton;
    public ControladorJugar(Button boton){

        this.miBoton = boton;
    }


    @Override
    public void handle(ActionEvent actionEvent) {

        String textoClickeado = "Ha comenzado el juego";
        this.miBoton.setText(textoClickeado);
    }
}
