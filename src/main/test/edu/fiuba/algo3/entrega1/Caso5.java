package edu.fiuba.algo3.entrega1;

import clases.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caso5 {

    @Test
    public void DetectiveDuerme(){

        //arrange
        Policia policia = new Policia(new Novato(), new Ciudad("Montreal")); // crea tiempo y rango
        //act
        policia.dormir();
        //assert
        assertEquals(8, policia.tiempoTranscurridoEnHoras());
    }
    @Test
    public void DetectiveRecibeHeridaDeCuchillo(){

        //arrange
        Arma cuchillo = new Cuchillo();
        Policia policia = new Policia(new Novato(), new Ciudad("Montreal")); // crea tiempo y rango
        //act
        policia.herirCon(cuchillo);
        //assert
        assertEquals(2, policia.tiempoTranscurridoEnHoras());
    }
}
