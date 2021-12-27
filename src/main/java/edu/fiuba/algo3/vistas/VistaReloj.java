package edu.fiuba.algo3.vistas;

import clases.AlgoThief;
import clases.CalculadoraDia;
import clases.ObservadorAlgothief;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class VistaReloj implements ObservadorAlgothief {

    private VBox reloj;
    private AlgoThief juego;

    public VistaReloj(AlgoThief juego, VBox reloj){

        this.juego = juego;
        this.reloj = reloj;
    }
    @Override
    public void actualizar() {

        CalculadoraDia calculadoraDia = new CalculadoraDia();
        int  horasTranscurridas = this.juego.tiempoTranscurridoEnHoras();
        int horaDelDia = ((horasTranscurridas + 7)%24);
        String dia = calculadoraDia.calcularDia(horasTranscurridas);
        TextField horaDelDiaText = new TextField((Integer.toString(horaDelDia) + ":00"));
        TextField diaText = new TextField(dia);

        this.reloj.getChildren().removeAll();
        this.reloj.getChildren().addAll(horaDelDiaText, diaText);
    }
}
