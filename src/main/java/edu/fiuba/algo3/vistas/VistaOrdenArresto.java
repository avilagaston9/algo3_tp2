package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.Observador;
import javafx.scene.control.Label;

public class VistaOrdenArresto implements Observador {
    private AlgoThief algoThief;
    private Label orden;

    public VistaOrdenArresto(AlgoThief algothief, Label ordenDeArresto) {
        this.algoThief = algothief;
        this.orden = ordenDeArresto;
    }


    @Override
    public void actualizar() {
        String orden = this.algoThief.ladronDeOrdenDeArresto();
        this.orden.setText(orden);


    }
}
