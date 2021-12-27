package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.CalculadoraDia;
import clases.ObservadorAlgothief;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class VistaReloj implements ObservadorAlgothief {

    private Label reloj;
    private AlgoThief juego;

    public VistaReloj(AlgoThief juego, Label reloj){

        this.juego = juego;
        this.reloj = reloj;
    }
    @Override
    public void actualizar() {

        CalculadoraDia calculadoraDia = new CalculadoraDia();
        int horasTranscurridas = this.juego.tiempoTranscurridoEnHoras();
        int horaDelDia = ((horasTranscurridas + 7)%24);
        String dia = calculadoraDia.calcularDia(horasTranscurridas);

        this.reloj.setText(Integer.toString(horaDelDia) + ":00\n" + dia);

    }
}
