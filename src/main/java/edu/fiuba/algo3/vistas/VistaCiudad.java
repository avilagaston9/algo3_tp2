package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.ObservadorAlgothief;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class VistaCiudad implements ObservadorAlgothief{
    private AlgoThief juego;
    private Label cuadro;

    public VistaCiudad(AlgoThief juego, Label label){
        this.juego = juego;
        this.cuadro = label;
    }
    @Override
    public void actualizar() {

        String nombreCiudad = juego.getNombreCiudadActual();

        this.cuadro.setText(nombreCiudad);
    }
}
